package com.zero.hjy.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 选择数据源，返回该数据源的connection
 * 1. 加载自定义的主配置数据源
 * 2. 创建数据源的会话工厂和连接
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@MapperScan(value = PrimaryDataBaseConfig.PACKAGE, sqlSessionFactoryRef = "primarySqlSessionFactory")
public class PrimaryDataBaseConfig {

    /**
     * 配置包路径
     */
    static final String PACKAGE = "com.zero.hjy.dao.**";
    /**
     * xml相对路径
     */
    private static final String MAPPER_LOCATION = "classpath*:mapper/*.xml";
    /**
     * 配置数据源属性
     */
    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private String filters;

    /**
     * @Primary 配置主数据源
     * @return
     */
    @Primary
    @Bean(value = "primaryDataSource")
    public DataSource primaryDataSource() throws SQLException {

        // 获取druidDataSource
        DruidDataSource druid = new DruidDataSource();
        // 监控拦截的fiter
//        druid.setFilters(filters);
        // 配置基本属性
        druid.setUrl(url);
        druid.setUsername(username);
        druid.setPassword(password);
        druid.setDriverClassName(driverClassName);

        return druid;
    }

    /**
     * 创建事务
     * @return
     * @throws SQLException
     */
    @Bean(value = "primaryTransactionManager")
    public DataSourceTransactionManager primaryTransationManager() throws SQLException {
        return new DataSourceTransactionManager(primaryDataSource());
    }

    @Bean(value = "primarySqlSessionFactory")
    public SqlSessionFactory primarySqlSessionFactory(@Qualifier("primaryDataSource") DataSource primaryDataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(primaryDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(PrimaryDataBaseConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }

}

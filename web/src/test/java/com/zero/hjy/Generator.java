package com.zero.hjy;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

public class Generator {

    DataSourceConfig getSource() {
        DataSourceConfig dataSource = new DataSourceConfig();
        dataSource.setDriverName("com.mysql.cj.jdbc.Driver").setUrl("jdbc:mysql://localhost:3306/hjy?serverTimezone=UTC")
                .setUsername("root").setPassword("root");

        return dataSource;
    }

//    @Test
    public void test() {
        AutoGenerator autoGenerator = new AutoGenerator();
        //全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setAuthor("ZERO")
                .setOutputDir("W:\\hejiayun\\CommubityCoud\\residential\\src\\main\\java")//设置输出路径
                .setFileOverride(true)//设置文件覆盖
                .setIdType(IdType.AUTO)//设置主键生成策略
                .setBaseResultMap(true)//基本结果集合
                .setBaseColumnList(true)//设置基本的列
                .setOpen(false)
                .setServiceName("%sService")//service接口的名称
                .setControllerName("%sController")
                .setXmlName("%sMappeing").setMapperName("%sMappe")
                .setServiceImplName("%sImpl");

        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true)//设置全局大写命名
                .setNaming(NamingStrategy.underline_to_camel)//数据库表映射到实体的命名策略
//                .setColumnNaming(NamingStrategy.underline_to_camel)
                .setTablePrefix("tab_") // 去掉表前缀
                .setEntityLombokModel(true) // 生成get set
//                .setEntityBuilderModel(false) //
                .setRestControllerStyle(true) // @RestController
                .setInclude("tab_room"); // 生成指定表,默认全部

        //包名配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.zero.hjy").setMapper("dao")
                .setService("service").setController("controller")
                .setEntity("entity").setServiceImpl("service.impl").setXml("mapper");

        autoGenerator.setGlobalConfig(globalConfig).setDataSource(getSource())
                .setStrategy(strategyConfig).setPackageInfo(packageConfig);

        autoGenerator.execute();

    }
}

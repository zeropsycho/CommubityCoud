package com.zero.hjy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ZERO
 * @since 2020-09-03
 */
public class Module implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private Long makeNo;

    public Module() {
    }

    public Module(Long id, String name, Long makeNo) {
        this.id = id;
        this.name = name;
        this.makeNo = makeNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMakeNo() {
        return makeNo;
    }

    public void setMakeNo(Long makeNo) {
        this.makeNo = makeNo;
    }
}

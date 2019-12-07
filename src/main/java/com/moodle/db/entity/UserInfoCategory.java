package com.moodle.db.entity;

import java.math.BigDecimal;
import javax.persistence.*;

/**
 *   自定义字段类别信息表
 *
 * 该类是通过 MyBatis Generator自动生成.
 * 数据库表名为： MDL_USER_INFO_CATEGORY
 *
 * @mbg.generated do_not_delete_during_merge 2019-10-11 14:41:15
 */
@Table(name = "MDL_USER_INFO_CATEGORY")
public class UserInfoCategory extends BaseEntity {
    /**
     * id ID
     */
    @Column(name = "ID",nullable = false)
    private BigDecimal id;

    /**
     * 类别名称 NAME
     */
    @Column(name = "NAME",nullable = false)
    private String name;

    /**
     * 排序顺序 SORTORDER
     */
    @Column(name = "SORTORDER",nullable = false)
    private BigDecimal sortorder;

    /**
     * 获取id
     * @author Administrator
     * @return ID id
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * 设置id
     * @author Administrator
     * @param id id
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * 获取类别名称
     * @author Administrator
     * @return NAME 类别名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置类别名称
     * @author Administrator
     * @param name 类别名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取排序顺序
     * @author Administrator
     * @return SORTORDER 排序顺序
     */
    public BigDecimal getSortorder() {
        return sortorder;
    }

    /**
     * 设置排序顺序
     * @author Administrator
     * @param sortorder 排序顺序
     */
    public void setSortorder(BigDecimal sortorder) {
        this.sortorder = sortorder;
    }
}
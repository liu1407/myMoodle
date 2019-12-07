package com.moodle.db.entity;

import java.math.BigDecimal;
import javax.persistence.*;

/**
 *   注册用户信息表
 *
 * 该类是通过 MyBatis Generator自动生成.
 * 数据库表名为： MDL_USER_ENROLMENTS
 *
 * @mbg.generated do_not_delete_during_merge 2019-10-11 14:41:15
 */
@Table(name = "MDL_USER_ENROLMENTS")
public class UserEnrolments extends BaseEntity {
    /**
     * id ID
     */
    @Column(name = "ID",nullable = false)
    private BigDecimal id;

    /**
     * 状态 STATUS
     */
    @Column(name = "STATUS",nullable = false)
    private BigDecimal status;

    /**
     * 选课id ENROL_ID
     */
    @Column(name = "ENROL_ID",nullable = false)
    private BigDecimal enrolId;

    /**
     * 用户id USER_ID
     */
    @Column(name = "USER_ID",nullable = false)
    private BigDecimal userId;

    /**
     * 开始时间 TIME_START
     */
    @Column(name = "TIME_START",nullable = false)
    private BigDecimal timeStart;

    /**
     * 结束时间 TIME_END
     */
    @Column(name = "TIME_END",nullable = false)
    private BigDecimal timeEnd;

    /**
     * 修改者id MODIFIER_ID
     */
    @Column(name = "MODIFIER_ID",nullable = false)
    private BigDecimal modifierId;

    /**
     * 创建时间 TIME_CREATED
     */
    @Column(name = "TIME_CREATED",nullable = false)
    private BigDecimal timeCreated;

    /**
     * 修改时间 TIME_MODIFIED
     */
    @Column(name = "TIME_MODIFIED",nullable = false)
    private BigDecimal timeModified;

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
     * 获取状态
     * @author Administrator
     * @return STATUS 状态
     */
    public BigDecimal getStatus() {
        return status;
    }

    /**
     * 设置状态
     * @author Administrator
     * @param status 状态
     */
    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    /**
     * 获取选课id
     * @author Administrator
     * @return ENROL_ID 选课id
     */
    public BigDecimal getEnrolId() {
        return enrolId;
    }

    /**
     * 设置选课id
     * @author Administrator
     * @param enrolId 选课id
     */
    public void setEnrolId(BigDecimal enrolId) {
        this.enrolId = enrolId;
    }

    /**
     * 获取用户id
     * @author Administrator
     * @return USER_ID 用户id
     */
    public BigDecimal getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     * @author Administrator
     * @param userId 用户id
     */
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    /**
     * 获取开始时间
     * @author Administrator
     * @return TIME_START 开始时间
     */
    public BigDecimal getTimeStart() {
        return timeStart;
    }

    /**
     * 设置开始时间
     * @author Administrator
     * @param timeStart 开始时间
     */
    public void setTimeStart(BigDecimal timeStart) {
        this.timeStart = timeStart;
    }

    /**
     * 获取结束时间
     * @author Administrator
     * @return TIME_END 结束时间
     */
    public BigDecimal getTimeEnd() {
        return timeEnd;
    }

    /**
     * 设置结束时间
     * @author Administrator
     * @param timeEnd 结束时间
     */
    public void setTimeEnd(BigDecimal timeEnd) {
        this.timeEnd = timeEnd;
    }

    /**
     * 获取修改者id
     * @author Administrator
     * @return MODIFIER_ID 修改者id
     */
    public BigDecimal getModifierId() {
        return modifierId;
    }

    /**
     * 设置修改者id
     * @author Administrator
     * @param modifierId 修改者id
     */
    public void setModifierId(BigDecimal modifierId) {
        this.modifierId = modifierId;
    }

    /**
     * 获取创建时间
     * @author Administrator
     * @return TIME_CREATED 创建时间
     */
    public BigDecimal getTimeCreated() {
        return timeCreated;
    }

    /**
     * 设置创建时间
     * @author Administrator
     * @param timeCreated 创建时间
     */
    public void setTimeCreated(BigDecimal timeCreated) {
        this.timeCreated = timeCreated;
    }

    /**
     * 获取修改时间
     * @author Administrator
     * @return TIME_MODIFIED 修改时间
     */
    public BigDecimal getTimeModified() {
        return timeModified;
    }

    /**
     * 设置修改时间
     * @author Administrator
     * @param timeModified 修改时间
     */
    public void setTimeModified(BigDecimal timeModified) {
        this.timeModified = timeModified;
    }
}
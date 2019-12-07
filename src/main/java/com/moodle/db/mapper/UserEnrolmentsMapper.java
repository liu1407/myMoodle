package com.moodle.db.mapper;

import com.moodle.db.entity.UserEnrolments;
import java.math.BigDecimal;

public interface UserEnrolmentsMapper {
    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    int insert(UserEnrolments record);

    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    int insertSelective(UserEnrolments record);

    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    UserEnrolments selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    int updateByPrimaryKeySelective(UserEnrolments record);

    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    int updateByPrimaryKey(UserEnrolments record);
}
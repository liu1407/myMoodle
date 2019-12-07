package com.moodle.db.mapper;

import com.moodle.db.entity.User;
import java.math.BigDecimal;

public interface UserMapper {
    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    int insert(User record);

    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    User selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    int updateByPrimaryKey(User record);
    
    User selectByUserName(User record);
}
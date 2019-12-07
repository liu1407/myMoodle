package com.moodle.db.mapper;

import com.moodle.db.entity.UserInfoCategory;
import java.math.BigDecimal;

public interface UserInfoCategoryMapper {
    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    int insert(UserInfoCategory record);

    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    int insertSelective(UserInfoCategory record);

    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    UserInfoCategory selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    int updateByPrimaryKeySelective(UserInfoCategory record);

    /**
     *
     * @mbg.generated 2019-10-11 14:41:15
     */
    int updateByPrimaryKey(UserInfoCategory record);
}
package com.poc.db.mapper;

import com.poc.db.entity.CardInfo;

public interface CardInfoMapper {
    /**
     *
     * @mbg.generated 2020-05-30 17:40:25
     */
    int deleteByPrimaryKey(String cardNo);

    /**
     *
     * @mbg.generated 2020-05-30 17:40:25
     */
    int insert(CardInfo record);

    /**
     *
     * @mbg.generated 2020-05-30 17:40:25
     */
    int insertSelective(CardInfo record);

    /**
     *
     * @mbg.generated 2020-05-30 17:40:25
     */
    CardInfo selectByPrimaryKey(String cardNo);

    /**
     *
     * @mbg.generated 2020-05-30 17:40:25
     */
    int updateByPrimaryKeySelective(CardInfo record);

    /**
     *
     * @mbg.generated 2020-05-30 17:40:25
     */
    int updateByPrimaryKey(CardInfo record);
}
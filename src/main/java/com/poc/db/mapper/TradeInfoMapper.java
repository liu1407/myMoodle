package com.poc.db.mapper;

import com.poc.db.entity.TradeInfo;

public interface TradeInfoMapper {
    /**
     *
     * @mbg.generated 2020-05-30 17:38:42
     */
    int deleteByPrimaryKey(String serlNo);

    /**
     *
     * @mbg.generated 2020-05-30 17:38:42
     */
    int insert(TradeInfo record);

    /**
     *
     * @mbg.generated 2020-05-30 17:38:42
     */
    int insertSelective(TradeInfo record);

    /**
     *
     * @mbg.generated 2020-05-30 17:38:42
     */
    TradeInfo selectByPrimaryKey(String serlNo);

    /**
     *
     * @mbg.generated 2020-05-30 17:38:42
     */
    int updateByPrimaryKeySelective(TradeInfo record);

    /**
     *
     * @mbg.generated 2020-05-30 17:38:42
     */
    int updateByPrimaryKey(TradeInfo record);
}
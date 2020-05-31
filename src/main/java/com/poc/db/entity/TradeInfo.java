package com.poc.db.entity;

import java.math.BigDecimal;
import javax.persistence.*;

/**
 *   交易信息
 *
 * 该类是通过 MyBatis Generator自动生成.
 * 数据库表名为： TRADE_INFO
 *
 * @mbg.generated do_not_delete_during_merge 2020-05-30 17:38:42
 */
@Table(name = "TRADE_INFO")
public class TradeInfo extends BaseEntity {
    /**
     * 流水号 SERL_NO
     */
    @Column(name = "SERL_NO",nullable = false)
    private String serlNo;

    /**
     * 卡号 CARD_NO
     */
    @Column(name = "CARD_NO",nullable = false)
    private String cardNo;

    /**
     * 交易金额 AMONT
     */
    @Column(name = "AMONT",nullable = false)
    private BigDecimal amont;

    /**
     * 交易日期 TRADE_DATE
     */
    @Column(name = "TRADE_DATE",nullable = true)
    private String tradeDate;

    /**
     * 交易时间 TRADE_TIME
     */
    @Column(name = "TRADE_TIME",nullable = true)
    private String tradeTime;

    /**
     * 交易码 TRADE_CODE
     */
    @Column(name = "TRADE_CODE",nullable = false)
    private String tradeCode;

    /**
     * 交易状态 TRADE_STATUS_FLAG
     */
    @Column(name = "TRADE_STATUS_FLAG",nullable = false)
    private String tradeStatusFlag;

    /**
     * 描述 DESCR
     */
    @Column(name = "DESCR",nullable = true)
    private String descr;

    /**
     * 交易类型 TRADE_TYPE
     */
    @Column(name = "TRADE_TYPE",nullable = true)
    private String tradeType;

    /**
     * 获取流水号
     * @author Administrator
     * @return SERL_NO 流水号
     */
    public String getSerlNo() {
        return serlNo;
    }

    /**
     * 设置流水号
     * @author Administrator
     * @param serlNo 流水号
     */
    public void setSerlNo(String serlNo) {
        this.serlNo = serlNo == null ? null : serlNo.trim();
    }

    /**
     * 获取卡号
     * @author Administrator
     * @return CARD_NO 卡号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置卡号
     * @author Administrator
     * @param cardNo 卡号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * 获取交易金额
     * @author Administrator
     * @return AMONT 交易金额
     */
    public BigDecimal getAmont() {
        return amont;
    }

    /**
     * 设置交易金额
     * @author Administrator
     * @param amont 交易金额
     */
    public void setAmont(BigDecimal amont) {
        this.amont = amont;
    }

    /**
     * 获取交易日期
     * @author Administrator
     * @return TRADE_DATE 交易日期
     */
    public String getTradeDate() {
        return tradeDate;
    }

    /**
     * 设置交易日期
     * @author Administrator
     * @param tradeDate 交易日期
     */
    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate == null ? null : tradeDate.trim();
    }

    /**
     * 获取交易时间
     * @author Administrator
     * @return TRADE_TIME 交易时间
     */
    public String getTradeTime() {
        return tradeTime;
    }

    /**
     * 设置交易时间
     * @author Administrator
     * @param tradeTime 交易时间
     */
    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime == null ? null : tradeTime.trim();
    }

    /**
     * 获取交易码
     * @author Administrator
     * @return TRADE_CODE 交易码
     */
    public String getTradeCode() {
        return tradeCode;
    }

    /**
     * 设置交易码
     * @author Administrator
     * @param tradeCode 交易码
     */
    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode == null ? null : tradeCode.trim();
    }

    /**
     * 获取交易状态
     * @author Administrator
     * @return TRADE_STATUS_FLAG 交易状态
     */
    public String getTradeStatusFlag() {
        return tradeStatusFlag;
    }

    /**
     * 设置交易状态
     * @author Administrator
     * @param tradeStatusFlag 交易状态
     */
    public void setTradeStatusFlag(String tradeStatusFlag) {
        this.tradeStatusFlag = tradeStatusFlag == null ? null : tradeStatusFlag.trim();
    }

    /**
     * 获取描述
     * @author Administrator
     * @return DESCR 描述
     */
    public String getDescr() {
        return descr;
    }

    /**
     * 设置描述
     * @author Administrator
     * @param descr 描述
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * 获取交易类型
     * @author Administrator
     * @return TRADE_TYPE 交易类型
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * 设置交易类型
     * @author Administrator
     * @param tradeType 交易类型
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }
}
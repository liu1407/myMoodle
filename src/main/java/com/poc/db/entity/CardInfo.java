package com.poc.db.entity;

import java.math.BigDecimal;
import javax.persistence.*;

/**
 *   卡片信息
 *
 * 该类是通过 MyBatis Generator自动生成.
 * 数据库表名为： CARD_INFO
 *
 * @mbg.generated do_not_delete_during_merge 2020-05-30 17:40:25
 */
@Table(name = "CARD_INFO")
public class CardInfo extends BaseEntity {
    /**
     * 卡号 CARD_NO
     */
    @Column(name = "CARD_NO",nullable = false)
    private String cardNo;

    /**
     * 用户名 USER_NAME
     */
    @Column(name = "USER_NAME",nullable = true)
    private String userName;

    /**
     * 固定额度 TOTAL_CRLMT
     */
    @Column(name = "TOTAL_CRLMT",nullable = true)
    private BigDecimal totalCrlmt;

    /**
     * 剩余额度 REMAIN_CRLMT
     */
    @Column(name = "REMAIN_CRLMT",nullable = true)
    private BigDecimal remainCrlmt;

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
     * 获取用户名
     * @author Administrator
     * @return USER_NAME 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     * @author Administrator
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取固定额度
     * @author Administrator
     * @return TOTAL_CRLMT 固定额度
     */
    public BigDecimal getTotalCrlmt() {
        return totalCrlmt;
    }

    /**
     * 设置固定额度
     * @author Administrator
     * @param totalCrlmt 固定额度
     */
    public void setTotalCrlmt(BigDecimal totalCrlmt) {
        this.totalCrlmt = totalCrlmt;
    }

    /**
     * 获取剩余额度
     * @author Administrator
     * @return REMAIN_CRLMT 剩余额度
     */
    public BigDecimal getRemainCrlmt() {
        return remainCrlmt;
    }

    /**
     * 设置剩余额度
     * @author Administrator
     * @param remainCrlmt 剩余额度
     */
    public void setRemainCrlmt(BigDecimal remainCrlmt) {
        this.remainCrlmt = remainCrlmt;
    }
}
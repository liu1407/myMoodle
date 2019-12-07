package com.moodle.db.entity;

import java.math.BigDecimal;
import javax.persistence.*;

/**
 *   用户信息表
 *
 * 该类是通过 MyBatis Generator自动生成.
 * 数据库表名为： MDL_USER
 *
 * @mbg.generated do_not_delete_during_merge 2019-10-11 14:41:15
 */
@Table(name = "MDL_USER")
public class User extends BaseEntity {
    /**
     * 用户id ID
     */
    @Column(name = "ID",nullable = false)
    private BigDecimal id;

    /**
     * 认证方式 AUTH
     */
    @Column(name = "AUTH",nullable = false)
    private String auth;

    /**
     * 是否确认 CONFIRMED
     */
    @Column(name = "CONFIRMED",nullable = false)
    private Integer confirmed;

    /**
     * 是否同意此协议 POLICY_AGREED
     */
    @Column(name = "POLICY_AGREED",nullable = false)
    private Integer policyAgreed;

    /**
     * 被删除的 DELETED
     */
    @Column(name = "DELETED",nullable = false)
    private Integer deleted;

    /**
     * 被暂停的 SUSPENDED
     */
    @Column(name = "SUSPENDED",nullable = false)
    private Integer suspended;

    /**
     * mdl_mnet_host的 id MNET_HOST_ID
     */
    @Column(name = "MNET_HOST_ID",nullable = false)
    private BigDecimal mnetHostId;

    /**
     * 用户名 USER_NAME
     */
    @Column(name = "USER_NAME",nullable = false)
    private String userName;

    /**
     * 密码 PASSWORD
     */
    @Column(name = "PASSWORD",nullable = false)
    private String password;

    /**
     * 学号 ID_NUMBER
     */
    @Column(name = "ID_NUMBER",nullable = false)
    private String idNumber;

    /**
     * 名字 FIRST_NAME
     */
    @Column(name = "FIRST_NAME",nullable = false)
    private String firstName;

    /**
     * 姓 LAST_NAME
     */
    @Column(name = "LAST_NAME",nullable = false)
    private String lastName;

    /**
     * email EMAIL
     */
    @Column(name = "EMAIL",nullable = false)
    private String email;

    /**
     * email不工作 EMAIL_STOP
     */
    @Column(name = "EMAIL_STOP",nullable = false)
    private Integer emailStop;

    /**
     * ICQ号码 ICQ
     */
    @Column(name = "ICQ",nullable = false)
    private String icq;

    /**
     * Skype号码 SKYPE
     */
    @Column(name = "SKYPE",nullable = false)
    private String skype;

    /**
     * Yahoo号码 YAHOO
     */
    @Column(name = "YAHOO",nullable = false)
    private String yahoo;

    /**
     * AIM号码 AIM
     */
    @Column(name = "AIM",nullable = false)
    private String aim;

    /**
     * MSN号码 MSN
     */
    @Column(name = "MSN",nullable = false)
    private String msn;

    /**
     * 电话 PHONE1
     */
    @Column(name = "PHONE1",nullable = false)
    private String phone1;

    /**
     * 手机 PHONE2
     */
    @Column(name = "PHONE2",nullable = false)
    private String phone2;

    /**
     * 机构 INSTITUTION
     */
    @Column(name = "INSTITUTION",nullable = false)
    private String institution;

    /**
     * 性别 DEPARTMENT
     */
    @Column(name = "DEPARTMENT",nullable = false)
    private String department;

    /**
     * 地址 ADDRESS
     */
    @Column(name = "ADDRESS",nullable = false)
    private String address;

    /**
     * 城市 CITY
     */
    @Column(name = "CITY",nullable = false)
    private String city;

    /**
     * 国家 COUNTRY
     */
    @Column(name = "COUNTRY",nullable = false)
    private String country;

    /**
     * 语言 LANG
     */
    @Column(name = "LANG",nullable = false)
    private String lang;

    /**
     * 主题 THEME
     */
    @Column(name = "THEME",nullable = false)
    private String theme;

    /**
     * 时区 TIME_ZONE
     */
    @Column(name = "TIME_ZONE",nullable = false)
    private String timeZone;

    /**
     * 首次访问 FIRST_ACCESS
     */
    @Column(name = "FIRST_ACCESS",nullable = false)
    private BigDecimal firstAccess;

    /**
     * 最后一次访问 LAST_ACCESS
     */
    @Column(name = "LAST_ACCESS",nullable = false)
    private BigDecimal lastAccess;

    /**
     * 上一次登入 LAST_LOGIN
     */
    @Column(name = "LAST_LOGIN",nullable = false)
    private BigDecimal lastLogin;

    /**
     * 当前登入 CURRENT_LOGIN
     */
    @Column(name = "CURRENT_LOGIN",nullable = false)
    private BigDecimal currentLogin;

    /**
     * 最后一次登入的IP LAST_IP
     */
    @Column(name = "LAST_IP",nullable = false)
    private String lastIp;

    /**
     * 秘密 SECRET
     */
    @Column(name = "SECRET",nullable = false)
    private String secret;

    /**
     * 头像 PICTURE
     */
    @Column(name = "PICTURE",nullable = false)
    private BigDecimal picture;

    /**
     * 网页 URL
     */
    @Column(name = "URL",nullable = false)
    private String url;

    /**
     * 描述 DESCRIPTION
     */
    @Column(name = "DESCRIPTION",nullable = true)
    private String description;

    /**
     * 描述的格式 DESCRIPTION_FORMAT
     */
    @Column(name = "DESCRIPTION_FORMAT",nullable = false)
    private Integer descriptionFormat;

    /**
     * email格式 MAIL_FORMAT
     */
    @Column(name = "MAIL_FORMAT",nullable = false)
    private Integer mailFormat;

    /**
     * email摘要类型 MAIL_DIGEST
     */
    @Column(name = "MAIL_DIGEST",nullable = false)
    private Integer mailDigest;

    /**
     * email显示对象 MAIL_DISPLAY
     */
    @Column(name = "MAIL_DISPLAY",nullable = false)
    private Integer mailDisplay;

    /**
     * 使用html编辑器 HTML_EDITOR
     */
    @Column(name = "HTML_EDITOR",nullable = false)
    private Integer htmlEditor;

    /**
     * 讨论区自动订阅 AUTO_SUBSCRIBE
     */
    @Column(name = "AUTO_SUBSCRIBE",nullable = false)
    private Integer autoSubscribe;

    /**
     * 跟踪讨论区 TRACK_FORUMS
     */
    @Column(name = "TRACK_FORUMS",nullable = false)
    private Integer trackForums;

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
     * trustbitmask TRUST_BITMASK
     */
    @Column(name = "TRUST_BITMASK",nullable = false)
    private BigDecimal trustBitmask;

    /**
     * 头像说明 IMAGE_ALT
     */
    @Column(name = "IMAGE_ALT",nullable = true)
    private String imageAlt;

    /**
     * 屏幕阅读 SCREEN_READER
     */
    @Column(name = "SCREEN_READER",nullable = false)
    private Integer screenReader;

    /**
     * 获取用户id
     * @author Administrator
     * @return ID 用户id
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * 设置用户id
     * @author Administrator
     * @param id 用户id
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * 获取认证方式
     * @author Administrator
     * @return AUTH 认证方式
     */
    public String getAuth() {
        return auth;
    }

    /**
     * 设置认证方式
     * @author Administrator
     * @param auth 认证方式
     */
    public void setAuth(String auth) {
        this.auth = auth == null ? null : auth.trim();
    }

    /**
     * 获取是否确认
     * @author Administrator
     * @return CONFIRMED 是否确认
     */
    public Integer getConfirmed() {
        return confirmed;
    }

    /**
     * 设置是否确认
     * @author Administrator
     * @param confirmed 是否确认
     */
    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    /**
     * 获取是否同意此协议
     * @author Administrator
     * @return POLICY_AGREED 是否同意此协议
     */
    public Integer getPolicyAgreed() {
        return policyAgreed;
    }

    /**
     * 设置是否同意此协议
     * @author Administrator
     * @param policyAgreed 是否同意此协议
     */
    public void setPolicyAgreed(Integer policyAgreed) {
        this.policyAgreed = policyAgreed;
    }

    /**
     * 获取被删除的
     * @author Administrator
     * @return DELETED 被删除的
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置被删除的
     * @author Administrator
     * @param deleted 被删除的
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取被暂停的
     * @author Administrator
     * @return SUSPENDED 被暂停的
     */
    public Integer getSuspended() {
        return suspended;
    }

    /**
     * 设置被暂停的
     * @author Administrator
     * @param suspended 被暂停的
     */
    public void setSuspended(Integer suspended) {
        this.suspended = suspended;
    }

    /**
     * 获取mdl_mnet_host的 id
     * @author Administrator
     * @return MNET_HOST_ID mdl_mnet_host的 id
     */
    public BigDecimal getMnetHostId() {
        return mnetHostId;
    }

    /**
     * 设置mdl_mnet_host的 id
     * @author Administrator
     * @param mnetHostId mdl_mnet_host的 id
     */
    public void setMnetHostId(BigDecimal mnetHostId) {
        this.mnetHostId = mnetHostId;
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
     * 获取密码
     * @author Administrator
     * @return PASSWORD 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     * @author Administrator
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取学号
     * @author Administrator
     * @return ID_NUMBER 学号
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 设置学号
     * @author Administrator
     * @param idNumber 学号
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    /**
     * 获取名字
     * @author Administrator
     * @return FIRST_NAME 名字
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 设置名字
     * @author Administrator
     * @param firstName 名字
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * 获取姓
     * @author Administrator
     * @return LAST_NAME 姓
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 设置姓
     * @author Administrator
     * @param lastName 姓
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * 获取email
     * @author Administrator
     * @return EMAIL email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email
     * @author Administrator
     * @param email email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取email不工作
     * @author Administrator
     * @return EMAIL_STOP email不工作
     */
    public Integer getEmailStop() {
        return emailStop;
    }

    /**
     * 设置email不工作
     * @author Administrator
     * @param emailStop email不工作
     */
    public void setEmailStop(Integer emailStop) {
        this.emailStop = emailStop;
    }

    /**
     * 获取ICQ号码
     * @author Administrator
     * @return ICQ ICQ号码
     */
    public String getIcq() {
        return icq;
    }

    /**
     * 设置ICQ号码
     * @author Administrator
     * @param icq ICQ号码
     */
    public void setIcq(String icq) {
        this.icq = icq == null ? null : icq.trim();
    }

    /**
     * 获取Skype号码
     * @author Administrator
     * @return SKYPE Skype号码
     */
    public String getSkype() {
        return skype;
    }

    /**
     * 设置Skype号码
     * @author Administrator
     * @param skype Skype号码
     */
    public void setSkype(String skype) {
        this.skype = skype == null ? null : skype.trim();
    }

    /**
     * 获取Yahoo号码
     * @author Administrator
     * @return YAHOO Yahoo号码
     */
    public String getYahoo() {
        return yahoo;
    }

    /**
     * 设置Yahoo号码
     * @author Administrator
     * @param yahoo Yahoo号码
     */
    public void setYahoo(String yahoo) {
        this.yahoo = yahoo == null ? null : yahoo.trim();
    }

    /**
     * 获取AIM号码
     * @author Administrator
     * @return AIM AIM号码
     */
    public String getAim() {
        return aim;
    }

    /**
     * 设置AIM号码
     * @author Administrator
     * @param aim AIM号码
     */
    public void setAim(String aim) {
        this.aim = aim == null ? null : aim.trim();
    }

    /**
     * 获取MSN号码
     * @author Administrator
     * @return MSN MSN号码
     */
    public String getMsn() {
        return msn;
    }

    /**
     * 设置MSN号码
     * @author Administrator
     * @param msn MSN号码
     */
    public void setMsn(String msn) {
        this.msn = msn == null ? null : msn.trim();
    }

    /**
     * 获取电话
     * @author Administrator
     * @return PHONE1 电话
     */
    public String getPhone1() {
        return phone1;
    }

    /**
     * 设置电话
     * @author Administrator
     * @param phone1 电话
     */
    public void setPhone1(String phone1) {
        this.phone1 = phone1 == null ? null : phone1.trim();
    }

    /**
     * 获取手机
     * @author Administrator
     * @return PHONE2 手机
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * 设置手机
     * @author Administrator
     * @param phone2 手机
     */
    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
    }

    /**
     * 获取机构
     * @author Administrator
     * @return INSTITUTION 机构
     */
    public String getInstitution() {
        return institution;
    }

    /**
     * 设置机构
     * @author Administrator
     * @param institution 机构
     */
    public void setInstitution(String institution) {
        this.institution = institution == null ? null : institution.trim();
    }

    /**
     * 获取性别
     * @author Administrator
     * @return DEPARTMENT 性别
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置性别
     * @author Administrator
     * @param department 性别
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * 获取地址
     * @author Administrator
     * @return ADDRESS 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     * @author Administrator
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取城市
     * @author Administrator
     * @return CITY 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     * @author Administrator
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取国家
     * @author Administrator
     * @return COUNTRY 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     * @author Administrator
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 获取语言
     * @author Administrator
     * @return LANG 语言
     */
    public String getLang() {
        return lang;
    }

    /**
     * 设置语言
     * @author Administrator
     * @param lang 语言
     */
    public void setLang(String lang) {
        this.lang = lang == null ? null : lang.trim();
    }

    /**
     * 获取主题
     * @author Administrator
     * @return THEME 主题
     */
    public String getTheme() {
        return theme;
    }

    /**
     * 设置主题
     * @author Administrator
     * @param theme 主题
     */
    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    /**
     * 获取时区
     * @author Administrator
     * @return TIME_ZONE 时区
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * 设置时区
     * @author Administrator
     * @param timeZone 时区
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone == null ? null : timeZone.trim();
    }

    /**
     * 获取首次访问
     * @author Administrator
     * @return FIRST_ACCESS 首次访问
     */
    public BigDecimal getFirstAccess() {
        return firstAccess;
    }

    /**
     * 设置首次访问
     * @author Administrator
     * @param firstAccess 首次访问
     */
    public void setFirstAccess(BigDecimal firstAccess) {
        this.firstAccess = firstAccess;
    }

    /**
     * 获取最后一次访问
     * @author Administrator
     * @return LAST_ACCESS 最后一次访问
     */
    public BigDecimal getLastAccess() {
        return lastAccess;
    }

    /**
     * 设置最后一次访问
     * @author Administrator
     * @param lastAccess 最后一次访问
     */
    public void setLastAccess(BigDecimal lastAccess) {
        this.lastAccess = lastAccess;
    }

    /**
     * 获取上一次登入
     * @author Administrator
     * @return LAST_LOGIN 上一次登入
     */
    public BigDecimal getLastLogin() {
        return lastLogin;
    }

    /**
     * 设置上一次登入
     * @author Administrator
     * @param lastLogin 上一次登入
     */
    public void setLastLogin(BigDecimal lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * 获取当前登入
     * @author Administrator
     * @return CURRENT_LOGIN 当前登入
     */
    public BigDecimal getCurrentLogin() {
        return currentLogin;
    }

    /**
     * 设置当前登入
     * @author Administrator
     * @param currentLogin 当前登入
     */
    public void setCurrentLogin(BigDecimal currentLogin) {
        this.currentLogin = currentLogin;
    }

    /**
     * 获取最后一次登入的IP
     * @author Administrator
     * @return LAST_IP 最后一次登入的IP
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * 设置最后一次登入的IP
     * @author Administrator
     * @param lastIp 最后一次登入的IP
     */
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    /**
     * 获取秘密
     * @author Administrator
     * @return SECRET 秘密
     */
    public String getSecret() {
        return secret;
    }

    /**
     * 设置秘密
     * @author Administrator
     * @param secret 秘密
     */
    public void setSecret(String secret) {
        this.secret = secret == null ? null : secret.trim();
    }

    /**
     * 获取头像
     * @author Administrator
     * @return PICTURE 头像
     */
    public BigDecimal getPicture() {
        return picture;
    }

    /**
     * 设置头像
     * @author Administrator
     * @param picture 头像
     */
    public void setPicture(BigDecimal picture) {
        this.picture = picture;
    }

    /**
     * 获取网页
     * @author Administrator
     * @return URL 网页
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置网页
     * @author Administrator
     * @param url 网页
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取描述
     * @author Administrator
     * @return DESCRIPTION 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     * @author Administrator
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取描述的格式
     * @author Administrator
     * @return DESCRIPTION_FORMAT 描述的格式
     */
    public Integer getDescriptionFormat() {
        return descriptionFormat;
    }

    /**
     * 设置描述的格式
     * @author Administrator
     * @param descriptionFormat 描述的格式
     */
    public void setDescriptionFormat(Integer descriptionFormat) {
        this.descriptionFormat = descriptionFormat;
    }

    /**
     * 获取email格式
     * @author Administrator
     * @return MAIL_FORMAT email格式
     */
    public Integer getMailFormat() {
        return mailFormat;
    }

    /**
     * 设置email格式
     * @author Administrator
     * @param mailFormat email格式
     */
    public void setMailFormat(Integer mailFormat) {
        this.mailFormat = mailFormat;
    }

    /**
     * 获取email摘要类型
     * @author Administrator
     * @return MAIL_DIGEST email摘要类型
     */
    public Integer getMailDigest() {
        return mailDigest;
    }

    /**
     * 设置email摘要类型
     * @author Administrator
     * @param mailDigest email摘要类型
     */
    public void setMailDigest(Integer mailDigest) {
        this.mailDigest = mailDigest;
    }

    /**
     * 获取email显示对象
     * @author Administrator
     * @return MAIL_DISPLAY email显示对象
     */
    public Integer getMailDisplay() {
        return mailDisplay;
    }

    /**
     * 设置email显示对象
     * @author Administrator
     * @param mailDisplay email显示对象
     */
    public void setMailDisplay(Integer mailDisplay) {
        this.mailDisplay = mailDisplay;
    }

    /**
     * 获取使用html编辑器
     * @author Administrator
     * @return HTML_EDITOR 使用html编辑器
     */
    public Integer getHtmlEditor() {
        return htmlEditor;
    }

    /**
     * 设置使用html编辑器
     * @author Administrator
     * @param htmlEditor 使用html编辑器
     */
    public void setHtmlEditor(Integer htmlEditor) {
        this.htmlEditor = htmlEditor;
    }

    /**
     * 获取讨论区自动订阅
     * @author Administrator
     * @return AUTO_SUBSCRIBE 讨论区自动订阅
     */
    public Integer getAutoSubscribe() {
        return autoSubscribe;
    }

    /**
     * 设置讨论区自动订阅
     * @author Administrator
     * @param autoSubscribe 讨论区自动订阅
     */
    public void setAutoSubscribe(Integer autoSubscribe) {
        this.autoSubscribe = autoSubscribe;
    }

    /**
     * 获取跟踪讨论区
     * @author Administrator
     * @return TRACK_FORUMS 跟踪讨论区
     */
    public Integer getTrackForums() {
        return trackForums;
    }

    /**
     * 设置跟踪讨论区
     * @author Administrator
     * @param trackForums 跟踪讨论区
     */
    public void setTrackForums(Integer trackForums) {
        this.trackForums = trackForums;
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

    /**
     * 获取trustbitmask
     * @author Administrator
     * @return TRUST_BITMASK trustbitmask
     */
    public BigDecimal getTrustBitmask() {
        return trustBitmask;
    }

    /**
     * 设置trustbitmask
     * @author Administrator
     * @param trustBitmask trustbitmask
     */
    public void setTrustBitmask(BigDecimal trustBitmask) {
        this.trustBitmask = trustBitmask;
    }

    /**
     * 获取头像说明
     * @author Administrator
     * @return IMAGE_ALT 头像说明
     */
    public String getImageAlt() {
        return imageAlt;
    }

    /**
     * 设置头像说明
     * @author Administrator
     * @param imageAlt 头像说明
     */
    public void setImageAlt(String imageAlt) {
        this.imageAlt = imageAlt == null ? null : imageAlt.trim();
    }

    /**
     * 获取屏幕阅读
     * @author Administrator
     * @return SCREEN_READER 屏幕阅读
     */
    public Integer getScreenReader() {
        return screenReader;
    }

    /**
     * 设置屏幕阅读
     * @author Administrator
     * @param screenReader 屏幕阅读
     */
    public void setScreenReader(Integer screenReader) {
        this.screenReader = screenReader;
    }
}
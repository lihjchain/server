package com.lawu.eshop.beh.analyze.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class InviteAbnormalDecideRecordDO implements Serializable {
    /**
     *
     * 主键
     * invite_abnormal_decide_record.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 用户编号
     * invite_abnormal_decide_record.user_num
     *
     * @mbg.generated
     */
    private String userNum;

    /**
     *
     * 账号
     * invite_abnormal_decide_record.account
     *
     * @mbg.generated
     */
    private String account;

    /**
     *
     * 用户类型1--商户2--会员
     * invite_abnormal_decide_record.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     *
     * 是否短高频
     * invite_abnormal_decide_record.is_short_hf
     *
     * @mbg.generated
     */
    private Boolean isShortHf;

    /**
     *
     * 是否长高频
     * invite_abnormal_decide_record.is_long_hf
     *
     * @mbg.generated
     */
    private Boolean isLongHf;

    /**
     *
     * 是否多次短高频
     * invite_abnormal_decide_record.is_many_short_hf
     *
     * @mbg.generated
     */
    private Boolean isManyShortHf;

    /**
     *
     * 是否多次短高频
     * invite_abnormal_decide_record.is_many_long_hf
     *
     * @mbg.generated
     */
    private Boolean isManyLongHf;

    /**
     *
     * 是否一天注册下线高频
     * invite_abnormal_decide_record.is_one_day_hf
     *
     * @mbg.generated
     */
    private Boolean isOneDayHf;

    /**
     *
     * 是否凌晨注册高频
     * invite_abnormal_decide_record.is_early_hf
     *
     * @mbg.generated
     */
    private Boolean isEarlyHf;

    /**
     *
     * 是否相同ip高频
     * invite_abnormal_decide_record.is_ip_hf
     *
     * @mbg.generated
     */
    private Boolean isIpHf;

    /**
     *
     * 是否异常
     * invite_abnormal_decide_record.is_abnormal
     *
     * @mbg.generated
     */
    private Boolean isAbnormal;

    /**
     *
     * 是否活动注册异常
     * invite_abnormal_decide_record.is_activity_abnormal
     *
     * @mbg.generated
     */
    private Boolean isActivityAbnormal;

    /**
     *
     * 处理类型，0未处理，1不处理，2冻结
     * invite_abnormal_decide_record.process_type
     *
     * @mbg.generated
     */
    private Byte processType;

    /**
     *
     * 是否已通知
     * invite_abnormal_decide_record.is_noticed
     *
     * @mbg.generated
     */
    private Boolean isNoticed;

    /**
     *
     * 更新时间
     * invite_abnormal_decide_record.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * invite_abnormal_decide_record.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table invite_abnormal_decide_record
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.id
     *
     * @return the value of invite_abnormal_decide_record.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.id
     *
     * @param id the value for invite_abnormal_decide_record.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.user_num
     *
     * @return the value of invite_abnormal_decide_record.user_num
     *
     * @mbg.generated
     */
    public String getUserNum() {
        return userNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.user_num
     *
     * @param userNum the value for invite_abnormal_decide_record.user_num
     *
     * @mbg.generated
     */
    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.account
     *
     * @return the value of invite_abnormal_decide_record.account
     *
     * @mbg.generated
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.account
     *
     * @param account the value for invite_abnormal_decide_record.account
     *
     * @mbg.generated
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.type
     *
     * @return the value of invite_abnormal_decide_record.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.type
     *
     * @param type the value for invite_abnormal_decide_record.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.is_short_hf
     *
     * @return the value of invite_abnormal_decide_record.is_short_hf
     *
     * @mbg.generated
     */
    public Boolean getIsShortHf() {
        return isShortHf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.is_short_hf
     *
     * @param isShortHf the value for invite_abnormal_decide_record.is_short_hf
     *
     * @mbg.generated
     */
    public void setIsShortHf(Boolean isShortHf) {
        this.isShortHf = isShortHf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.is_long_hf
     *
     * @return the value of invite_abnormal_decide_record.is_long_hf
     *
     * @mbg.generated
     */
    public Boolean getIsLongHf() {
        return isLongHf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.is_long_hf
     *
     * @param isLongHf the value for invite_abnormal_decide_record.is_long_hf
     *
     * @mbg.generated
     */
    public void setIsLongHf(Boolean isLongHf) {
        this.isLongHf = isLongHf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.is_many_short_hf
     *
     * @return the value of invite_abnormal_decide_record.is_many_short_hf
     *
     * @mbg.generated
     */
    public Boolean getIsManyShortHf() {
        return isManyShortHf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.is_many_short_hf
     *
     * @param isManyShortHf the value for invite_abnormal_decide_record.is_many_short_hf
     *
     * @mbg.generated
     */
    public void setIsManyShortHf(Boolean isManyShortHf) {
        this.isManyShortHf = isManyShortHf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.is_many_long_hf
     *
     * @return the value of invite_abnormal_decide_record.is_many_long_hf
     *
     * @mbg.generated
     */
    public Boolean getIsManyLongHf() {
        return isManyLongHf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.is_many_long_hf
     *
     * @param isManyLongHf the value for invite_abnormal_decide_record.is_many_long_hf
     *
     * @mbg.generated
     */
    public void setIsManyLongHf(Boolean isManyLongHf) {
        this.isManyLongHf = isManyLongHf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.is_one_day_hf
     *
     * @return the value of invite_abnormal_decide_record.is_one_day_hf
     *
     * @mbg.generated
     */
    public Boolean getIsOneDayHf() {
        return isOneDayHf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.is_one_day_hf
     *
     * @param isOneDayHf the value for invite_abnormal_decide_record.is_one_day_hf
     *
     * @mbg.generated
     */
    public void setIsOneDayHf(Boolean isOneDayHf) {
        this.isOneDayHf = isOneDayHf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.is_early_hf
     *
     * @return the value of invite_abnormal_decide_record.is_early_hf
     *
     * @mbg.generated
     */
    public Boolean getIsEarlyHf() {
        return isEarlyHf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.is_early_hf
     *
     * @param isEarlyHf the value for invite_abnormal_decide_record.is_early_hf
     *
     * @mbg.generated
     */
    public void setIsEarlyHf(Boolean isEarlyHf) {
        this.isEarlyHf = isEarlyHf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.is_ip_hf
     *
     * @return the value of invite_abnormal_decide_record.is_ip_hf
     *
     * @mbg.generated
     */
    public Boolean getIsIpHf() {
        return isIpHf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.is_ip_hf
     *
     * @param isIpHf the value for invite_abnormal_decide_record.is_ip_hf
     *
     * @mbg.generated
     */
    public void setIsIpHf(Boolean isIpHf) {
        this.isIpHf = isIpHf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.is_abnormal
     *
     * @return the value of invite_abnormal_decide_record.is_abnormal
     *
     * @mbg.generated
     */
    public Boolean getIsAbnormal() {
        return isAbnormal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.is_abnormal
     *
     * @param isAbnormal the value for invite_abnormal_decide_record.is_abnormal
     *
     * @mbg.generated
     */
    public void setIsAbnormal(Boolean isAbnormal) {
        this.isAbnormal = isAbnormal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.is_activity_abnormal
     *
     * @return the value of invite_abnormal_decide_record.is_activity_abnormal
     *
     * @mbg.generated
     */
    public Boolean getIsActivityAbnormal() {
        return isActivityAbnormal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.is_activity_abnormal
     *
     * @param isActivityAbnormal the value for invite_abnormal_decide_record.is_activity_abnormal
     *
     * @mbg.generated
     */
    public void setIsActivityAbnormal(Boolean isActivityAbnormal) {
        this.isActivityAbnormal = isActivityAbnormal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.process_type
     *
     * @return the value of invite_abnormal_decide_record.process_type
     *
     * @mbg.generated
     */
    public Byte getProcessType() {
        return processType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.process_type
     *
     * @param processType the value for invite_abnormal_decide_record.process_type
     *
     * @mbg.generated
     */
    public void setProcessType(Byte processType) {
        this.processType = processType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.is_noticed
     *
     * @return the value of invite_abnormal_decide_record.is_noticed
     *
     * @mbg.generated
     */
    public Boolean getIsNoticed() {
        return isNoticed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.is_noticed
     *
     * @param isNoticed the value for invite_abnormal_decide_record.is_noticed
     *
     * @mbg.generated
     */
    public void setIsNoticed(Boolean isNoticed) {
        this.isNoticed = isNoticed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.gmt_modified
     *
     * @return the value of invite_abnormal_decide_record.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.gmt_modified
     *
     * @param gmtModified the value for invite_abnormal_decide_record.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invite_abnormal_decide_record.gmt_create
     *
     * @return the value of invite_abnormal_decide_record.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invite_abnormal_decide_record.gmt_create
     *
     * @param gmtCreate the value for invite_abnormal_decide_record.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
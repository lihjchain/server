package com.lawu.eshop.ad.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class TakeInviterBountyRecordDO implements Serializable {
    /**
     *
     * 主键
     * take_inviter_bounty_record.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 用户编号
     * take_inviter_bounty_record.user_num
     *
     * @mbg.generated
     */
    private String userNum;

    /**
     *
     * 用户类型 1-用户  2-商家
     * take_inviter_bounty_record.user_type
     *
     * @mbg.generated
     */
    private Byte userType;

    /**
     *
     * 领取奖励金个数
     * take_inviter_bounty_record.take_count
     *
     * @mbg.generated
     */
    private Integer takeCount;

    /**
     *
     * 领取日期:年月日
     * take_inviter_bounty_record.take_date
     *
     * @mbg.generated
     */
    private Date takeDate;

    /**
     *
     * 更新时间
     * take_inviter_bounty_record.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * take_inviter_bounty_record.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table take_inviter_bounty_record
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column take_inviter_bounty_record.id
     *
     * @return the value of take_inviter_bounty_record.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column take_inviter_bounty_record.id
     *
     * @param id the value for take_inviter_bounty_record.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column take_inviter_bounty_record.user_num
     *
     * @return the value of take_inviter_bounty_record.user_num
     *
     * @mbg.generated
     */
    public String getUserNum() {
        return userNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column take_inviter_bounty_record.user_num
     *
     * @param userNum the value for take_inviter_bounty_record.user_num
     *
     * @mbg.generated
     */
    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column take_inviter_bounty_record.user_type
     *
     * @return the value of take_inviter_bounty_record.user_type
     *
     * @mbg.generated
     */
    public Byte getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column take_inviter_bounty_record.user_type
     *
     * @param userType the value for take_inviter_bounty_record.user_type
     *
     * @mbg.generated
     */
    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column take_inviter_bounty_record.take_count
     *
     * @return the value of take_inviter_bounty_record.take_count
     *
     * @mbg.generated
     */
    public Integer getTakeCount() {
        return takeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column take_inviter_bounty_record.take_count
     *
     * @param takeCount the value for take_inviter_bounty_record.take_count
     *
     * @mbg.generated
     */
    public void setTakeCount(Integer takeCount) {
        this.takeCount = takeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column take_inviter_bounty_record.take_date
     *
     * @return the value of take_inviter_bounty_record.take_date
     *
     * @mbg.generated
     */
    public Date getTakeDate() {
        return takeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column take_inviter_bounty_record.take_date
     *
     * @param takeDate the value for take_inviter_bounty_record.take_date
     *
     * @mbg.generated
     */
    public void setTakeDate(Date takeDate) {
        this.takeDate = takeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column take_inviter_bounty_record.gmt_modified
     *
     * @return the value of take_inviter_bounty_record.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column take_inviter_bounty_record.gmt_modified
     *
     * @param gmtModified the value for take_inviter_bounty_record.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column take_inviter_bounty_record.gmt_create
     *
     * @return the value of take_inviter_bounty_record.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column take_inviter_bounty_record.gmt_create
     *
     * @param gmtCreate the value for take_inviter_bounty_record.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
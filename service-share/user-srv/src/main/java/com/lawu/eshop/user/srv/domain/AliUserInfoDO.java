package com.lawu.eshop.user.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class AliUserInfoDO implements Serializable {
    /**
     *
     * 
     * ali_user_info.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 用户编号
     * ali_user_info.user_num
     *
     * @mbg.generated
     */
    private String userNum;

    /**
     *
     * 用户类型
     * ali_user_info.user_type
     *
     * @mbg.generated
     */
    private Byte userType;

    /**
     *
     * 支付宝用户号
     * ali_user_info.ali_user_id
     *
     * @mbg.generated
     */
    private String aliUserId;

    /**
     *
     * 
     * ali_user_info.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * 
     * ali_user_info.gmt_modify
     *
     * @mbg.generated
     */
    private Date gmtModify;

    /**
     *
     * 支付宝用户基本信息(json)
     * ali_user_info.ali_user_info
     *
     * @mbg.generated
     */
    private String aliUserInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ali_user_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_user_info.id
     *
     * @return the value of ali_user_info.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_user_info.id
     *
     * @param id the value for ali_user_info.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_user_info.user_num
     *
     * @return the value of ali_user_info.user_num
     *
     * @mbg.generated
     */
    public String getUserNum() {
        return userNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_user_info.user_num
     *
     * @param userNum the value for ali_user_info.user_num
     *
     * @mbg.generated
     */
    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_user_info.user_type
     *
     * @return the value of ali_user_info.user_type
     *
     * @mbg.generated
     */
    public Byte getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_user_info.user_type
     *
     * @param userType the value for ali_user_info.user_type
     *
     * @mbg.generated
     */
    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_user_info.ali_user_id
     *
     * @return the value of ali_user_info.ali_user_id
     *
     * @mbg.generated
     */
    public String getAliUserId() {
        return aliUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_user_info.ali_user_id
     *
     * @param aliUserId the value for ali_user_info.ali_user_id
     *
     * @mbg.generated
     */
    public void setAliUserId(String aliUserId) {
        this.aliUserId = aliUserId == null ? null : aliUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_user_info.gmt_create
     *
     * @return the value of ali_user_info.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_user_info.gmt_create
     *
     * @param gmtCreate the value for ali_user_info.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_user_info.gmt_modify
     *
     * @return the value of ali_user_info.gmt_modify
     *
     * @mbg.generated
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_user_info.gmt_modify
     *
     * @param gmtModify the value for ali_user_info.gmt_modify
     *
     * @mbg.generated
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_user_info.ali_user_info
     *
     * @return the value of ali_user_info.ali_user_info
     *
     * @mbg.generated
     */
    public String getAliUserInfo() {
        return aliUserInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_user_info.ali_user_info
     *
     * @param aliUserInfo the value for ali_user_info.ali_user_info
     *
     * @mbg.generated
     */
    public void setAliUserInfo(String aliUserInfo) {
        this.aliUserInfo = aliUserInfo == null ? null : aliUserInfo.trim();
    }
}
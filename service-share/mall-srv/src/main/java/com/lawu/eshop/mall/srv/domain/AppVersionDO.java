package com.lawu.eshop.mall.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class AppVersionDO implements Serializable {
    /**
     *
     * 主键
     * app_version.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * 版本号
     * app_version.app_version
     *
     * @mbg.generated
     */
    private String appVersion;

    /**
     *
     * 大版本号
     * app_version.app_big_version
     *
     * @mbg.generated
     */
    private String appBigVersion;

    /**
     *
     * 更新内容
     * app_version.update_desc
     *
     * @mbg.generated
     */
    private String updateDesc;

    /**
     *
     * 1-ios 2-安卓
     * app_version.platform
     *
     * @mbg.generated
     */
    private Byte platform;

    /**
     *
     * APP类型，1：会员端，2：商家端
     * app_version.app_type
     *
     * @mbg.generated
     */
    private Byte appType;

    /**
     *
     * 1:启用，2：禁用
     * app_version.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * 是否强制更新
     * app_version.is_force
     *
     * @mbg.generated
     */
    private Boolean isForce;

    /**
     *
     * 创建时间
     * app_version.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_version
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.id
     *
     * @return the value of app_version.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.id
     *
     * @param id the value for app_version.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.app_version
     *
     * @return the value of app_version.app_version
     *
     * @mbg.generated
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.app_version
     *
     * @param appVersion the value for app_version.app_version
     *
     * @mbg.generated
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.app_big_version
     *
     * @return the value of app_version.app_big_version
     *
     * @mbg.generated
     */
    public String getAppBigVersion() {
        return appBigVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.app_big_version
     *
     * @param appBigVersion the value for app_version.app_big_version
     *
     * @mbg.generated
     */
    public void setAppBigVersion(String appBigVersion) {
        this.appBigVersion = appBigVersion == null ? null : appBigVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.update_desc
     *
     * @return the value of app_version.update_desc
     *
     * @mbg.generated
     */
    public String getUpdateDesc() {
        return updateDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.update_desc
     *
     * @param updateDesc the value for app_version.update_desc
     *
     * @mbg.generated
     */
    public void setUpdateDesc(String updateDesc) {
        this.updateDesc = updateDesc == null ? null : updateDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.platform
     *
     * @return the value of app_version.platform
     *
     * @mbg.generated
     */
    public Byte getPlatform() {
        return platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.platform
     *
     * @param platform the value for app_version.platform
     *
     * @mbg.generated
     */
    public void setPlatform(Byte platform) {
        this.platform = platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.app_type
     *
     * @return the value of app_version.app_type
     *
     * @mbg.generated
     */
    public Byte getAppType() {
        return appType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.app_type
     *
     * @param appType the value for app_version.app_type
     *
     * @mbg.generated
     */
    public void setAppType(Byte appType) {
        this.appType = appType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.status
     *
     * @return the value of app_version.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.status
     *
     * @param status the value for app_version.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.is_force
     *
     * @return the value of app_version.is_force
     *
     * @mbg.generated
     */
    public Boolean getIsForce() {
        return isForce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.is_force
     *
     * @param isForce the value for app_version.is_force
     *
     * @mbg.generated
     */
    public void setIsForce(Boolean isForce) {
        this.isForce = isForce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_version.gmt_create
     *
     * @return the value of app_version.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_version.gmt_create
     *
     * @param gmtCreate the value for app_version.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
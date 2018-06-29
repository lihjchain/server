package com.lawu.eshop.mall.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class AppPatchVersionDO implements Serializable {
    /**
     *
     * 主键
     * app_patch_version.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * app_version_id
     * app_patch_version.app_version_id
     *
     * @mbg.generated
     */
    private Long appVersionId;

    /**
     *
     * 版本号
     * app_patch_version.app_version
     *
     * @mbg.generated
     */
    private String appVersion;

    /**
     *
     * 补丁版本号
     * app_patch_version.patch_version
     *
     * @mbg.generated
     */
    private Integer patchVersion;

    /**
     *
     * 更新内容
     * app_patch_version.update_desc
     *
     * @mbg.generated
     */
    private String updateDesc;

    /**
     *
     * 1--未启用，2--启用
     * app_patch_version.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * 更新时间
     * app_patch_version.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * app_patch_version.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_patch_version
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_patch_version.id
     *
     * @return the value of app_patch_version.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_patch_version.id
     *
     * @param id the value for app_patch_version.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_patch_version.app_version_id
     *
     * @return the value of app_patch_version.app_version_id
     *
     * @mbg.generated
     */
    public Long getAppVersionId() {
        return appVersionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_patch_version.app_version_id
     *
     * @param appVersionId the value for app_patch_version.app_version_id
     *
     * @mbg.generated
     */
    public void setAppVersionId(Long appVersionId) {
        this.appVersionId = appVersionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_patch_version.app_version
     *
     * @return the value of app_patch_version.app_version
     *
     * @mbg.generated
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_patch_version.app_version
     *
     * @param appVersion the value for app_patch_version.app_version
     *
     * @mbg.generated
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_patch_version.patch_version
     *
     * @return the value of app_patch_version.patch_version
     *
     * @mbg.generated
     */
    public Integer getPatchVersion() {
        return patchVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_patch_version.patch_version
     *
     * @param patchVersion the value for app_patch_version.patch_version
     *
     * @mbg.generated
     */
    public void setPatchVersion(Integer patchVersion) {
        this.patchVersion = patchVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_patch_version.update_desc
     *
     * @return the value of app_patch_version.update_desc
     *
     * @mbg.generated
     */
    public String getUpdateDesc() {
        return updateDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_patch_version.update_desc
     *
     * @param updateDesc the value for app_patch_version.update_desc
     *
     * @mbg.generated
     */
    public void setUpdateDesc(String updateDesc) {
        this.updateDesc = updateDesc == null ? null : updateDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_patch_version.status
     *
     * @return the value of app_patch_version.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_patch_version.status
     *
     * @param status the value for app_patch_version.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_patch_version.gmt_modified
     *
     * @return the value of app_patch_version.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_patch_version.gmt_modified
     *
     * @param gmtModified the value for app_patch_version.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_patch_version.gmt_create
     *
     * @return the value of app_patch_version.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_patch_version.gmt_create
     *
     * @param gmtCreate the value for app_patch_version.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
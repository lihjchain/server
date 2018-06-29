package com.lawu.eshop.mall.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class InformDO implements Serializable {
    /**
     *
     * 
     * inform.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 举报人用户编号
     * inform.informer_user_num
     *
     * @mbg.generated
     */
    private String informerUserNum;

    /**
     *
     * 举报人账号
     * inform.informer_account
     *
     * @mbg.generated
     */
    private String informerAccount;

    /**
     *
     * 举报类型:1平面广告、2E赞、3商家、4商品
     * inform.inform_type
     *
     * @mbg.generated
     */
    private Byte informType;

    /**
     *
     * 被举报对象ID
     * inform.informt_item_id
     *
     * @mbg.generated
     */
    private Long informtItemId;

    /**
     *
     * 被举报对象名称
     * inform.informt_item_name
     *
     * @mbg.generated
     */
    private String informtItemName;

    /**
     *
     * 举报内容
     * inform.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * 0：待处理，1：已处理，2：不处理
     * inform.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * 审核人员ID
     * inform.auditor_id
     *
     * @mbg.generated
     */
    private Integer auditorId;

    /**
     *
     * 审核人员名称
     * inform.auditor_name
     *
     * @mbg.generated
     */
    private String auditorName;

    /**
     *
     * 审核备注
     * inform.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * 审核时间
     * inform.audit_time
     *
     * @mbg.generated
     */
    private Date auditTime;

    /**
     *
     * 修改时间
     * inform.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * inform.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table inform
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inform.id
     *
     * @return the value of inform.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inform.id
     *
     * @param id the value for inform.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inform.informer_user_num
     *
     * @return the value of inform.informer_user_num
     *
     * @mbg.generated
     */
    public String getInformerUserNum() {
        return informerUserNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inform.informer_user_num
     *
     * @param informerUserNum the value for inform.informer_user_num
     *
     * @mbg.generated
     */
    public void setInformerUserNum(String informerUserNum) {
        this.informerUserNum = informerUserNum == null ? null : informerUserNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inform.informer_account
     *
     * @return the value of inform.informer_account
     *
     * @mbg.generated
     */
    public String getInformerAccount() {
        return informerAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inform.informer_account
     *
     * @param informerAccount the value for inform.informer_account
     *
     * @mbg.generated
     */
    public void setInformerAccount(String informerAccount) {
        this.informerAccount = informerAccount == null ? null : informerAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inform.inform_type
     *
     * @return the value of inform.inform_type
     *
     * @mbg.generated
     */
    public Byte getInformType() {
        return informType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inform.inform_type
     *
     * @param informType the value for inform.inform_type
     *
     * @mbg.generated
     */
    public void setInformType(Byte informType) {
        this.informType = informType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inform.informt_item_id
     *
     * @return the value of inform.informt_item_id
     *
     * @mbg.generated
     */
    public Long getInformtItemId() {
        return informtItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inform.informt_item_id
     *
     * @param informtItemId the value for inform.informt_item_id
     *
     * @mbg.generated
     */
    public void setInformtItemId(Long informtItemId) {
        this.informtItemId = informtItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inform.informt_item_name
     *
     * @return the value of inform.informt_item_name
     *
     * @mbg.generated
     */
    public String getInformtItemName() {
        return informtItemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inform.informt_item_name
     *
     * @param informtItemName the value for inform.informt_item_name
     *
     * @mbg.generated
     */
    public void setInformtItemName(String informtItemName) {
        this.informtItemName = informtItemName == null ? null : informtItemName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inform.content
     *
     * @return the value of inform.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inform.content
     *
     * @param content the value for inform.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inform.status
     *
     * @return the value of inform.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inform.status
     *
     * @param status the value for inform.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inform.auditor_id
     *
     * @return the value of inform.auditor_id
     *
     * @mbg.generated
     */
    public Integer getAuditorId() {
        return auditorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inform.auditor_id
     *
     * @param auditorId the value for inform.auditor_id
     *
     * @mbg.generated
     */
    public void setAuditorId(Integer auditorId) {
        this.auditorId = auditorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inform.auditor_name
     *
     * @return the value of inform.auditor_name
     *
     * @mbg.generated
     */
    public String getAuditorName() {
        return auditorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inform.auditor_name
     *
     * @param auditorName the value for inform.auditor_name
     *
     * @mbg.generated
     */
    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName == null ? null : auditorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inform.remark
     *
     * @return the value of inform.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inform.remark
     *
     * @param remark the value for inform.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inform.audit_time
     *
     * @return the value of inform.audit_time
     *
     * @mbg.generated
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inform.audit_time
     *
     * @param auditTime the value for inform.audit_time
     *
     * @mbg.generated
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inform.gmt_modified
     *
     * @return the value of inform.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inform.gmt_modified
     *
     * @param gmtModified the value for inform.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inform.gmt_create
     *
     * @return the value of inform.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inform.gmt_create
     *
     * @param gmtCreate the value for inform.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
package com.lawu.eshop.ad.srv.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class InviterBountyDO implements Serializable {
    /**
     *
     * 
     * inviter_bounty.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 金额
     * inviter_bounty.money
     *
     * @mbg.generated
     */
    private BigDecimal money;

    /**
     *
     * 发送奖励金总个数
     * inviter_bounty.send_count
     *
     * @mbg.generated
     */
    private Integer sendCount;

    /**
     *
     * 奖励金状态 0-禁用 1-启用
     * inviter_bounty.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * 操作人
     * inviter_bounty.auditor_id
     *
     * @mbg.generated
     */
    private Long auditorId;

    /**
     *
     * 更新时间
     * inviter_bounty.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * inviter_bounty.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table inviter_bounty
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inviter_bounty.id
     *
     * @return the value of inviter_bounty.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inviter_bounty.id
     *
     * @param id the value for inviter_bounty.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inviter_bounty.money
     *
     * @return the value of inviter_bounty.money
     *
     * @mbg.generated
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inviter_bounty.money
     *
     * @param money the value for inviter_bounty.money
     *
     * @mbg.generated
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inviter_bounty.send_count
     *
     * @return the value of inviter_bounty.send_count
     *
     * @mbg.generated
     */
    public Integer getSendCount() {
        return sendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inviter_bounty.send_count
     *
     * @param sendCount the value for inviter_bounty.send_count
     *
     * @mbg.generated
     */
    public void setSendCount(Integer sendCount) {
        this.sendCount = sendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inviter_bounty.status
     *
     * @return the value of inviter_bounty.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inviter_bounty.status
     *
     * @param status the value for inviter_bounty.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inviter_bounty.auditor_id
     *
     * @return the value of inviter_bounty.auditor_id
     *
     * @mbg.generated
     */
    public Long getAuditorId() {
        return auditorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inviter_bounty.auditor_id
     *
     * @param auditorId the value for inviter_bounty.auditor_id
     *
     * @mbg.generated
     */
    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inviter_bounty.gmt_modified
     *
     * @return the value of inviter_bounty.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inviter_bounty.gmt_modified
     *
     * @param gmtModified the value for inviter_bounty.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inviter_bounty.gmt_create
     *
     * @return the value of inviter_bounty.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inviter_bounty.gmt_create
     *
     * @param gmtCreate the value for inviter_bounty.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
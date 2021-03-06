package com.lawu.eshop.ad.srv.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RedPacketDO implements Serializable {
    /**
     *
     * 主键
     * red_packet.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 商家ID
     * red_packet.merchant_id
     *
     * @mbg.generated
     */
    private Long merchantId;

    /**
     *
     * 商家编号
     * red_packet.merchant_num
     *
     * @mbg.generated
     */
    private String merchantNum;

    /**
     *
     * 投放方式(1-普通红包2-拼手气红包)
     * red_packet.put_way
     *
     * @mbg.generated
     */
    private Byte putWay;

    /**
     *
     * 红包数量
     * red_packet.package_count
     *
     * @mbg.generated
     */
    private Integer packageCount;

    /**
     *
     * 所需积分
     * red_packet.totle_point
     *
     * @mbg.generated
     */
    private BigDecimal totlePoint;

    /**
     *
     * 状态(0-删除1-上架3-下架)
     * red_packet.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * 修改时间
     * red_packet.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * red_packet.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table red_packet
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet.id
     *
     * @return the value of red_packet.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet.id
     *
     * @param id the value for red_packet.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet.merchant_id
     *
     * @return the value of red_packet.merchant_id
     *
     * @mbg.generated
     */
    public Long getMerchantId() {
        return merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet.merchant_id
     *
     * @param merchantId the value for red_packet.merchant_id
     *
     * @mbg.generated
     */
    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet.merchant_num
     *
     * @return the value of red_packet.merchant_num
     *
     * @mbg.generated
     */
    public String getMerchantNum() {
        return merchantNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet.merchant_num
     *
     * @param merchantNum the value for red_packet.merchant_num
     *
     * @mbg.generated
     */
    public void setMerchantNum(String merchantNum) {
        this.merchantNum = merchantNum == null ? null : merchantNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet.put_way
     *
     * @return the value of red_packet.put_way
     *
     * @mbg.generated
     */
    public Byte getPutWay() {
        return putWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet.put_way
     *
     * @param putWay the value for red_packet.put_way
     *
     * @mbg.generated
     */
    public void setPutWay(Byte putWay) {
        this.putWay = putWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet.package_count
     *
     * @return the value of red_packet.package_count
     *
     * @mbg.generated
     */
    public Integer getPackageCount() {
        return packageCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet.package_count
     *
     * @param packageCount the value for red_packet.package_count
     *
     * @mbg.generated
     */
    public void setPackageCount(Integer packageCount) {
        this.packageCount = packageCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet.totle_point
     *
     * @return the value of red_packet.totle_point
     *
     * @mbg.generated
     */
    public BigDecimal getTotlePoint() {
        return totlePoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet.totle_point
     *
     * @param totlePoint the value for red_packet.totle_point
     *
     * @mbg.generated
     */
    public void setTotlePoint(BigDecimal totlePoint) {
        this.totlePoint = totlePoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet.status
     *
     * @return the value of red_packet.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet.status
     *
     * @param status the value for red_packet.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet.gmt_modified
     *
     * @return the value of red_packet.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet.gmt_modified
     *
     * @param gmtModified the value for red_packet.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet.gmt_create
     *
     * @return the value of red_packet.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet.gmt_create
     *
     * @param gmtCreate the value for red_packet.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
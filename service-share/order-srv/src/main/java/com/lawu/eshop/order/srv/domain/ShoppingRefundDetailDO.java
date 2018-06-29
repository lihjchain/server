package com.lawu.eshop.order.srv.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ShoppingRefundDetailDO implements Serializable {
    /**
     *
     * 主键
     * shopping_refund_detail.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 购物订单项id
     * shopping_refund_detail.shopping_order_item_id
     *
     * @mbg.generated
     */
    private Long shoppingOrderItemId;

    /**
     *
     * 退款类型(0-退款|1-退货退款)
     * shopping_refund_detail.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     *
     * 退货原因
     * shopping_refund_detail.reason
     *
     * @mbg.generated
     */
    private String reason;

    /**
     *
     * 退款描述
     * shopping_refund_detail.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * 凭证图片
     * shopping_refund_detail.voucher_picture
     *
     * @mbg.generated
     */
    private String voucherPicture;

    /**
     *
     * 拒绝退款图片 
     * shopping_refund_detail.refuse_images
     *
     * @mbg.generated
     */
    private String refuseImages;

    /**
     *
     * 拒绝退款理由
     * shopping_refund_detail.refusal_reasons
     *
     * @mbg.generated
     */
    private String refusalReasons;

    /**
     *
     * 退款金额
     * shopping_refund_detail.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     *
     * 退还积分
     * shopping_refund_detail.point
     *
     * @mbg.generated
     */
    private BigDecimal point;

    /**
     *
     * 实际退款金额
     * shopping_refund_detail.actual_amount
     *
     * @mbg.generated
     */
    private BigDecimal actualAmount;

    /**
     *
     * 退款运费
     * shopping_refund_detail.freight_price
     *
     * @mbg.generated
     */
    private BigDecimal freightPrice;

    /**
     *
     * 运费抵扣积分
     * shopping_refund_detail.freight_price_deduction_points
     *
     * @mbg.generated
     */
    private BigDecimal freightPriceDeductionPoints;

    /**
     *
     * 收货人姓名
     * shopping_refund_detail.consignee_name
     *
     * @mbg.generated
     */
    private String consigneeName;

    /**
     *
     * 收货人地址
     * shopping_refund_detail.consignee_address
     *
     * @mbg.generated
     */
    private String consigneeAddress;

    /**
     *
     * 收货人手机号码
     * shopping_refund_detail.consignee_mobile
     *
     * @mbg.generated
     */
    private String consigneeMobile;

    /**
     *
     * 快递公司id
     * shopping_refund_detail.express_company_id
     *
     * @mbg.generated
     */
    private Integer expressCompanyId;

    /**
     *
     * 快递公司编码
     * shopping_refund_detail.express_company_code
     *
     * @mbg.generated
     */
    private String expressCompanyCode;

    /**
     *
     * 快递公司名称
     * shopping_refund_detail.express_company_name
     *
     * @mbg.generated
     */
    private String expressCompanyName;

    /**
     *
     * 物流编号
     * shopping_refund_detail.waybill_num
     *
     * @mbg.generated
     */
    private String waybillNum;

    /**
     *
     * 订单退款前的状态(0-待处理|1-待付款|2-待发货|3-待收货|4-交易成功|5-交易关闭|6-退款中)
     * shopping_refund_detail.order_status
     *
     * @mbg.generated
     */
    private Byte orderStatus;

    /**
     *
     * 状态(0-无效|1-有效)
     * shopping_refund_detail.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * 商家是否同意退货申请
     * shopping_refund_detail.is_agree
     *
     * @mbg.generated
     */
    private Boolean isAgree;

    /**
     *
     * 退款时间
     * shopping_refund_detail.gmt_refund
     *
     * @mbg.generated
     */
    private Date gmtRefund;

    /**
     *
     * 商家确认时间
     * shopping_refund_detail.gmt_confirmed
     *
     * @mbg.generated
     */
    private Date gmtConfirmed;

    /**
     *
     * 商家填写退货地址
     * shopping_refund_detail.gmt_fill
     *
     * @mbg.generated
     */
    private Date gmtFill;

    /**
     *
     * 买家提交退货物流时间
     * shopping_refund_detail.gmt_submit
     *
     * @mbg.generated
     */
    private Date gmtSubmit;

    /**
     *
     * 平台介入时间
     * shopping_refund_detail.gmt_intervention
     *
     * @mbg.generated
     */
    private Date gmtIntervention;

    /**
     *
     * 创建时间
     * shopping_refund_detail.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * 更新时间
     * shopping_refund_detail.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shopping_refund_detail
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.id
     *
     * @return the value of shopping_refund_detail.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.id
     *
     * @param id the value for shopping_refund_detail.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.shopping_order_item_id
     *
     * @return the value of shopping_refund_detail.shopping_order_item_id
     *
     * @mbg.generated
     */
    public Long getShoppingOrderItemId() {
        return shoppingOrderItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.shopping_order_item_id
     *
     * @param shoppingOrderItemId the value for shopping_refund_detail.shopping_order_item_id
     *
     * @mbg.generated
     */
    public void setShoppingOrderItemId(Long shoppingOrderItemId) {
        this.shoppingOrderItemId = shoppingOrderItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.type
     *
     * @return the value of shopping_refund_detail.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.type
     *
     * @param type the value for shopping_refund_detail.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.reason
     *
     * @return the value of shopping_refund_detail.reason
     *
     * @mbg.generated
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.reason
     *
     * @param reason the value for shopping_refund_detail.reason
     *
     * @mbg.generated
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.description
     *
     * @return the value of shopping_refund_detail.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.description
     *
     * @param description the value for shopping_refund_detail.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.voucher_picture
     *
     * @return the value of shopping_refund_detail.voucher_picture
     *
     * @mbg.generated
     */
    public String getVoucherPicture() {
        return voucherPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.voucher_picture
     *
     * @param voucherPicture the value for shopping_refund_detail.voucher_picture
     *
     * @mbg.generated
     */
    public void setVoucherPicture(String voucherPicture) {
        this.voucherPicture = voucherPicture == null ? null : voucherPicture.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.refuse_images
     *
     * @return the value of shopping_refund_detail.refuse_images
     *
     * @mbg.generated
     */
    public String getRefuseImages() {
        return refuseImages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.refuse_images
     *
     * @param refuseImages the value for shopping_refund_detail.refuse_images
     *
     * @mbg.generated
     */
    public void setRefuseImages(String refuseImages) {
        this.refuseImages = refuseImages == null ? null : refuseImages.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.refusal_reasons
     *
     * @return the value of shopping_refund_detail.refusal_reasons
     *
     * @mbg.generated
     */
    public String getRefusalReasons() {
        return refusalReasons;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.refusal_reasons
     *
     * @param refusalReasons the value for shopping_refund_detail.refusal_reasons
     *
     * @mbg.generated
     */
    public void setRefusalReasons(String refusalReasons) {
        this.refusalReasons = refusalReasons == null ? null : refusalReasons.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.amount
     *
     * @return the value of shopping_refund_detail.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.amount
     *
     * @param amount the value for shopping_refund_detail.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.point
     *
     * @return the value of shopping_refund_detail.point
     *
     * @mbg.generated
     */
    public BigDecimal getPoint() {
        return point;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.point
     *
     * @param point the value for shopping_refund_detail.point
     *
     * @mbg.generated
     */
    public void setPoint(BigDecimal point) {
        this.point = point;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.actual_amount
     *
     * @return the value of shopping_refund_detail.actual_amount
     *
     * @mbg.generated
     */
    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.actual_amount
     *
     * @param actualAmount the value for shopping_refund_detail.actual_amount
     *
     * @mbg.generated
     */
    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.freight_price
     *
     * @return the value of shopping_refund_detail.freight_price
     *
     * @mbg.generated
     */
    public BigDecimal getFreightPrice() {
        return freightPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.freight_price
     *
     * @param freightPrice the value for shopping_refund_detail.freight_price
     *
     * @mbg.generated
     */
    public void setFreightPrice(BigDecimal freightPrice) {
        this.freightPrice = freightPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.freight_price_deduction_points
     *
     * @return the value of shopping_refund_detail.freight_price_deduction_points
     *
     * @mbg.generated
     */
    public BigDecimal getFreightPriceDeductionPoints() {
        return freightPriceDeductionPoints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.freight_price_deduction_points
     *
     * @param freightPriceDeductionPoints the value for shopping_refund_detail.freight_price_deduction_points
     *
     * @mbg.generated
     */
    public void setFreightPriceDeductionPoints(BigDecimal freightPriceDeductionPoints) {
        this.freightPriceDeductionPoints = freightPriceDeductionPoints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.consignee_name
     *
     * @return the value of shopping_refund_detail.consignee_name
     *
     * @mbg.generated
     */
    public String getConsigneeName() {
        return consigneeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.consignee_name
     *
     * @param consigneeName the value for shopping_refund_detail.consignee_name
     *
     * @mbg.generated
     */
    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName == null ? null : consigneeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.consignee_address
     *
     * @return the value of shopping_refund_detail.consignee_address
     *
     * @mbg.generated
     */
    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.consignee_address
     *
     * @param consigneeAddress the value for shopping_refund_detail.consignee_address
     *
     * @mbg.generated
     */
    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress == null ? null : consigneeAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.consignee_mobile
     *
     * @return the value of shopping_refund_detail.consignee_mobile
     *
     * @mbg.generated
     */
    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.consignee_mobile
     *
     * @param consigneeMobile the value for shopping_refund_detail.consignee_mobile
     *
     * @mbg.generated
     */
    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile == null ? null : consigneeMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.express_company_id
     *
     * @return the value of shopping_refund_detail.express_company_id
     *
     * @mbg.generated
     */
    public Integer getExpressCompanyId() {
        return expressCompanyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.express_company_id
     *
     * @param expressCompanyId the value for shopping_refund_detail.express_company_id
     *
     * @mbg.generated
     */
    public void setExpressCompanyId(Integer expressCompanyId) {
        this.expressCompanyId = expressCompanyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.express_company_code
     *
     * @return the value of shopping_refund_detail.express_company_code
     *
     * @mbg.generated
     */
    public String getExpressCompanyCode() {
        return expressCompanyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.express_company_code
     *
     * @param expressCompanyCode the value for shopping_refund_detail.express_company_code
     *
     * @mbg.generated
     */
    public void setExpressCompanyCode(String expressCompanyCode) {
        this.expressCompanyCode = expressCompanyCode == null ? null : expressCompanyCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.express_company_name
     *
     * @return the value of shopping_refund_detail.express_company_name
     *
     * @mbg.generated
     */
    public String getExpressCompanyName() {
        return expressCompanyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.express_company_name
     *
     * @param expressCompanyName the value for shopping_refund_detail.express_company_name
     *
     * @mbg.generated
     */
    public void setExpressCompanyName(String expressCompanyName) {
        this.expressCompanyName = expressCompanyName == null ? null : expressCompanyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.waybill_num
     *
     * @return the value of shopping_refund_detail.waybill_num
     *
     * @mbg.generated
     */
    public String getWaybillNum() {
        return waybillNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.waybill_num
     *
     * @param waybillNum the value for shopping_refund_detail.waybill_num
     *
     * @mbg.generated
     */
    public void setWaybillNum(String waybillNum) {
        this.waybillNum = waybillNum == null ? null : waybillNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.order_status
     *
     * @return the value of shopping_refund_detail.order_status
     *
     * @mbg.generated
     */
    public Byte getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.order_status
     *
     * @param orderStatus the value for shopping_refund_detail.order_status
     *
     * @mbg.generated
     */
    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.status
     *
     * @return the value of shopping_refund_detail.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.status
     *
     * @param status the value for shopping_refund_detail.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.is_agree
     *
     * @return the value of shopping_refund_detail.is_agree
     *
     * @mbg.generated
     */
    public Boolean getIsAgree() {
        return isAgree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.is_agree
     *
     * @param isAgree the value for shopping_refund_detail.is_agree
     *
     * @mbg.generated
     */
    public void setIsAgree(Boolean isAgree) {
        this.isAgree = isAgree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.gmt_refund
     *
     * @return the value of shopping_refund_detail.gmt_refund
     *
     * @mbg.generated
     */
    public Date getGmtRefund() {
        return gmtRefund;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.gmt_refund
     *
     * @param gmtRefund the value for shopping_refund_detail.gmt_refund
     *
     * @mbg.generated
     */
    public void setGmtRefund(Date gmtRefund) {
        this.gmtRefund = gmtRefund;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.gmt_confirmed
     *
     * @return the value of shopping_refund_detail.gmt_confirmed
     *
     * @mbg.generated
     */
    public Date getGmtConfirmed() {
        return gmtConfirmed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.gmt_confirmed
     *
     * @param gmtConfirmed the value for shopping_refund_detail.gmt_confirmed
     *
     * @mbg.generated
     */
    public void setGmtConfirmed(Date gmtConfirmed) {
        this.gmtConfirmed = gmtConfirmed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.gmt_fill
     *
     * @return the value of shopping_refund_detail.gmt_fill
     *
     * @mbg.generated
     */
    public Date getGmtFill() {
        return gmtFill;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.gmt_fill
     *
     * @param gmtFill the value for shopping_refund_detail.gmt_fill
     *
     * @mbg.generated
     */
    public void setGmtFill(Date gmtFill) {
        this.gmtFill = gmtFill;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.gmt_submit
     *
     * @return the value of shopping_refund_detail.gmt_submit
     *
     * @mbg.generated
     */
    public Date getGmtSubmit() {
        return gmtSubmit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.gmt_submit
     *
     * @param gmtSubmit the value for shopping_refund_detail.gmt_submit
     *
     * @mbg.generated
     */
    public void setGmtSubmit(Date gmtSubmit) {
        this.gmtSubmit = gmtSubmit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.gmt_intervention
     *
     * @return the value of shopping_refund_detail.gmt_intervention
     *
     * @mbg.generated
     */
    public Date getGmtIntervention() {
        return gmtIntervention;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.gmt_intervention
     *
     * @param gmtIntervention the value for shopping_refund_detail.gmt_intervention
     *
     * @mbg.generated
     */
    public void setGmtIntervention(Date gmtIntervention) {
        this.gmtIntervention = gmtIntervention;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.gmt_create
     *
     * @return the value of shopping_refund_detail.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.gmt_create
     *
     * @param gmtCreate the value for shopping_refund_detail.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_refund_detail.gmt_modified
     *
     * @return the value of shopping_refund_detail.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_refund_detail.gmt_modified
     *
     * @param gmtModified the value for shopping_refund_detail.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
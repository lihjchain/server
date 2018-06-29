package com.lawu.eshop.statistics.srv.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ReportAreaAdPointMonthDO implements Serializable {
    /**
     *
     * 主键
     * report_area_ad_point_month.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 商家发广告消费积分总和
     * report_area_ad_point_month.report_total_point
     *
     * @mbg.generated
     */
    private BigDecimal reportTotalPoint;

    /**
     *
     * 省编号
     * report_area_ad_point_month.province_id
     *
     * @mbg.generated
     */
    private Integer provinceId;

    /**
     *
     * 市编号
     * report_area_ad_point_month.city_id
     *
     * @mbg.generated
     */
    private Integer cityId;

    /**
     *
     * 区编号
     * report_area_ad_point_month.area_id
     *
     * @mbg.generated
     */
    private Integer areaId;

    /**
     *
     * 统计数据所属日期
     * report_area_ad_point_month.gmt_report
     *
     * @mbg.generated
     */
    private Date gmtReport;

    /**
     *
     * 统计时间
     * report_area_ad_point_month.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table report_area_ad_point_month
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report_area_ad_point_month.id
     *
     * @return the value of report_area_ad_point_month.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report_area_ad_point_month.id
     *
     * @param id the value for report_area_ad_point_month.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report_area_ad_point_month.report_total_point
     *
     * @return the value of report_area_ad_point_month.report_total_point
     *
     * @mbg.generated
     */
    public BigDecimal getReportTotalPoint() {
        return reportTotalPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report_area_ad_point_month.report_total_point
     *
     * @param reportTotalPoint the value for report_area_ad_point_month.report_total_point
     *
     * @mbg.generated
     */
    public void setReportTotalPoint(BigDecimal reportTotalPoint) {
        this.reportTotalPoint = reportTotalPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report_area_ad_point_month.province_id
     *
     * @return the value of report_area_ad_point_month.province_id
     *
     * @mbg.generated
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report_area_ad_point_month.province_id
     *
     * @param provinceId the value for report_area_ad_point_month.province_id
     *
     * @mbg.generated
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report_area_ad_point_month.city_id
     *
     * @return the value of report_area_ad_point_month.city_id
     *
     * @mbg.generated
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report_area_ad_point_month.city_id
     *
     * @param cityId the value for report_area_ad_point_month.city_id
     *
     * @mbg.generated
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report_area_ad_point_month.area_id
     *
     * @return the value of report_area_ad_point_month.area_id
     *
     * @mbg.generated
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report_area_ad_point_month.area_id
     *
     * @param areaId the value for report_area_ad_point_month.area_id
     *
     * @mbg.generated
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report_area_ad_point_month.gmt_report
     *
     * @return the value of report_area_ad_point_month.gmt_report
     *
     * @mbg.generated
     */
    public Date getGmtReport() {
        return gmtReport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report_area_ad_point_month.gmt_report
     *
     * @param gmtReport the value for report_area_ad_point_month.gmt_report
     *
     * @mbg.generated
     */
    public void setGmtReport(Date gmtReport) {
        this.gmtReport = gmtReport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report_area_ad_point_month.gmt_create
     *
     * @return the value of report_area_ad_point_month.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report_area_ad_point_month.gmt_create
     *
     * @param gmtCreate the value for report_area_ad_point_month.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
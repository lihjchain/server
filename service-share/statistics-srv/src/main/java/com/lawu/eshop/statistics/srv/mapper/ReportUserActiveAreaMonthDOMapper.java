package com.lawu.eshop.statistics.srv.mapper;

import com.lawu.eshop.statistics.srv.domain.ReportUserActiveAreaMonthDO;
import com.lawu.eshop.statistics.srv.domain.ReportUserActiveAreaMonthDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ReportUserActiveAreaMonthDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_active_area_month
     *
     * @mbg.generated
     */
    long countByExample(ReportUserActiveAreaMonthDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_active_area_month
     *
     * @mbg.generated
     */
    int deleteByExample(ReportUserActiveAreaMonthDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_active_area_month
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_active_area_month
     *
     * @mbg.generated
     */
    int insert(ReportUserActiveAreaMonthDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_active_area_month
     *
     * @mbg.generated
     */
    int insertSelective(ReportUserActiveAreaMonthDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_active_area_month
     *
     * @mbg.generated
     */
    List<ReportUserActiveAreaMonthDO> selectByExampleWithRowbounds(ReportUserActiveAreaMonthDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_active_area_month
     *
     * @mbg.generated
     */
    List<ReportUserActiveAreaMonthDO> selectByExample(ReportUserActiveAreaMonthDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_active_area_month
     *
     * @mbg.generated
     */
    ReportUserActiveAreaMonthDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_active_area_month
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ReportUserActiveAreaMonthDO record, @Param("example") ReportUserActiveAreaMonthDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_active_area_month
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ReportUserActiveAreaMonthDO record, @Param("example") ReportUserActiveAreaMonthDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_active_area_month
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ReportUserActiveAreaMonthDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_active_area_month
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ReportUserActiveAreaMonthDO record);
}
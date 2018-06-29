package com.lawu.eshop.statistics.srv.mapper;

import com.lawu.eshop.statistics.srv.domain.ReportAreaPointConsumeDailyDO;
import com.lawu.eshop.statistics.srv.domain.ReportAreaPointConsumeDailyDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ReportAreaPointConsumeDailyDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_point_consume_daily
     *
     * @mbg.generated
     */
    int countByExample(ReportAreaPointConsumeDailyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_point_consume_daily
     *
     * @mbg.generated
     */
    int deleteByExample(ReportAreaPointConsumeDailyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_point_consume_daily
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_point_consume_daily
     *
     * @mbg.generated
     */
    int insert(ReportAreaPointConsumeDailyDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_point_consume_daily
     *
     * @mbg.generated
     */
    int insertSelective(ReportAreaPointConsumeDailyDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_point_consume_daily
     *
     * @mbg.generated
     */
    List<ReportAreaPointConsumeDailyDO> selectByExampleWithRowbounds(ReportAreaPointConsumeDailyDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_point_consume_daily
     *
     * @mbg.generated
     */
    List<ReportAreaPointConsumeDailyDO> selectByExample(ReportAreaPointConsumeDailyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_point_consume_daily
     *
     * @mbg.generated
     */
    ReportAreaPointConsumeDailyDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_point_consume_daily
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ReportAreaPointConsumeDailyDO record, @Param("example") ReportAreaPointConsumeDailyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_point_consume_daily
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ReportAreaPointConsumeDailyDO record, @Param("example") ReportAreaPointConsumeDailyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_point_consume_daily
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ReportAreaPointConsumeDailyDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_area_point_consume_daily
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ReportAreaPointConsumeDailyDO record);
}
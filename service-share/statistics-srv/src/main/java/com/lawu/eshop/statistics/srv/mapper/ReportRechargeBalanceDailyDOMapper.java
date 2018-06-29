package com.lawu.eshop.statistics.srv.mapper;

import com.lawu.eshop.statistics.srv.domain.ReportRechargeBalanceDailyDO;
import com.lawu.eshop.statistics.srv.domain.ReportRechargeBalanceDailyDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ReportRechargeBalanceDailyDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_recharge_balance_daily
     *
     * @mbg.generated
     */
    int countByExample(ReportRechargeBalanceDailyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_recharge_balance_daily
     *
     * @mbg.generated
     */
    int deleteByExample(ReportRechargeBalanceDailyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_recharge_balance_daily
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_recharge_balance_daily
     *
     * @mbg.generated
     */
    int insert(ReportRechargeBalanceDailyDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_recharge_balance_daily
     *
     * @mbg.generated
     */
    int insertSelective(ReportRechargeBalanceDailyDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_recharge_balance_daily
     *
     * @mbg.generated
     */
    List<ReportRechargeBalanceDailyDO> selectByExampleWithRowbounds(ReportRechargeBalanceDailyDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_recharge_balance_daily
     *
     * @mbg.generated
     */
    List<ReportRechargeBalanceDailyDO> selectByExample(ReportRechargeBalanceDailyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_recharge_balance_daily
     *
     * @mbg.generated
     */
    ReportRechargeBalanceDailyDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_recharge_balance_daily
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ReportRechargeBalanceDailyDO record, @Param("example") ReportRechargeBalanceDailyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_recharge_balance_daily
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ReportRechargeBalanceDailyDO record, @Param("example") ReportRechargeBalanceDailyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_recharge_balance_daily
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ReportRechargeBalanceDailyDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_recharge_balance_daily
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ReportRechargeBalanceDailyDO record);
}
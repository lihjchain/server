package com.lawu.eshop.statistics.srv.mapper;

import com.lawu.eshop.statistics.srv.domain.ReportUserIncomeExpenditureDO;
import com.lawu.eshop.statistics.srv.domain.ReportUserIncomeExpenditureDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ReportUserIncomeExpenditureDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_income_expenditure
     *
     * @mbg.generated
     */
    long countByExample(ReportUserIncomeExpenditureDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_income_expenditure
     *
     * @mbg.generated
     */
    int deleteByExample(ReportUserIncomeExpenditureDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_income_expenditure
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_income_expenditure
     *
     * @mbg.generated
     */
    int insert(ReportUserIncomeExpenditureDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_income_expenditure
     *
     * @mbg.generated
     */
    int insertSelective(ReportUserIncomeExpenditureDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_income_expenditure
     *
     * @mbg.generated
     */
    List<ReportUserIncomeExpenditureDO> selectByExampleWithRowbounds(ReportUserIncomeExpenditureDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_income_expenditure
     *
     * @mbg.generated
     */
    List<ReportUserIncomeExpenditureDO> selectByExample(ReportUserIncomeExpenditureDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_income_expenditure
     *
     * @mbg.generated
     */
    ReportUserIncomeExpenditureDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_income_expenditure
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ReportUserIncomeExpenditureDO record, @Param("example") ReportUserIncomeExpenditureDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_income_expenditure
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ReportUserIncomeExpenditureDO record, @Param("example") ReportUserIncomeExpenditureDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_income_expenditure
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ReportUserIncomeExpenditureDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_user_income_expenditure
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ReportUserIncomeExpenditureDO record);
}
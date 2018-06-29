package com.lawu.eshop.activity.srv.mapper;

import com.lawu.eshop.activity.srv.domain.RichPowerRecordDO;
import com.lawu.eshop.activity.srv.domain.RichPowerRecordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RichPowerRecordDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_record
     *
     * @mbg.generated
     */
    long countByExample(RichPowerRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_record
     *
     * @mbg.generated
     */
    int deleteByExample(RichPowerRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_record
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_record
     *
     * @mbg.generated
     */
    int insert(RichPowerRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_record
     *
     * @mbg.generated
     */
    int insertSelective(RichPowerRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_record
     *
     * @mbg.generated
     */
    List<RichPowerRecordDO> selectByExampleWithRowbounds(RichPowerRecordDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_record
     *
     * @mbg.generated
     */
    List<RichPowerRecordDO> selectByExample(RichPowerRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_record
     *
     * @mbg.generated
     */
    RichPowerRecordDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_record
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") RichPowerRecordDO record, @Param("example") RichPowerRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_record
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") RichPowerRecordDO record, @Param("example") RichPowerRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RichPowerRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RichPowerRecordDO record);
}
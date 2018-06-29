package com.lawu.eshop.activity.srv.mapper;

import com.lawu.eshop.activity.srv.domain.RichPowerTaskRecordDO;
import com.lawu.eshop.activity.srv.domain.RichPowerTaskRecordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RichPowerTaskRecordDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_task_record
     *
     * @mbg.generated
     */
    long countByExample(RichPowerTaskRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_task_record
     *
     * @mbg.generated
     */
    int deleteByExample(RichPowerTaskRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_task_record
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_task_record
     *
     * @mbg.generated
     */
    int insert(RichPowerTaskRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_task_record
     *
     * @mbg.generated
     */
    int insertSelective(RichPowerTaskRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_task_record
     *
     * @mbg.generated
     */
    List<RichPowerTaskRecordDO> selectByExampleWithRowbounds(RichPowerTaskRecordDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_task_record
     *
     * @mbg.generated
     */
    List<RichPowerTaskRecordDO> selectByExample(RichPowerTaskRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_task_record
     *
     * @mbg.generated
     */
    RichPowerTaskRecordDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_task_record
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") RichPowerTaskRecordDO record, @Param("example") RichPowerTaskRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_task_record
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") RichPowerTaskRecordDO record, @Param("example") RichPowerTaskRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_task_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RichPowerTaskRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_power_task_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RichPowerTaskRecordDO record);
}
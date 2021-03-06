package com.lawu.eshop.activity.srv.mapper;

import com.lawu.eshop.activity.srv.domain.RichDiamondDistributionRecordDO;
import com.lawu.eshop.activity.srv.domain.RichDiamondDistributionRecordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RichDiamondDistributionRecordDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_diamond_distribution_record
     *
     * @mbg.generated
     */
    long countByExample(RichDiamondDistributionRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_diamond_distribution_record
     *
     * @mbg.generated
     */
    int deleteByExample(RichDiamondDistributionRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_diamond_distribution_record
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_diamond_distribution_record
     *
     * @mbg.generated
     */
    int insert(RichDiamondDistributionRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_diamond_distribution_record
     *
     * @mbg.generated
     */
    int insertSelective(RichDiamondDistributionRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_diamond_distribution_record
     *
     * @mbg.generated
     */
    List<RichDiamondDistributionRecordDO> selectByExampleWithRowbounds(RichDiamondDistributionRecordDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_diamond_distribution_record
     *
     * @mbg.generated
     */
    List<RichDiamondDistributionRecordDO> selectByExample(RichDiamondDistributionRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_diamond_distribution_record
     *
     * @mbg.generated
     */
    RichDiamondDistributionRecordDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_diamond_distribution_record
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") RichDiamondDistributionRecordDO record, @Param("example") RichDiamondDistributionRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_diamond_distribution_record
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") RichDiamondDistributionRecordDO record, @Param("example") RichDiamondDistributionRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_diamond_distribution_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RichDiamondDistributionRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_diamond_distribution_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RichDiamondDistributionRecordDO record);
}
package com.lawu.eshop.ad.srv.mapper;

import com.lawu.eshop.ad.srv.domain.MemberAdRecordDO;
import com.lawu.eshop.ad.srv.domain.MemberAdRecordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MemberAdRecordDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_ad_record
     *
     * @mbg.generated
     */
    long countByExample(MemberAdRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_ad_record
     *
     * @mbg.generated
     */
    int deleteByExample(MemberAdRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_ad_record
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_ad_record
     *
     * @mbg.generated
     */
    int insert(MemberAdRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_ad_record
     *
     * @mbg.generated
     */
    int insertSelective(MemberAdRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_ad_record
     *
     * @mbg.generated
     */
    List<MemberAdRecordDO> selectByExampleWithRowbounds(MemberAdRecordDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_ad_record
     *
     * @mbg.generated
     */
    List<MemberAdRecordDO> selectByExample(MemberAdRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_ad_record
     *
     * @mbg.generated
     */
    MemberAdRecordDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_ad_record
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MemberAdRecordDO record, @Param("example") MemberAdRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_ad_record
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MemberAdRecordDO record, @Param("example") MemberAdRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_ad_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MemberAdRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_ad_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MemberAdRecordDO record);
}
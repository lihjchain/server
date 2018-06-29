package com.lawu.eshop.property.srv.mapper;

import com.lawu.eshop.property.srv.domain.BankDO;
import com.lawu.eshop.property.srv.domain.BankDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BankDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank
     *
     * @mbg.generated
     */
    long countByExample(BankDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank
     *
     * @mbg.generated
     */
    int deleteByExample(BankDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank
     *
     * @mbg.generated
     */
    int insert(BankDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank
     *
     * @mbg.generated
     */
    int insertSelective(BankDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank
     *
     * @mbg.generated
     */
    List<BankDO> selectByExampleWithRowbounds(BankDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank
     *
     * @mbg.generated
     */
    List<BankDO> selectByExample(BankDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank
     *
     * @mbg.generated
     */
    BankDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") BankDO record, @Param("example") BankDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") BankDO record, @Param("example") BankDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(BankDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BankDO record);
}
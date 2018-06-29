package com.lawu.eshop.user.srv.mapper;

import com.lawu.eshop.user.srv.domain.MerchantStoreAuditDO;
import com.lawu.eshop.user.srv.domain.MerchantStoreAuditDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MerchantStoreAuditDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_store_audit
     *
     * @mbg.generated
     */
    int countByExample(MerchantStoreAuditDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_store_audit
     *
     * @mbg.generated
     */
    int deleteByExample(MerchantStoreAuditDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_store_audit
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_store_audit
     *
     * @mbg.generated
     */
    int insert(MerchantStoreAuditDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_store_audit
     *
     * @mbg.generated
     */
    int insertSelective(MerchantStoreAuditDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_store_audit
     *
     * @mbg.generated
     */
    List<MerchantStoreAuditDO> selectByExampleWithBLOBsWithRowbounds(MerchantStoreAuditDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_store_audit
     *
     * @mbg.generated
     */
    List<MerchantStoreAuditDO> selectByExampleWithBLOBs(MerchantStoreAuditDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_store_audit
     *
     * @mbg.generated
     */
    List<MerchantStoreAuditDO> selectByExampleWithRowbounds(MerchantStoreAuditDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_store_audit
     *
     * @mbg.generated
     */
    List<MerchantStoreAuditDO> selectByExample(MerchantStoreAuditDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_store_audit
     *
     * @mbg.generated
     */
    MerchantStoreAuditDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_store_audit
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MerchantStoreAuditDO record, @Param("example") MerchantStoreAuditDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_store_audit
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") MerchantStoreAuditDO record, @Param("example") MerchantStoreAuditDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_store_audit
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MerchantStoreAuditDO record, @Param("example") MerchantStoreAuditDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_store_audit
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MerchantStoreAuditDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_store_audit
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(MerchantStoreAuditDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant_store_audit
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MerchantStoreAuditDO record);
}
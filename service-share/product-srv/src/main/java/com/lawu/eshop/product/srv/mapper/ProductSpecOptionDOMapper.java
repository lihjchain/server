package com.lawu.eshop.product.srv.mapper;

import com.lawu.eshop.product.srv.domain.ProductSpecOptionDO;
import com.lawu.eshop.product.srv.domain.ProductSpecOptionDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProductSpecOptionDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec_option
     *
     * @mbg.generated
     */
    long countByExample(ProductSpecOptionDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec_option
     *
     * @mbg.generated
     */
    int deleteByExample(ProductSpecOptionDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec_option
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec_option
     *
     * @mbg.generated
     */
    int insert(ProductSpecOptionDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec_option
     *
     * @mbg.generated
     */
    int insertSelective(ProductSpecOptionDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec_option
     *
     * @mbg.generated
     */
    List<ProductSpecOptionDO> selectByExampleWithRowbounds(ProductSpecOptionDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec_option
     *
     * @mbg.generated
     */
    List<ProductSpecOptionDO> selectByExample(ProductSpecOptionDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec_option
     *
     * @mbg.generated
     */
    ProductSpecOptionDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec_option
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ProductSpecOptionDO record, @Param("example") ProductSpecOptionDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec_option
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ProductSpecOptionDO record, @Param("example") ProductSpecOptionDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec_option
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ProductSpecOptionDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_spec_option
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProductSpecOptionDO record);
}
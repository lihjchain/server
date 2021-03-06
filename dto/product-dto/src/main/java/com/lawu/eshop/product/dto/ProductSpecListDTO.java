package com.lawu.eshop.product.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author zhangyong
 * @date 2018/4/16.
 */
public class ProductSpecListDTO {
    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "商品分类ID")
    private Integer productCategoryId;

    @ApiModelProperty(value = "规格名称")
    private String specName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }
}

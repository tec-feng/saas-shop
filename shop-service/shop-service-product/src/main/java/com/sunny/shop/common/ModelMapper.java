package com.sunny.shop.common;

import com.sunny.product.dto.*;
import com.sunny.product.model.*;
import com.sunny.product.vo.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 使用 map struct 将dto和model互转工具类
 * @author tec_feng
 * @create 2020-06-02 12:57
 */
@Mapper
public interface ModelMapper {
    ModelMapper INSTANCE = Mappers.getMapper( ModelMapper.class );

    ProductNavCategory toModel(ProductNavCategoryDto dto);
    ProductNavCategory toModel(ProductNavCategoryUpdateDto dto);
    ProductNavCategoryVO toVO(ProductNavCategory model);
    List<ProductNavCategoryVO> toNavCategoryVOs(List<ProductNavCategory> models);

    ProductUserCategory toModel(ProductUserCategoryDto dto);
    ProductUserCategory toModel(ProductUserCategoryUpdateDto dto);
    ProductUserCategoryVO toVO(ProductUserCategory model);
    List<ProductUserCategoryVO> toUserCategoryVOs(List<ProductUserCategory> models);

    ProductCategory toModel(ProductCategoryDto dto);
    ProductCategory toModel(ProductCategoryUpdateDto dto);
    ProductCategoryVO toVO(ProductCategory model);
    List<ProductCategoryVO> toCategoryVOs(List<ProductCategory> models);

    CategoryParameter toModel(CategoryParameterDto dto);
    CategoryParameterVO toVO(CategoryParameter model);
    List<CategoryParameterVO> toParameterVOs(List<CategoryParameter> models);

    CategoryProperty toModel(CategoryPropertyDto dto);
    CategoryPropertyVO toVO(CategoryProperty model);
    List<CategoryPropertyVO> toCategoryPropertyVOs(List<CategoryProperty> models);

}

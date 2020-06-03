package com.sunny.shop.common;

import com.sunny.product.dto.ProductCategoryDto;
import com.sunny.product.dto.ProductNavCategoryDto;
import com.sunny.product.dto.ProductNavCategoryUpdateDto;
import com.sunny.product.model.ProductCategory;
import com.sunny.product.model.ProductNavCategory;
import com.sunny.product.vo.ProductNavCategoryVO;
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
    List<ProductNavCategoryVO> toVOs(List<ProductNavCategory> models);

    ProductCategory toModel(ProductCategoryDto dto);
}

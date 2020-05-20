package com.sunny.product.mapper;
import com.sunny.base.BaseMapper;
import com.sunny.product.dto.ProductDto;
import com.sunny.product.model.Product;
import com.sunny.product.model.ProductExample;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
* @author tec_feng
* @create 2020-04-08 19:11
*/
public interface ProductMapper extends BaseMapper<Product,ProductExample> {
}
package com.mall.mallproduct.dao;

import com.mall.mallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-24 14:21:40
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

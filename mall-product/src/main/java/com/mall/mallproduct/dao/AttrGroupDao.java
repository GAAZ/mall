package com.mall.mallproduct.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mall.mallproduct.entity.AttrGroupEntity;
import com.mall.mallproduct.vo.SpuItemAttrGroupVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 属性分组
 * 
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-24 14:21:40
 */
@Mapper
public interface AttrGroupDao extends BaseMapper<AttrGroupEntity> {

    List<SpuItemAttrGroupVo> getAttrGroupWithAttrsBySpuId(@Param("spuId") Long spuId, @Param("catalogId") Long catalogId);
}

package com.mall.mallproduct.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mall.mallproduct.entity.SpuInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * spu信息
 * 
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-24 14:21:40
 */
@Mapper
public interface SpuInfoDao extends BaseMapper<SpuInfoEntity> {
    void updaSpuStatus(@Param("spuId") Long spuId, @Param("code") int code);
}

package com.mall.mallorder.dao;

import com.mall.mallorder.entity.OorderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:06:46
 */
@Mapper
public interface OorderDao extends BaseMapper<OorderEntity> {
	
}

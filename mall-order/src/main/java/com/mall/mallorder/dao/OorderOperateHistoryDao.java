package com.mall.mallorder.dao;

import com.mall.mallorder.entity.OorderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:06:46
 */
@Mapper
public interface OorderOperateHistoryDao extends BaseMapper<OorderOperateHistoryEntity> {
	
}

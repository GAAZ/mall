package com.mall.mallware.dao;

import com.mall.mallware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:17:19
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}

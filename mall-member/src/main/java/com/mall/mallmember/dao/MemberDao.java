package com.mall.mallmember.dao;

import com.mall.mallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:00:29
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

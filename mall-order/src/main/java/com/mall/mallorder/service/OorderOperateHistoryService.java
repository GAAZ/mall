package com.mall.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.mallorder.entity.OorderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:06:46
 */
public interface OorderOperateHistoryService extends IService<OorderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


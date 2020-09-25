package com.mall.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.mallorder.entity.OorderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:06:46
 */
public interface OorderItemService extends IService<OorderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


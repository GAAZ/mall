package com.mall.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.mallorder.entity.OorderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:06:46
 */
public interface OorderSettingService extends IService<OorderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


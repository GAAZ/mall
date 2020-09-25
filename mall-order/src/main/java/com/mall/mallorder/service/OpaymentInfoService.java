package com.mall.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.mallorder.entity.OpaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:06:46
 */
public interface OpaymentInfoService extends IService<OpaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


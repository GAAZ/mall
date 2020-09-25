package com.mall.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.mallorder.entity.OorderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:06:46
 */
public interface OorderReturnApplyService extends IService<OorderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


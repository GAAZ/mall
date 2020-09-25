package com.mall.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.mallorder.entity.OorderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:06:46
 */
public interface OorderReturnReasonService extends IService<OorderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


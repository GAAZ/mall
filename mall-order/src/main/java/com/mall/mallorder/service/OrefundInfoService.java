package com.mall.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.mallorder.entity.OrefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:06:46
 */
public interface OrefundInfoService extends IService<OrefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


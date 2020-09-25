package com.mall.mallorder.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.mallorder.dao.OorderReturnReasonDao;
import com.mall.mallorder.entity.OorderReturnReasonEntity;
import com.mall.mallorder.service.OorderReturnReasonService;


@Service("oorderReturnReasonService")
public class OorderReturnReasonServiceImpl extends ServiceImpl<OorderReturnReasonDao, OorderReturnReasonEntity> implements OorderReturnReasonService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OorderReturnReasonEntity> page = this.page(
                new Query<OorderReturnReasonEntity>().getPage(params),
                new QueryWrapper<OorderReturnReasonEntity>()
        );

        return new PageUtils(page);
    }

}
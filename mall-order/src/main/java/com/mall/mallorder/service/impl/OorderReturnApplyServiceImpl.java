package com.mall.mallorder.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.mallorder.dao.OorderReturnApplyDao;
import com.mall.mallorder.entity.OorderReturnApplyEntity;
import com.mall.mallorder.service.OorderReturnApplyService;


@Service("oorderReturnApplyService")
public class OorderReturnApplyServiceImpl extends ServiceImpl<OorderReturnApplyDao, OorderReturnApplyEntity> implements OorderReturnApplyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OorderReturnApplyEntity> page = this.page(
                new Query<OorderReturnApplyEntity>().getPage(params),
                new QueryWrapper<OorderReturnApplyEntity>()
        );

        return new PageUtils(page);
    }

}
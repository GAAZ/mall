package com.mall.mallorder.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.mallorder.dao.OpaymentInfoDao;
import com.mall.mallorder.entity.OpaymentInfoEntity;
import com.mall.mallorder.service.OpaymentInfoService;


@Service("opaymentInfoService")
public class OpaymentInfoServiceImpl extends ServiceImpl<OpaymentInfoDao, OpaymentInfoEntity> implements OpaymentInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OpaymentInfoEntity> page = this.page(
                new Query<OpaymentInfoEntity>().getPage(params),
                new QueryWrapper<OpaymentInfoEntity>()
        );

        return new PageUtils(page);
    }

}
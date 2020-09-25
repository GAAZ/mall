package com.mall.mallorder.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.mallorder.dao.OrefundInfoDao;
import com.mall.mallorder.entity.OrefundInfoEntity;
import com.mall.mallorder.service.OrefundInfoService;


@Service("orefundInfoService")
public class OrefundInfoServiceImpl extends ServiceImpl<OrefundInfoDao, OrefundInfoEntity> implements OrefundInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrefundInfoEntity> page = this.page(
                new Query<OrefundInfoEntity>().getPage(params),
                new QueryWrapper<OrefundInfoEntity>()
        );

        return new PageUtils(page);
    }

}
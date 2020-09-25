package com.mall.mallorder.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.mallorder.dao.OorderDao;
import com.mall.mallorder.entity.OorderEntity;
import com.mall.mallorder.service.OorderService;


@Service("oorderService")
public class OorderServiceImpl extends ServiceImpl<OorderDao, OorderEntity> implements OorderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OorderEntity> page = this.page(
                new Query<OorderEntity>().getPage(params),
                new QueryWrapper<OorderEntity>()
        );

        return new PageUtils(page);
    }

}
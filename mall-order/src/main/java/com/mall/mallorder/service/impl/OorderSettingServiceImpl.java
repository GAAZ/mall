package com.mall.mallorder.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.mallorder.dao.OorderSettingDao;
import com.mall.mallorder.entity.OorderSettingEntity;
import com.mall.mallorder.service.OorderSettingService;


@Service("oorderSettingService")
public class OorderSettingServiceImpl extends ServiceImpl<OorderSettingDao, OorderSettingEntity> implements OorderSettingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OorderSettingEntity> page = this.page(
                new Query<OorderSettingEntity>().getPage(params),
                new QueryWrapper<OorderSettingEntity>()
        );

        return new PageUtils(page);
    }

}
package com.mall.mallorder.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.mallorder.dao.OorderItemDao;
import com.mall.mallorder.entity.OorderItemEntity;
import com.mall.mallorder.service.OorderItemService;


@Service("oorderItemService")
public class OorderItemServiceImpl extends ServiceImpl<OorderItemDao, OorderItemEntity> implements OorderItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OorderItemEntity> page = this.page(
                new Query<OorderItemEntity>().getPage(params),
                new QueryWrapper<OorderItemEntity>()
        );

        return new PageUtils(page);
    }

}
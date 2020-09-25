package com.mall.mallorder.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mall.mallorder.entity.OorderOperateHistoryEntity;
import com.mall.mallorder.service.OorderOperateHistoryService;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;



/**
 * 订单操作历史记录
 *
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:06:46
 */
@RestController
@RequestMapping("mallorder/oorderoperatehistory")
public class OorderOperateHistoryController {
    @Autowired
    private OorderOperateHistoryService oorderOperateHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = oorderOperateHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		OorderOperateHistoryEntity oorderOperateHistory = oorderOperateHistoryService.getById(id);

        return R.ok().put("oorderOperateHistory", oorderOperateHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OorderOperateHistoryEntity oorderOperateHistory){
		oorderOperateHistoryService.save(oorderOperateHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OorderOperateHistoryEntity oorderOperateHistory){
		oorderOperateHistoryService.updateById(oorderOperateHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		oorderOperateHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

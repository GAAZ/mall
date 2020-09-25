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

import com.mall.mallorder.entity.OorderSettingEntity;
import com.mall.mallorder.service.OorderSettingService;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;



/**
 * 订单配置信息
 *
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:06:46
 */
@RestController
@RequestMapping("mallorder/oordersetting")
public class OorderSettingController {
    @Autowired
    private OorderSettingService oorderSettingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = oorderSettingService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		OorderSettingEntity oorderSetting = oorderSettingService.getById(id);

        return R.ok().put("oorderSetting", oorderSetting);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OorderSettingEntity oorderSetting){
		oorderSettingService.save(oorderSetting);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OorderSettingEntity oorderSetting){
		oorderSettingService.updateById(oorderSetting);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		oorderSettingService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

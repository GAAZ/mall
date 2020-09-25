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

import com.mall.mallorder.entity.OorderItemEntity;
import com.mall.mallorder.service.OorderItemService;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;



/**
 * 订单项信息
 *
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:06:46
 */
@RestController
@RequestMapping("mallorder/oorderitem")
public class OorderItemController {
    @Autowired
    private OorderItemService oorderItemService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = oorderItemService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		OorderItemEntity oorderItem = oorderItemService.getById(id);

        return R.ok().put("oorderItem", oorderItem);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OorderItemEntity oorderItem){
		oorderItemService.save(oorderItem);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OorderItemEntity oorderItem){
		oorderItemService.updateById(oorderItem);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		oorderItemService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

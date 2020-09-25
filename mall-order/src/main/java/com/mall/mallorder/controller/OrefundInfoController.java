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

import com.mall.mallorder.entity.OrefundInfoEntity;
import com.mall.mallorder.service.OrefundInfoService;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;



/**
 * 退款信息
 *
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:06:46
 */
@RestController
@RequestMapping("mallorder/orefundinfo")
public class OrefundInfoController {
    @Autowired
    private OrefundInfoService orefundInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = orefundInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		OrefundInfoEntity orefundInfo = orefundInfoService.getById(id);

        return R.ok().put("orefundInfo", orefundInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OrefundInfoEntity orefundInfo){
		orefundInfoService.save(orefundInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OrefundInfoEntity orefundInfo){
		orefundInfoService.updateById(orefundInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		orefundInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

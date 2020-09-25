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

import com.mall.mallorder.entity.OpaymentInfoEntity;
import com.mall.mallorder.service.OpaymentInfoService;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;



/**
 * 支付信息表
 *
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:06:46
 */
@RestController
@RequestMapping("mallorder/opaymentinfo")
public class OpaymentInfoController {
    @Autowired
    private OpaymentInfoService opaymentInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = opaymentInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		OpaymentInfoEntity opaymentInfo = opaymentInfoService.getById(id);

        return R.ok().put("opaymentInfo", opaymentInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OpaymentInfoEntity opaymentInfo){
		opaymentInfoService.save(opaymentInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OpaymentInfoEntity opaymentInfo){
		opaymentInfoService.updateById(opaymentInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		opaymentInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

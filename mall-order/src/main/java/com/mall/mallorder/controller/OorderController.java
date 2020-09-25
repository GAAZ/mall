package com.mall.mallorder.controller;

import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;
import com.mall.mallorder.entity.OorderEntity;
import com.mall.mallorder.service.OorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 订单
 *
 * @author DW
 * @email DW@gmail.com
 * @date 2020-09-26 00:06:46
 */
@RestController
@RequestMapping("mallorder/oorder")
public class OorderController {
    @Autowired
    private OorderService oorderService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = oorderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		OorderEntity oorder = oorderService.getById(id);

        return R.ok().put("oorder", oorder);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OorderEntity oorder){
		oorderService.save(oorder);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OorderEntity oorder){
		oorderService.updateById(oorder);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		oorderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

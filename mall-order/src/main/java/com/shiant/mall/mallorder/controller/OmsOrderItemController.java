package com.shiant.mall.mallorder.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shiant.mall.mallorder.entity.OmsOrderItemEntity;
import com.shiant.mall.mallorder.service.OmsOrderItemService;
import com.shiant.mall.common.utils.PageUtils;
import com.shiant.mall.common.utils.R;



/**
 * 订单项信息
 *
 * @author tom
 * @email 277215745@qq.com
 * @date 2024-11-19 21:31:23
 */
@RestController
@RequestMapping("mallorder/omsorderitem")
public class OmsOrderItemController {
    @Autowired
    private OmsOrderItemService omsOrderItemService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("mallorder:omsorderitem:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = omsOrderItemService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("mallorder:omsorderitem:info")
    public R info(@PathVariable("id") Long id){
		OmsOrderItemEntity omsOrderItem = omsOrderItemService.getById(id);

        return R.ok().put("omsOrderItem", omsOrderItem);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("mallorder:omsorderitem:save")
    public R save(@RequestBody OmsOrderItemEntity omsOrderItem){
		omsOrderItemService.save(omsOrderItem);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("mallorder:omsorderitem:update")
    public R update(@RequestBody OmsOrderItemEntity omsOrderItem){
		omsOrderItemService.updateById(omsOrderItem);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("mallorder:omsorderitem:delete")
    public R delete(@RequestBody Long[] ids){
		omsOrderItemService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

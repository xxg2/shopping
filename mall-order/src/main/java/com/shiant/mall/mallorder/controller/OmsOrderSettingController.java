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

import com.shiant.mall.mallorder.entity.OmsOrderSettingEntity;
import com.shiant.mall.mallorder.service.OmsOrderSettingService;
import com.shiant.mall.common.utils.PageUtils;
import com.shiant.mall.common.utils.R;



/**
 * 订单配置信息
 *
 * @author tom
 * @email 277215745@qq.com
 * @date 2024-11-19 21:31:23
 */
@RestController
@RequestMapping("mallorder/omsordersetting")
public class OmsOrderSettingController {
    @Autowired
    private OmsOrderSettingService omsOrderSettingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("mallorder:omsordersetting:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = omsOrderSettingService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("mallorder:omsordersetting:info")
    public R info(@PathVariable("id") Long id){
		OmsOrderSettingEntity omsOrderSetting = omsOrderSettingService.getById(id);

        return R.ok().put("omsOrderSetting", omsOrderSetting);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("mallorder:omsordersetting:save")
    public R save(@RequestBody OmsOrderSettingEntity omsOrderSetting){
		omsOrderSettingService.save(omsOrderSetting);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("mallorder:omsordersetting:update")
    public R update(@RequestBody OmsOrderSettingEntity omsOrderSetting){
		omsOrderSettingService.updateById(omsOrderSetting);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("mallorder:omsordersetting:delete")
    public R delete(@RequestBody Long[] ids){
		omsOrderSettingService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

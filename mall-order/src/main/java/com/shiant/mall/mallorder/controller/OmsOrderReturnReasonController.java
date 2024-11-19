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

import com.shiant.mall.mallorder.entity.OmsOrderReturnReasonEntity;
import com.shiant.mall.mallorder.service.OmsOrderReturnReasonService;
import com.shiant.mall.common.utils.PageUtils;
import com.shiant.mall.common.utils.R;



/**
 * 退货原因
 *
 * @author tom
 * @email 277215745@qq.com
 * @date 2024-11-19 21:31:23
 */
@RestController
@RequestMapping("mallorder/omsorderreturnreason")
public class OmsOrderReturnReasonController {
    @Autowired
    private OmsOrderReturnReasonService omsOrderReturnReasonService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("mallorder:omsorderreturnreason:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = omsOrderReturnReasonService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("mallorder:omsorderreturnreason:info")
    public R info(@PathVariable("id") Long id){
		OmsOrderReturnReasonEntity omsOrderReturnReason = omsOrderReturnReasonService.getById(id);

        return R.ok().put("omsOrderReturnReason", omsOrderReturnReason);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("mallorder:omsorderreturnreason:save")
    public R save(@RequestBody OmsOrderReturnReasonEntity omsOrderReturnReason){
		omsOrderReturnReasonService.save(omsOrderReturnReason);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("mallorder:omsorderreturnreason:update")
    public R update(@RequestBody OmsOrderReturnReasonEntity omsOrderReturnReason){
		omsOrderReturnReasonService.updateById(omsOrderReturnReason);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("mallorder:omsorderreturnreason:delete")
    public R delete(@RequestBody Long[] ids){
		omsOrderReturnReasonService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

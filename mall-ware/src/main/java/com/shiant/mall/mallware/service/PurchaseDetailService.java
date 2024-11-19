package com.shiant.mall.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shiant.mall.common.utils.PageUtils;
import com.shiant.mall.mallware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author tom
 * @email 277215745@qq.com
 * @date 2024-11-19 21:37:29
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


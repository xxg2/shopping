package com.shiant.mall.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shiant.mall.common.utils.PageUtils;
import com.shiant.mall.mallproduct.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author tom
 * @email 277215745@qq.com
 * @date 2024-11-19 10:26:10
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


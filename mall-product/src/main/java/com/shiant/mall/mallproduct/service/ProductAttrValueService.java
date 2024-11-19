package com.shiant.mall.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shiant.mall.common.utils.PageUtils;
import com.shiant.mall.mallproduct.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author tom
 * @email 277215745@qq.com
 * @date 2024-11-19 10:26:10
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.shiant.mall.mallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shiant.mall.common.utils.PageUtils;
import com.shiant.mall.mallcoupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author tom
 * @email 277215745@qq.com
 * @date 2024-11-19 21:04:24
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


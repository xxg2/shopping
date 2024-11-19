package com.shiant.mall.mallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shiant.mall.common.utils.PageUtils;
import com.shiant.mall.mallmember.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author tom
 * @email 277215745@qq.com
 * @date 2024-11-19 21:18:41
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


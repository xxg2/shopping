package com.shiant.mall.mallmember.dao;

import com.shiant.mall.mallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tom
 * @email 277215745@qq.com
 * @date 2024-11-19 21:18:41
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

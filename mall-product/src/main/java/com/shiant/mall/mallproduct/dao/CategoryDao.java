package com.shiant.mall.mallproduct.dao;

import com.shiant.mall.mallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tom
 * @email 277215745@qq.com
 * @date 2024-11-19 10:26:10
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

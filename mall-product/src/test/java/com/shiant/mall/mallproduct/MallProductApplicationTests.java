package com.shiant.mall.mallproduct;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shiant.mall.mallproduct.entity.BrandEntity;
import com.shiant.mall.mallproduct.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setName("xiaomi");
//		brandService.save(brandEntity);
//		System.out.println("success");
		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("name", "xiaomi"));
		list.forEach(System.out::println);
	}

}

package com.mall.mallproduct;

import com.mall.mallproduct.entity.BrandEntity;
import com.mall.mallproduct.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	public void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setBrandId(1L);
		brandEntity.setName("测试");
		brandEntity.setDescript("测试");

		brandService.save(brandEntity);

		System.out.println("添加成功！");
	}

}

package person.bing.testservicetwo.homepage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import person.bing.testservicetwo.homepage.bean.CategoryModel;
import person.bing.testservicetwo.homepage.dao.java.CategoryMapper;
import person.bing.testservicetwo.homepage.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryMapper mapper;
	

	@Override
	public List<CategoryModel> getCategory() {
		List<CategoryModel> cats = mapper.getCategory();
//		Jedis jedis = RedisUtil.getJedis();
//		jedis.set("name", "mengfanbing");
		return cats;
	}
}

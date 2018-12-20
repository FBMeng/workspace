package person.bing.testservicetwo.homepage.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import person.bing.testservicetwo.homepage.bean.CategoryModel;
import person.bing.testservicetwo.homepage.service.CategoryService;

@RestController
public class CategoryController {
	private final Logger logger = LoggerFactory.getLogger(CategoryController.class);
	@Autowired
	private CategoryService categoryService;
//	@Autowired
//	TestConfig config;
	
	@RequestMapping("/getCategory")
	public Object getCategory(HttpServletResponse response){
		List<CategoryModel> cats = categoryService.getCategory();
//		System.out.println(config.getHostName());
//		System.out.println(config.getPort());
//		logger.debug("cats");
		logger.info("cats");
		logger.warn("cats");
		logger.error("cats");
		response.setHeader("Access-Control-Allow-Origin", "*");
		return cats;
	}
}
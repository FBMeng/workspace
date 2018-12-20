package person.bing.testservicetwo.post.controller;

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import person.bing.testservicetwo.post.bean.PostModel;
import person.bing.testservicetwo.post.service.PostService;

@RestController
public class PostController {
	@Autowired
	private PostService postService;
	
	@RequestMapping("/addPost")
	public Object addPost(
			@RequestParam(value="userId",required=true)int userId,
			@RequestParam(value="categoryId",required=true)int categoryId,
			@RequestParam(value="title",required=true)String title,
			@RequestParam(value="text",required=true)String text,
			HttpServletResponse response){
		PostModel model = new PostModel();
		model.setUserId(userId);
		model.setCategoryId(categoryId);
		model.setTitle(title);
//		model.setText(text.getBytes());
		model.setText(text.getBytes());
		model.setCreatedDate(new Date());
		int id = postService.addPost(model);
		response.setHeader("Access-Control-Allow-Origin", "*");
		return id;
	}
	
	@RequestMapping("/getPosts")
	public Object getPosts(
			@RequestParam(value="userId",required=false)Integer userId,
			@RequestParam(value="categoryId",required=false)Integer categoryId,
			HttpServletResponse response){
		PostModel model = new PostModel();
		model.setUserId(userId);
		model.setCategoryId(categoryId);
		List<PostModel> models = postService.getPosts(model);
		for(PostModel mo:models){
			mo.setTextString(new String(mo.getText()));
			mo.setText(null);
		}
//		for(PostModel mo:models){
//			File file = new File("D:/a.txt");
//			try {
//				FileOutputStream fos = new FileOutputStream(file);
//				fos.write(mo.getText());
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(mo.getText());
//		}
//		String st = null;
//		for(PostModel mo:models){
//			try {
//				st = new String(mo.getText(),"UTF-8");
//			} catch (UnsupportedEncodingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(st);
//		}
		response.setHeader("Access-Control-Allow-Origin", "*");
		return models;
	}
	//获得帖子详情
	@RequestMapping("/getPostInfo")
	public Object getPostInfo(@RequestParam(value="postId")Integer postId,HttpServletResponse response){
		PostModel model = new PostModel();
		PostModel result = new PostModel();
		model.setId(postId);
		result = postService.getPostInfo(model);
		result.setTextString(new String(result.getText()));
		response.setHeader("Access-Control-Allow-Origin", "*");
		return result;
	}
}

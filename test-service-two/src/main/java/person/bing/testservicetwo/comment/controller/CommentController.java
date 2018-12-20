package person.bing.testservicetwo.comment.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import person.bing.testservicetwo.comment.bean.CommentModel;
import person.bing.testservicetwo.comment.servcie.CommentService;

@RestController
public class CommentController {
	
	@Autowired
	private CommentService service;
	
	@RequestMapping(value="/addComment",method=RequestMethod.POST)
	public Object addComment(
			@RequestParam(value="postId",required=false)Integer postId,
			@RequestParam(value="userId",required=false)Integer userId,
			@RequestParam(value="commentText",required=false)String commentText,
			HttpServletResponse response){
		response.setHeader("Access-Control-Allow-Origin", "*");
		CommentModel model = new CommentModel();
		model.setUserId(userId);
		model.setPostId(postId);
		model.setCommentText(commentText.getBytes());
		model.setCreatedDate(new Date());
		Integer commentId = service.addComment(model);
		return commentId;
	}
	
	@RequestMapping(value="/getComments",method=RequestMethod.GET)
	public Object getComment(
			@RequestParam(value="postId",required=false)Integer postId,
			HttpServletResponse response) throws UnsupportedEncodingException{
		response.setHeader("Access-Control-Allow-Origin", "*");
		CommentModel model = new CommentModel();
		model.setPostId(postId);
		List<CommentModel> comments = service.getComments(model);
		for(CommentModel cModel:comments){
			cModel.setCommentTextString(new String(cModel.getCommentText(),"utf-8"));
//			System.out.println(new String(cModel.getCommentText(),"utf-8"));
		}
		return comments;
	}
}

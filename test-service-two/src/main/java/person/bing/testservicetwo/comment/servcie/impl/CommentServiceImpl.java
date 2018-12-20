package person.bing.testservicetwo.comment.servcie.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import person.bing.testservicetwo.comment.bean.CommentModel;
import person.bing.testservicetwo.comment.dao.java.CommentMapper;
import person.bing.testservicetwo.comment.servcie.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentMapper mapper;
	
	@Override
	public Integer addComment(CommentModel model) {
		mapper.addComment(model);
		Integer commentId = model.getId();
		return commentId;
	}
	
	@Override
	public List<CommentModel> getComments(CommentModel model) {
		List<CommentModel> commens = mapper.getComments(model);
		return commens;
	}

}

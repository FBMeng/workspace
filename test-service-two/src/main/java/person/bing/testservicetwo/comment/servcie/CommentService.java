package person.bing.testservicetwo.comment.servcie;

import java.util.List;

import person.bing.testservicetwo.comment.bean.CommentModel;


public interface CommentService {
	public Integer addComment(CommentModel model);
	public List<CommentModel> getComments(CommentModel model);
}

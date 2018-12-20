package person.bing.testservicetwo.comment.dao.java;

import java.util.List;

import org.springframework.stereotype.Repository;

import person.bing.testservicetwo.comment.bean.CommentModel;

@Repository
public interface CommentMapper {
	public Integer addComment(CommentModel model);
	public List<CommentModel> getComments(CommentModel model);
}

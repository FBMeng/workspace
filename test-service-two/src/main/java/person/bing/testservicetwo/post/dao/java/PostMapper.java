package person.bing.testservicetwo.post.dao.java;

import java.util.List;

import person.bing.testservicetwo.post.bean.PostModel;

public interface PostMapper {
	public int addPost(PostModel model);
	public List<PostModel> getPosts(PostModel model);
	public PostModel getPostInfo(PostModel model);
}

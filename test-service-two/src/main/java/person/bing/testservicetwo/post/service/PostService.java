package person.bing.testservicetwo.post.service;

import java.util.List;

import person.bing.testservicetwo.post.bean.PostModel;

public interface PostService {
	public int addPost(PostModel model);
	public List<PostModel> getPosts(PostModel model);
	public PostModel getPostInfo(PostModel model);
}

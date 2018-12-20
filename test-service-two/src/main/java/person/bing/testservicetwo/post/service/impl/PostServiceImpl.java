package person.bing.testservicetwo.post.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import person.bing.testservicetwo.post.bean.PostModel;
import person.bing.testservicetwo.post.dao.java.PostMapper;
import person.bing.testservicetwo.post.service.PostService;
@Service
public class PostServiceImpl implements PostService{

	@Autowired
	private PostMapper mapper;
	
	@Override
	public int addPost(PostModel model) {
		mapper.addPost(model);
		return model.getId();
	}
	
	@Override
	public List<PostModel> getPosts(PostModel model) {
		List<PostModel> models = mapper.getPosts(model);
		return models;
	}

	@Override
	public PostModel getPostInfo(PostModel model) {
		PostModel result = mapper.getPostInfo(model);
		return result;
	}

}

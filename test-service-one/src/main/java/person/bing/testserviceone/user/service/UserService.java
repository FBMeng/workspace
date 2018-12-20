package person.bing.testserviceone.user.service;

import java.util.List;

import person.bing.testserviceone.user.bean.User;


public interface UserService {
	public List<User> getUsers(User user);
	public int addUser(User user);
	public Integer isExist(User user);
}

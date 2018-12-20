package person.bing.testserviceone.user.dao.java;

import java.util.List;

import org.springframework.stereotype.Repository;

import person.bing.testserviceone.user.bean.User;

@Repository
public interface UserMapper {
	public List<User> getUsers(User user);
	public int addUser(User user);
	public Integer isExist(User user);
}

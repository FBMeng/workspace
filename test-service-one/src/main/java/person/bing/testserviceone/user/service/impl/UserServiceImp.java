package person.bing.testserviceone.user.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import person.bing.testserviceone.user.bean.User;
import person.bing.testserviceone.user.dao.java.UserMapper;
import person.bing.testserviceone.user.service.UserService;
import person.bing.testserviceone.utils.SHAencrypt;

/**
 * @author mengf
 *
 */
@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> getUsers(User user) {
//		Jedis jedis = RedisUtil.getJedis();
//		Map<String,String> userMap = jedis.hgetAll("test:user:"+user.getId());
//		System.out.println(userMap);
//		if(userMap.size()==0){
//			return userMapper.getUsers(user);
//		}else{
//			
//		}
		return userMapper.getUsers(user);
	}

	@Override
	public int addUser(User user) {
		String pwd = null;
		try {
			//添加到mysql
			pwd = SHAencrypt.encryptSHA(user.getUserPwd());
			user.setUserPwd(pwd);
			userMapper.addUser(user);
			//缓存到redis
//			Jedis jedis = RedisUtil.getJedis();
			Map<String,String> map = new HashMap<>();
			String userName = user.getUserName();
			map.put("userName", userName);
			map.put("password", pwd);
//			String result = jedis.hmset("test:user:"+userName, map);
//			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user.getId();
	}

	@Override
	public Integer isExist(User user) {
		try {
			String password = SHAencrypt.encryptSHA(user.getUserPwd());
			user.setUserPwd(password);
			//从redis中查找用户是否存在
//			Jedis jedis = RedisUtil.getJedis();
//			String pass = jedis.hget("test:user:"+user.getUserName(), "password");
//			if(pass != null && password.equals(pass) ){
//					return 1;
//			}else{
				Integer result = userMapper.isExist(user);
				if(result>=0){
					return 1;
				}
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}

package person.bing.testserviceone.user.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import person.bing.testserviceone.user.bean.User;
import person.bing.testserviceone.user.service.UserService;


@RestController
public class UserController {
	public static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUsers")
	public Object getUsers(
			@RequestParam(value="userId",required=false)Integer userId,
			HttpServletResponse response){
		User user = new User();
		user.setId(userId);
		List<User> users = userService.getUsers(user);
		for(User us:users){
			us.setFormatDate(SDF.format(us.getCreatedDate()));
			us.setCreatedDate(null);
		}
		for(int i=0;i<5;i++){
			System.out.println("");
		}
		System.out.println("222");
//		response.setHeader("Access-Control-Allow-Origin", "*");
		return users;
	}
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public Object addUser(String name,String password,HttpServletResponse response){
		User user  = new User();
		Date date = new Date();
		user.setUserName(name);
		user.setUserPwd(password);
		user.setCreatedDate(date);
		int result = userService.addUser(user);
		response.setHeader("Access-Control-Allow-Origin", "*");
		return result;
	}
	@RequestMapping(value="/isExist",method=RequestMethod.POST)
	public Object isExist(String name,String password,HttpServletResponse response){
		User user = new User();
		user.setUserName(name);
		user.setUserPwd(password);
		response.setHeader("Access-Control-Allow-Origin", "*");
		for(int i=0;i<5;i++){
			System.out.println("");
		}
		System.out.println("222");
		Integer userId = userService.isExist(user);
		return userId;
	}
}

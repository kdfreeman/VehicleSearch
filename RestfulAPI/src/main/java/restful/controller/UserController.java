package restful.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import restful.model.User;
 
@RestController
public class UserController {
	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET, produces = { "application/json" })
	public User qryUser(@PathVariable(required = true, value = "userId") Long userId) {
		User user = new User();
		user.setUserId(userId);
		user.setUserName("user_"+userId.toString());
		return user;
	}
}

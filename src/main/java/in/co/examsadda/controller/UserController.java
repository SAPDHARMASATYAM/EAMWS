package in.co.examsadda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.co.examsadda.entity.User;
import in.co.examsadda.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET, produces = "application/json")
	public User findByEmailIdAndPasswordAndActive(@RequestParam(name="emailId") String emailId, @RequestParam(name="password") String password) throws Exception {
		return userService.userLogin(emailId, password);
	}
	
	@RequestMapping(value = "/getUsersByActiveIndicator", method = RequestMethod.GET, produces = "application/json")
	public List<User> getUsersByActiveIndicator(@RequestParam(name="active") Boolean active) throws Exception {
		return userService.getUsersByActiveIndicator(active);
	}
}

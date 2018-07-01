package in.co.examsadda.service;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import in.co.examsadda.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	@Autowired
	private UserService userService;
	@Test
	public void registerUser() throws Exception {
		User user = new User();
		user.setEmailId("sap.koduri@gmail.com");
		user.setUserActive(true);
		user.setPassword("password");
		user.setLastLogin(new Date());
		user.setDatOfRegistration(new Date());
		user.setNew(false);
		User registerUserResponse = userService.registerUser(user);
		System.out.println("registerUserResponse :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: "+registerUserResponse);
		Assert.assertNotEquals(null, registerUserResponse);
		
}
//	@Test
//	public void userLogin() {
//		User user = new User();
//		user.setEmailId("sap.koduri@yahoo.com");
//		user.setPassword("password");
//		user.setLastLogin(new Date());
//		User userLoginResponse = userService.userLogin(user.getEmailId(), user.getPassword());
//		System.out.println("userLoginResponse :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: "+userLoginResponse);
//		Assert.assertNotEquals(null, userLoginResponse);
//	}
}

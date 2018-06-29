package in.co.examsadda.service;

import java.util.List;

import in.co.examsadda.entity.User;

public interface UserService {

	User userLogin(String emailId, String password);

	List<User> getUsersByActiveIndicator(Boolean active);

	int updatePasswordByEmailId(String password, String emailId);

	User getUserByEmailIdId(String emailId);

	User registerUser(User user);

}
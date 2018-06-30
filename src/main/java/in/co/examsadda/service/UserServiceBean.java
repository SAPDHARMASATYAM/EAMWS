package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import in.co.examsadda.crud.repository.UserRepository;
import in.co.examsadda.entity.User;


public class UserServiceBean implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User userLogin(String emailId, String password) {
		User loginResponse = userRepository.findByEmailIdAndPasswordAndIsUserActive(emailId, password, true);
		return loginResponse;
	}

	@Override
	public List<User> getUsersByActiveIndicator(Boolean active){
		return userRepository.findAllByIsUserActive(active);
	}
	@Override
	public int updatePasswordByEmailId(String password, String emailId) {
		return 0;//userRepository.updatePasswordByEmailId(password, emailId);
	}

	@Override
	public User getUserByEmailIdId(String emailId) {
		return userRepository.findById(emailId).get();
	}
	@Override
	public User registerUser(User user) {
		return userRepository.save(user);
	}
}

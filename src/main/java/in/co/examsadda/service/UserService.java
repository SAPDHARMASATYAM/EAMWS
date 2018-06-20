package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.crud.repository.UserRepository;
import in.co.examsadda.entity.User;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User userLogin(String emailId, String password) {
		User loginResponse = userRepository.findByEmailIdAndPasswordAndActive(emailId, password, true);
		return loginResponse;
	}

	public List<User> getUsersByActiveIndicator(Boolean active){
		return userRepository.findAllByActive(active);
	}
	public int updatePasswordByEmailId(String password, String emailId) {
		return 1;// userRepository.updatePasswordByEmailId(password, emailId);
	}
}

package in.co.examsadda.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.crud.repository.UserRepository;
import in.co.examsadda.entity.User;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User userLogin(User user) {
		Optional<User> loginResponse = userRepository.findByEmailIdAndPasswordAndActive(user.getEmailId(),
				user.getPassword(), true);
		if (loginResponse != null && loginResponse.isPresent()) {
			return loginResponse.get();
		} else {
			throw new RuntimeException("Login Failed");
		}
	}

	public int updatePasswordByEmailId(String password, String emailId) {
		return 1;// userRepository.updatePasswordByEmailId(password, emailId);
	}
}

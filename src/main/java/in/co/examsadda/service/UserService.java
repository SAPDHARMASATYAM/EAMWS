package in.co.examsadda.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.User;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public interface UserService {

	User userLogin(String emailId, String password);

	List<User> getUsersByActiveIndicator(Boolean active);

	int updatePasswordByEmailId(String password, String emailId);

	User getUserByEmailIdId(String emailId);

	User registerUser(User user);

}
/**
 * 
 */
package in.co.examsadda.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

	public User findByEmailIdAndPasswordAndActive(String emailId, String password, Boolean active);

	public List<User> findAllByActive(Boolean active);
	// @Modifying
	// @Query("update user set password = :password where emailId = :emailId and
	// active = 1")
	// int updatePasswordByEmailId(@Param("password") String password,
	// @Param("emailId") String emailId);

}

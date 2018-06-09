/**
 * 
 */
package in.co.examsadda.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

	public Optional<User> findByEmailIdAndPasswordAndActive(String emailId, String password, Boolean active);
	
	@Modifying
	@Query("update user set password = :password where emailId = :emailId and active = 1")
	int updatePasswordByEmailId(@Param("password") String password, @Param("emailId") String emailId);
	
}

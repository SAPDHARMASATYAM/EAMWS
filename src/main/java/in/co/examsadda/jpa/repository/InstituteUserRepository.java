package in.co.examsadda.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.InstituteUser;
import in.co.examsadda.entity.InstituteUserPK;

@Repository
public interface InstituteUserRepository extends JpaRepository<InstituteUser, InstituteUserPK> {
	
	public InstituteUser findByPkId(InstituteUserPK instituteUserPK);
	
	public InstituteUser findByPkIdUserIdFk(String userId);
	
	public List<InstituteUser> findAllByPkIdUserIdFk(String userId);

}

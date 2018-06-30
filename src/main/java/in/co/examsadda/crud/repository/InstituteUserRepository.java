package in.co.examsadda.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.InstituteUser;
import in.co.examsadda.entity.InstituteUserPK;

@Repository
public interface InstituteUserRepository extends CrudRepository<InstituteUser, InstituteUserPK> {
	
	public InstituteUser findByPkId(InstituteUserPK instituteUserPK);
	
	public InstituteUser findByPkIdUserIdFk(String userId);
	
	public List<InstituteUser> findAllByPkIdUserIdFk(String userId);

}

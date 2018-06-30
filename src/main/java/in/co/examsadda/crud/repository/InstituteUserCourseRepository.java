package in.co.examsadda.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.InstituteUserCourse;
import in.co.examsadda.entity.InstituteUserCoursePK;

@Repository
public interface InstituteUserCourseRepository extends CrudRepository<InstituteUserCourse, InstituteUserCoursePK> {

	public List<InstituteUserCourse> findAllByIucPkIdInstituteIdFkAndIucPkIdUserIdFk(String instituteId, String userId);

	public List<InstituteUserCourse> findAllByIucPkIdInstituteIdFk(String instituteId);
}

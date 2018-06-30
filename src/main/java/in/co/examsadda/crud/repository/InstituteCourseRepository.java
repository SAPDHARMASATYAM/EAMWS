package in.co.examsadda.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.Course;
import in.co.examsadda.entity.InstituteCourse;
import in.co.examsadda.entity.InstituteCoursePK;

@Repository
public interface InstituteCourseRepository extends CrudRepository<InstituteCourse, InstituteCoursePK> {
	
	public List<Course> findAllByPkIdInstituteIdFk(String instituteId);
	
}

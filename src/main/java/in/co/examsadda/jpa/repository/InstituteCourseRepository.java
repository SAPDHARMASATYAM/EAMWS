package in.co.examsadda.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.Course;
import in.co.examsadda.entity.InstituteCourse;
import in.co.examsadda.entity.InstituteCoursePK;

@Repository
public interface InstituteCourseRepository extends JpaRepository<InstituteCourse, InstituteCoursePK> {
	
	public List<Course> findAllByPkIdInstituteIdFk(String instituteId);
	
}

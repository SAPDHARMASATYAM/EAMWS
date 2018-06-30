package in.co.examsadda.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

	public Course findByCourseId(int courseId);
	
	
}

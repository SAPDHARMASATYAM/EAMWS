package in.co.examsadda.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

	public Course findByCourseId(int courseId);
	
	
}

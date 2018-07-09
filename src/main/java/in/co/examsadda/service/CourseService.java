package in.co.examsadda.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Course;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public interface CourseService {

	public Course addCourse(Course course);
	public Course getCourse(int courseId);
	public List<Course> getCoursesByCourseIds(List<Integer> courseIds);
	public List<Course> getAllCourses();

	public Course updateCourse(Course course);
	public void deleteCourse(Course course);

}
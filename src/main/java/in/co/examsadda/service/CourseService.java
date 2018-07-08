package in.co.examsadda.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Course;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public interface CourseService {

	Course addCourse(Course course);

	Course getCourse(int courseId);

	Course updateCourse(Course course);

	void deleteCourse(Course course);

}
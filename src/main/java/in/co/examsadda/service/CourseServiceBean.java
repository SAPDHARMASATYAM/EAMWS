package in.co.examsadda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Course;
import in.co.examsadda.jpa.CourseRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CourseServiceBean implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public Course addCourse(Course course) {
		return courseRepository.save(course);
	}
	
	@Override
	public Course getCourse(int courseId) {
		return courseRepository.findById(courseId).get();
	}
	
	@Override
	public Course updateCourse(Course course) {
		return addCourse(course);
	}
	
	@Override
	public void deleteCourse(Course course) {
		 courseRepository.delete(course);
	}
}
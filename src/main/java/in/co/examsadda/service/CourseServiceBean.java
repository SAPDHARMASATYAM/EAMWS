package in.co.examsadda.service;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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
		Course saveResponse = null;
		try {
			saveResponse = courseRepository.save(course);
		} catch (DataIntegrityViolationException |ConstraintViolationException e) {
			throw new RuntimeException("Duplicate Entry");
		}
		return saveResponse;
	}
	
	@Override
	public Course getCourse(int courseId) {
		return courseRepository.getOne(courseId);
	}
	
	@Override
	public Course updateCourse(Course course) {
		return addCourse(course);
	}
	
	@Override
	public void deleteCourse(Course course) {
		 courseRepository.delete(course);
	}

	@Override
	public List<Course> getCoursesByCourseIds(List<Integer> courseIds) {
		List<Course> findAllCoursesList = courseRepository.findAllById(courseIds);
		return findAllCoursesList;
	}

	@Override
	public List<Course> getAllCourses() {
		List<Course> allCourses = courseRepository.findAll();
		return allCourses;
	}
}
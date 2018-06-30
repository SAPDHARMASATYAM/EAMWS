package in.co.examsadda.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.crud.repository.CourseRepository;
import in.co.examsadda.entity.Course;

@Service
public class CourseServiceBean {

	@Autowired
	private PracticePaperService practicePaperService;
	@Autowired
	private CourseRepository courseRepository;
	
	public Course addCourse(Course course) {
		return courseRepository.save(course);
	}
	
	public Course getCourse(int courseId) {
		return courseRepository.findById(courseId).get();
	}
	
	public Course updateCourse(Course course) {
		return addCourse(course);
	}
	
	public void deleteCourse(Course course) {
		 courseRepository.delete(course);
	}
	
	public Set<Course> getAllCourses(){
		return (Set<Course>) courseRepository.findAll();
	}
	
}
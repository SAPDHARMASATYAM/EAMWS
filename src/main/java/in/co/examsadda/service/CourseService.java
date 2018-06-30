package in.co.examsadda.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import in.co.examsadda.entity.Course;

@Service
public interface CourseService {

	Course addCourse(Course course);

	Course getCourse(int courseId);

	Course updateCourse(Course course);

	void deleteCourse(Course course);

	Set<Course> getAllCourses();

}
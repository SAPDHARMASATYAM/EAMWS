package in.co.examsadda.service;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import in.co.examsadda.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseServiceTest {
	
	@Autowired
	private CourseService courseService;
	
	@Test
	public void addCourseTest() {
		
		Course course = new Course();
		course.setCourseActive(true);
		course.setCourseNameInEnglish("Constable");
		course.setCourseNameInRegional("కానిస్టేబుల్");
		course.setNew(true);
		course.setDatOfCourseRegistration(new Date());
		Course addCourseResponse = courseService.addCourse(course);
		System.err.println(addCourseResponse);
		Assert.assertNotEquals(true, addCourseResponse);
	}
	
	@Test
	public void getAllCoursesTest() {
		
		List<Course> allCourses = courseService.getAllCourses();
		
		System.err.println(allCourses);
		Assert.assertNotEquals(0, allCourses.size());
	}
}

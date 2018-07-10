package in.co.examsadda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.co.examsadda.entity.Course;
import in.co.examsadda.service.CourseService;

@Controller
@RequestMapping("courses")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value = "/getAllCourses", method = RequestMethod.GET, produces = "application/json")
	public List<Course> getAllCourses() throws Exception {
		return courseService.getAllCourses();
	}
}

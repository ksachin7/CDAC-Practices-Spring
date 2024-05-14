package com.example.restAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restAPI.entity.Course;
import com.example.restAPI.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "this is homepage";
	}

	// get courses
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();
	}

	// getting a particular course
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourses(Long.parseLong(courseId));
	}

	// post-mapping(adding/creating course)
//	@PostMapping(path = "/courses", consumes = "application/json")
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {

		return this.courseService.addCourse(course);
	}
//
//	// TODO: put-mapping(updating course)
//	@PutMapping
//	public Course updateCourse() {s
//
//		return this.courseService.updateCourse();
//	}
//
//	// TODO: delete-mapping(deleting-course)
//	@DeleteMapping
//	public Course deleteCourse() {
//
//		return this.courseService.deleteCourse();
//	}

}

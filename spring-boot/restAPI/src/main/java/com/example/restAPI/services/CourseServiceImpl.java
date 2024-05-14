package com.example.restAPI.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restAPI.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;

	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(121, "java", "Java is an OOPL."));
		list.add(new Course(111, "Python", "python is an interpreted programming language."));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourses(long courseId) {
		Course c = null;
		for (Course course : list) {
			if (course.getId() == courseId) {
				c = course;
				break;
			}
		}

		return c;
	}

	@Override
	public Course addCourse(Course course) {

		list.add(course);
		return course;
	}

}

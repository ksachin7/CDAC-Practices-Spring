package com.example.restAPI.services;

import java.util.List;

import com.example.restAPI.entity.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getCourses(long courseId);

	public Course addCourse(Course course);
}

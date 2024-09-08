package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Courses;

public interface CourseService {

	
	public List<Courses> getCourses();

	public Courses getCourse(long courseId);

	public Courses addCourse(Courses courses);

	public Courses updateCourse(Courses courses);

	public void deleteCourse(long parseLong);
}

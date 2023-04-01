package com.ejahuira.rest.api.service;

import java.util.List;

import com.ejahuira.rest.api.model.Course;

public interface ICourseService {
	
	public Course createCourse(Course course);
	
	public List<Course> getAllCourse();
	
	public Course updateCourse(Integer id, Course course);
	
	public void deleteCourse(Integer id);

}

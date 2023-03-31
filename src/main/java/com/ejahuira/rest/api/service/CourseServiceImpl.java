package com.ejahuira.rest.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejahuira.rest.api.entity.Course;
import com.ejahuira.rest.api.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public Course createCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public List<Course> getAllCourse() {
		return courseRepository.findAll();
	}

	@Override
	public Course updateCourse(Integer id, Course course) {
		course.setIdCourse(null);
		return courseRepository.save(course);
	}

	@Override
	public void deleteCourse(Integer id) {
		courseRepository.deleteById(null);		
	}

}

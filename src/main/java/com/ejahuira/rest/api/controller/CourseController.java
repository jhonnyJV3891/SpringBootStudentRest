package com.ejahuira.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejahuira.rest.api.entity.Course;
import com.ejahuira.rest.api.service.CourseService;

@RestController
@RequestMapping("/rest/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
		
	@PostMapping("/save")
	public ResponseEntity<Course> createCourse(@RequestBody Course course) {
		
		return new ResponseEntity<Course>(courseService.createCourse(course), HttpStatus.CREATED);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Course>> getAllCourse(){
		
		return new ResponseEntity<List<Course>>(courseService.getAllCourse(), HttpStatus.OK);
	}
	
	@PutMapping("/edit/{id}")
	public ResponseEntity<Course> updateCourse(@PathVariable("id") Integer id, @RequestBody Course course){
		return new ResponseEntity<Course>(courseService.updateCourse(id, course), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable("id") Integer id){
		courseService.deleteCourse(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
}

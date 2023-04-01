package com.ejahuira.rest.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

import com.ejahuira.rest.api.dto.CourseDto;
import com.ejahuira.rest.api.dto.StudentDto;
import com.ejahuira.rest.api.model.Course;
import com.ejahuira.rest.api.model.Student;
import com.ejahuira.rest.api.service.ICourseService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/course")
public class CourseController {

	@Autowired
	private ICourseService courseService;	
	
	@Qualifier("courseMapper")
	private ModelMapper mapper;
		
	@PostMapping("/save")
	public ResponseEntity<CourseDto> createCourse(@Valid @RequestBody CourseDto dto) throws Exception{
		Course obj = courseService.createCourse(convertToEntity(dto));
        return new ResponseEntity<>(convertToDto(obj), HttpStatus.CREATED);	
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<CourseDto>> getAllCourse() throws Exception{
		List<CourseDto> list = courseService.getAllCourse().stream().map(this::convertToDto).collect(Collectors.toList());
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@PutMapping("/edit/{id}")
	public ResponseEntity<CourseDto> updateCourse(@Valid @PathVariable("id") Integer id,@Valid  @RequestBody CourseDto dto)throws Exception{
		Course obj = courseService.updateCourse(id, convertToEntity(dto));
		return new ResponseEntity<CourseDto>(convertToDto(obj), HttpStatus.OK);		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable("id") Integer id)throws Exception{
		courseService.deleteCourse(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	private CourseDto convertToDto(Course obj) {
        return mapper.map(obj, CourseDto.class);
    }

    private Course convertToEntity(CourseDto dto){
        return mapper.map(dto, Course.class);
    }
    
    
}

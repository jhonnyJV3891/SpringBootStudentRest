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
import com.ejahuira.rest.api.dto.StudentDto;
import com.ejahuira.rest.api.model.Student;
import com.ejahuira.rest.api.service.IStudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

	@Autowired
	private IStudentService studentService;
	
	@Qualifier("studentMapper")
	private ModelMapper mapper;
		
	@PostMapping("/save")
	public ResponseEntity<StudentDto> createStudent(@Valid @RequestBody StudentDto dto) throws Exception{
		Student obj = studentService.createStudent(convertToEntity(dto));
        return new ResponseEntity<>(convertToDto(obj), HttpStatus.CREATED);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<StudentDto>> getAllStudent()throws Exception{
		List<StudentDto> list = studentService.getAllStudent().stream().map(this::convertToDto).collect(Collectors.toList());
	    
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@PutMapping("/edit/{id}")
	public ResponseEntity<StudentDto> updateStudent(@Valid @PathVariable("id") Integer id,@Valid @RequestBody StudentDto dto) throws Exception{
		Student obj = studentService.updateStudent(id, convertToEntity(dto));
		return new ResponseEntity<StudentDto>(convertToDto(obj), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteStudent(@Valid @PathVariable("id") Integer id)throws Exception{
		studentService.deleteStudent(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	private StudentDto convertToDto(Student obj) {
        return mapper.map(obj, StudentDto.class);
    }

    private Student convertToEntity(StudentDto dto){
        return mapper.map(dto, Student.class);
    }
}

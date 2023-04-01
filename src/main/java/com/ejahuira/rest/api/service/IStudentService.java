package com.ejahuira.rest.api.service;

import java.util.List;

import com.ejahuira.rest.api.model.Student;

public interface IStudentService {
	
	public Student createStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student updateStudent(Integer id, Student student);
	
	public void deleteStudent(Integer id);

}

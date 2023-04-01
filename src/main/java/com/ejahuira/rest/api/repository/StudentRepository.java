package com.ejahuira.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejahuira.rest.api.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}

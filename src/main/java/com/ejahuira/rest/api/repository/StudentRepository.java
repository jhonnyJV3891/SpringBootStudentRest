package com.ejahuira.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejahuira.rest.api.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}

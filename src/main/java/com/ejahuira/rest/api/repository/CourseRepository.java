package com.ejahuira.rest.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ejahuira.rest.api.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}


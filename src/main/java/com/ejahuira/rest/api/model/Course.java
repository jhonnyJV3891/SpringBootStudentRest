package com.ejahuira.rest.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity	
@Table(name = "course")
public class Course {
	
	@EqualsAndHashCode.Include
	@Id
	@Column(name = "id_course")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCourse;

	@Column(nullable = false, length = 100)
	private String title;

	@Column(nullable = false, length = 100)
	private String acronym;

	@Column(nullable = false)
	private boolean state;
}

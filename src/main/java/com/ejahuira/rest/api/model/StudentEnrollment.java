package com.ejahuira.rest.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "student_enrollment")
public class StudentEnrollment {
	
	@EqualsAndHashCode.Include
	@Id
	@Column(name = "id_student_enrollment")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idStudentEnrollment;
	
	@ManyToOne
	@JoinColumn(name = "id_tuition", nullable = false)
	private Tuition tuition;

	@ManyToOne
	@JoinColumn(name = "id_course", nullable = false)
	private Course course;

	@Column(length = 50, nullable = false)
	private String classRoom;
}

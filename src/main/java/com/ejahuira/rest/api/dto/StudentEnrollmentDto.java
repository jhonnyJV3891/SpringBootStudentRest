package com.ejahuira.rest.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentEnrollmentDto {
		
	private Integer idStudentEnrollment;
	
//	@NotNull
//    @NotEmpty
//    @Size(min = 3, max = 150)
//	private TuitionDto tuition;

	@ManyToOne
	@JoinColumn(name = "id_course", nullable = false)
	private CourseDto course;

	@Column(length = 50, nullable = false)
	private String classRoom;
}

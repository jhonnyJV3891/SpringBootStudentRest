package com.ejahuira.rest.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class CourseDto {
	
	private Integer idCourse;

	@NotNull
    @NotEmpty
    @Size(min = 3, max = 150)
	private String title;
	
	@NotNull
    @NotEmpty
    @Size(min = 2, max = 10)
	@Column(nullable = false, length = 100)
	private String acronym;

	@NotNull
    @NotEmpty
	private boolean state;
}

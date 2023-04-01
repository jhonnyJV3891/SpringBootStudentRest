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
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentDto {
	
	private Integer idStudent;
	
	@NotNull
    @NotEmpty
    @Size(min = 3, max = 100)
	private String name;
	
	@NotNull
    @NotEmpty
    @Size(min = 3, max = 150)
	private String lastName;
	
	@NotNull
    @NotEmpty
    @Size(min = 3, max = 15)
	private String dni;
	
	@NotNull
	@NotEmpty
	private int age;

	
}

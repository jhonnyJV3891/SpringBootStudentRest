package com.ejahuira.rest.api.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "student")
public class Student {
	
	@EqualsAndHashCode.Include
	@Id
	@Column(name = "id_student")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idStudent;
	
	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(name = "last_name",nullable = false, length = 100)
	private String lastName;
	
	@Column(name = "dni",nullable = false, length = 15)
	private String dni;
	
	@Column(nullable = false, length = 3)
	private int age;

	
}

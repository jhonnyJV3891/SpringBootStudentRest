package com.ejahuira.rest.api.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tuition")
public class Tuition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false,name = "date_tuition")	
	private LocalDateTime dateTuition;

	@ManyToOne
	@JoinColumn(name = "id_student", nullable = false, foreignKey = @ForeignKey(name = "fk_student"))
	private Student student;

	//@OneToMany(mappedBy = "student_enrollment", cascade = CascadeType.ALL)
	//private List<StudentEnrollment> studentEnrollments;

	@Column(nullable = false)
	private boolean estado;	
}

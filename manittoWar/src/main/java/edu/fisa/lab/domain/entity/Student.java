package edu.fisa.lab.domain.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Builder

@Entity
public class Student {

	@Id
	@SequenceGenerator(name = "std_seq", sequenceName = "std_seq_id", initialValue = 1, allocationSize = 50)
	private long id;
	
	@Nonnull
	private String name;
	
	@Nonnull
	private String pw;
	
	private long targetId;
	
}

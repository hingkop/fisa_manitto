package edu.fisa.lab.domain.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder

@Entity
public class Board {
	
	@Id
	@SequenceGenerator(name = "board_seq", sequenceName = "board_seq_id", initialValue = 1, allocationSize = 50)
	private long boardId;
	
	@Nonnull
	private String title;
	
	@Nonnull
	private String content;

}

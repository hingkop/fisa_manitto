package edu.fisa.lab.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fisa.lab.domain.entity.Board;

public interface BoardDAO extends JpaRepository<Board, Long>{

	
}

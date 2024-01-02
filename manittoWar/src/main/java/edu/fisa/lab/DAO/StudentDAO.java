package edu.fisa.lab.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fisa.lab.domain.entity.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Long>{
		
	Student findStudentByTargetId(Long targetId);
	
	Student findStudentByNameAndPw(String id, String pw);
}
       
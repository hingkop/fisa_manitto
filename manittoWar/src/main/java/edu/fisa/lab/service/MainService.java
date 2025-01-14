package edu.fisa.lab.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fisa.lab.DAO.BoardDAO;
import edu.fisa.lab.DAO.StudentDAO;
import edu.fisa.lab.domain.entity.Board;
import edu.fisa.lab.domain.entity.Student;
import edu.fisa.lab.resDto.StudentResDto;



@Service
public class MainService {

	@Autowired
	StudentDAO studentDAO;
	
	@Autowired
	BoardDAO boardDAO;
	
//	public ArrayList<String> myNameAndManitto(String name) {
//		ArrayList<String> list = new ArrayList<>();
//		Student student = studentDAO.findById(id).orElseThrow();
//		
//		Student target = studentDAO.findById(student.getTargetId()).orElseThrow();
//		
//		StudentResDto studentResDto = new StudentResDto(target.getName());
//		String targetName = studentResDto.getName();
//		list.add(student.getName());
//		list.add(targetName);
//		
//		return list;
//	}
	
	public boolean isValidUser(String userId, String userPw) {
		Student student = studentDAO.findByName(userId);
	    return student != null && student.getPw().equals(userPw);
	}
	
	public long findId(String userId) {
		long id = studentDAO.findIdByName(userId);
		return id;
	}
	
	
	public List<Board> findAll() {
		return boardDAO.findAll();
	}
	
}


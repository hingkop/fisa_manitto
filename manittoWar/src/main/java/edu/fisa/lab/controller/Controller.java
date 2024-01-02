package edu.fisa.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.fisa.lab.service.MainService;
import jakarta.servlet.http.HttpSession;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	MainService service;
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String loginCheck(String userId, String userPw, HttpSession session) throws Exception {
		System.out.println("------ " + userId);
//		ArrayList<String> list = service.myStudent(id);
//		ModelAndView md = new ModelAndView();
//		md.addObject("list", list);   //setAttribute("activistAll",all);
//		md.setViewName("");  //  /WEB-INF/activist/activistList.jsp

		session.setAttribute("id", userId);
		session.setAttribute("pw", userPw);
		
		return "redirect:/main.jsp"; 
	}
	
	
}

package edu.fisa.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;
import edu.fisa.lab.service.MainService;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	MainService service;
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String loginCheck(String userId, String userPw, HttpSession session) throws Exception {
		System.out.println("------ " + userId);
		boolean isValid = service.isValidUser(userId, userPw);
	
		if(isValid) {
			session.setAttribute("id", service.findId(userId));
			return "redirect:/main.jsp"; 
		}else {
			return "redirect:/login.html"; 
		}
		
	}
	
//	@RequestMapping(path = "/myManitto.jsp", method = RequestMethod.GET)
//	public String myManitto(HttpSession session) {
//		long id = (long) session.getAttribute("id");
//
//	}
	
	@ExceptionHandler
	public String exceptionHandler(Exception e, Model m) {
		m.addAttribute("errorMsg", "발생된 이슈 " + e.getMessage());
		e.printStackTrace();
		return "forward:showError.jsp";
	}
	
}

package com.springboot.mysql;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String registerPage() {
		System.out.println("Called");
		return "index.jsp";
	}
	
	@RequestMapping("/registerUser")
	public String registerDetail(HttpServletRequest req, HttpSession session) {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		System.out.println(name);
		System.out.println(email);

		session.setAttribute("name", name);
		session.setAttribute("email", email);
	
		return "registerUser.jsp";
	}
}

package com.springboot.mysql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String registerPage() {
		System.out.println("Called");
		return "index.jsp";
	}
	
	@RequestMapping("/registerUser")
	public String registerDetail(String name, String email,Model model) {
		
//		1. Servlet way to passing or fetching data HttpServletRequest req, HttpSession session
		
//		if your not passing into method mention here
//		String name = req.getParameter("name");
//		String email = req.getParameter("email");
//		System.out.println(name);
//		System.out.println(email);
//
//		session.setAttribute("name", name);
//		session.setAttribute("email", email);

		model.addAttribute("email",email);
		model.addAttribute("name",name);
		
		return "registerUser.jsp";
	}
}

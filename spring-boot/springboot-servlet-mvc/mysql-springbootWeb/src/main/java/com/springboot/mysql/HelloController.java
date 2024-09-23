package com.springboot.mysql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.mysql.model.RegisterUser;

//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String registerPage() {
		System.out.println("Called");
		return "index";
	}
	
	@RequestMapping("registerUser")
	public String registerDetail(@ModelAttribute("regUser") RegisterUser ru) {
		
//		1. Servlet way to passing or fetching data HttpServletRequest req, HttpSession session
		
//		if your not passing into method mention here
//		String name = req.getParameter("name");
//		String email = req.getParameter("email");
//		System.out.println(name);
//		System.out.println(email);
//
//		session.setAttribute("name", name);
//		session.setAttribute("email", email);

//		2. using model interface (,Model model)
//		model.addAttribute("email",email);
//		model.addAttribute("name",name);
//		return model
	
		
		
		
//		3. using modelAndView
//		mv.addObject("email",email);
//		mv.addObject("name",name);
//		
//		mv.setViewName("registerUser");
//		
//			return mv;
		
//		4. >> using pojo with modelandView <<
		
//		RegisterUser ru = new RegisterUser();
//		ru.setName(name);
//		ru.setEmail(email);
//		ru.setPassword(password);
//		
//		mv.addObject("ru",ru);
//
//		mv.setViewName("registerUser");
//		
//		return mv;

		
//		5. Using ModelAttribute
		return "registerUser";
	}
	
	
//	use for dynamic data feeding
	@ModelAttribute("likePlateform")
	public String likePlateformName(RegisterUser ru) {
			return "Crunchyroll";		

	}
}

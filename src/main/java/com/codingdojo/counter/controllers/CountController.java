package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		session.setAttribute("count", (int)session.getAttribute("count")+1);
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(Model model, HttpSession session, HttpServletRequest request) {
		String times = "times";
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		if((int)session.getAttribute("count") == 1) {
			times = "time";
		}
		String homeUrl = request.getRequestURL().toString();
		model.addAttribute("count", (int)session.getAttribute("count"));
		model.addAttribute("page", homeUrl.substring(0,homeUrl.length()-8));
		model.addAttribute("times", times);
		return "counter.jsp";
	}
	
	@RequestMapping("/countplus2")
	public String countplus2(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		session.setAttribute("count", (int)session.getAttribute("count")+2);
		return "countplus2.jsp";
	}
	
	@RequestMapping("/resetcount")
	public String resetcount(HttpSession session) {
		session.setAttribute("count", 0);
		return "redirect:/counter";
	}
}

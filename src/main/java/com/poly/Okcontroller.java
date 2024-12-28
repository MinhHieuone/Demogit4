package com.poly;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Okcontroller 
{
	@GetMapping("/ok")
	public String ok() {
		return "ok"; // GỌI FORM OK.JSP
	}
	
	@RequestMapping("/ok1")
	public String m1(Model model) {
	model.addAttribute("ok","ok 1");
		return "ok";
	}
	@RequestMapping("/ok2")
	public String m2(Model model) {
		model.addAttribute("ok","ok2");
		return "ok";
	}
	@RequestMapping("/ok3")
	public String m3(Model model) {
		model.addAttribute("ok","ok3");
		return "ok";
	}

	
	///
	@PostMapping("/ok1")
	public String m11(Model model) {
	model.addAttribute("ok","ok 1 post");
		return "ok";
	}
	@PostMapping("/ok2")
	public String m22(Model model) {
		model.addAttribute("ok","ok2 post");
		return "ok";
	}
	@PostMapping("/ok3")
	public String m33(Model model) {
		model.addAttribute("ok","ok3 post");
		return "ok";
	}

	@PostMapping("/ctrl/ok")
	public String m4(Model model) {
		model.addAttribute("ok","ok4 post");
		return "ok";
	}
	
	///
	
	
	
	

}

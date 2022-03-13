package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller  // 컨트롤러 선언
public class FirstController {

	@GetMapping("/hi")
	public String niceToMeetYou(Model model) {
		model.addAttribute("username", "jiheon");
		return "greeting";
	}
	
	@GetMapping("/bye")
	public String seeYouAgain(Model model) {
		model.addAttribute("username", "jiheon");
		return "goodbye";
	}
	

	
}

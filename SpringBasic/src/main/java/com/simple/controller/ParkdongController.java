package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simple.command.ParkdongVO;

@Controller
@RequestMapping("/parkdong")
public class ParkdongController {
	
	@RequestMapping("/park_ex01")
	public String ex01() {
		return "parkdong/park_ex01";
	}
	
	@RequestMapping("/param1")
	public String param1(ParkdongVO vo) {
		
		System.out.println(vo.toString());
		
		return "parkdong/result";
	}
	
	@RequestMapping("/ex02")
	public String ex02(Model model) {
		
		model.addAttribute("nick", "대구미안");
		
		
		return "parkdong/ex02";
	}
	
	
	


}

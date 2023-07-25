package com.coding404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/join")
	public String view() {
		
		return "user/join";
	}
	
	@RequestMapping("/login")
	public String login() {
		
		return "user/login";
	}
	
	@RequestMapping("/mypage")
	public String mypage() {
		
		return "user/mypage";
	}
	
	//예시 타일즈 템플릿을 타지 않는 메서드
//	@RequestMapping("/xxx")
//	public String xxx() {
//		
//		return "user/xxx";
//	}
	
	
	
	
	
}

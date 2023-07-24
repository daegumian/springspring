package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.QuizVO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
//	<%--
//	1. QuizController에는 /quiz 폴더 아래의 모든 요청을 처리할 수 있는 컨트롤러를 생성하세요
//	2. quiz01  화면처리를 할 수 있는 메서드를 생성 (quiz01 맵핑)
//	3. quiz01_ok 페이지에 "당신의 생일은 ~~~~년 ~~월 ~~일" 을 출력하세요
//	--%>

	@RequestMapping("/quiz01")
	public String quiz01() {
		
		return "quiz/quiz01";
	}
	
	
	@RequestMapping("quiz01_ok")
	public String quiz01_ok(@ModelAttribute("year") String year,
			@ModelAttribute("month") String month,
			@ModelAttribute("day") String day) {
		
		return "quiz/quiz01_ok";
	}
	
	
	@RequestMapping("/quiz02")
	public String quiz02() {
		
		
		return "quiz/quiz02";
	}
	
	@RequestMapping(value="/join", method = RequestMethod.POST)
	public String quiz02_ok( QuizVO vo, 
				@ModelAttribute("id") String id,
				@ModelAttribute("pw") String pw,
				@ModelAttribute("name") String name,
				@ModelAttribute("email") String email) {
		
		System.out.println(vo.toString());
		
		return "quiz/quiz02_ok";
	}
	
	
	@RequestMapping("/quiz03")
	public String quiz03() {
		
		return "quiz/quiz03";
	}
	
	@RequestMapping("/join2")
	public String join2(QuizVO vo, RedirectAttributes ra) {
		
		if(vo.getId().equals("")) {
			
			ra.addFlashAttribute("msg", "k");
			return "redirect:/quiz/quiz03";
		}else if(!vo.getPw().equals(vo.getPw_check())) {
			ra.addFlashAttribute("msg", "a");
			return "redirect:/quiz/quiz03";
		}else {
			ra.addFlashAttribute("msg", vo.getId());
			
			return "redirect:/quiz/quiz03_ok";
		}
	 
	}
	
	@RequestMapping("/quiz03_ok")
	public String quiz03_ok() {
		
		return "quiz/quiz03_ok";
	}
	
	
	
	
}

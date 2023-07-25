package com.simple.controller;

import java.util.ArrayList;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simple.command.BoardVO;
import com.simple.service.BoardService;

@Controller
@RequestMapping("/service")
public class BoardController {
	
	@Autowired
	@Qualifier("boardService")
	BoardService boardService;
	
	//게시판 리스트 화면
	@RequestMapping("/boardList")
	public String boardList() {
		
		
		
		return "service/boardList";
	}
	
	//게시글 등록 화면
	@RequestMapping("/boardRegister")
	public String boardRegister() {
		
		return "service/boardRegister";
	}
	
	//게시판 결과 화면
	@RequestMapping("/boardResult")
	public String boardResult() {
		
		return "service/boardResult";
	}
	
	//게시글 등록
	@RequestMapping(value = "/boardForm", method=RequestMethod.POST)
	public String boardForm(BoardVO vo) {
		
		boardService.boardRegist(vo);
		
		return "redirect:/service/boardResult";
	}
	
	
	

}

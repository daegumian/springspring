package com.coding404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trip")
public class TripController {

	@RequestMapping("/notice_list")
	public String notice_List() {
		return "trip/notice_list";
	}
	
	@RequestMapping("/notice_modify")
	public String notice_modify() {
		
		return "trip/notice_modify";
	}
	
	@RequestMapping("/notice_view")
	public String notice_view() {
		
		return "trip/notice_view";
	}
	
	@RequestMapping("/notice_write")
	public String notice_write() {
		
		return "trip/notice_write";
	}
	
	
	
}

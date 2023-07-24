package com.simple.command;

import java.util.ArrayList;

public class ParkdongVO {

	private String name;
	private String age;
	private ArrayList<String> inter;
	
	public ParkdongVO () {}

	public ParkdongVO(String name, String age, ArrayList<String> inter) {
		super();
		this.name = name;
		this.age = age;
		this.inter = inter;
	}
	
	//결과값 쉽게 보기 위하여 메서드 오버라이딩
	
	@Override
	public String toString() {
		return "ParkdongVO [name=" + name + ", age=" + age + ", inter=" + inter + "]";
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public ArrayList<String> getInter() {
		return inter;
	}

	public void setInter(ArrayList<String> inter) {
		this.inter = inter;
	}
	
	
	
}

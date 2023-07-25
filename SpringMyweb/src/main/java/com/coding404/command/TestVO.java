package com.coding404.command;

import com.google.protobuf.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


//@Setter
//@Getter
//@ToString
//위 3개가 아래 하나랑 같음
@Data //getter, setter, toString을 자동생성
@NoArgsConstructor //기본 생성자 만들어줌
@AllArgsConstructor //모든 매개변수를 받는 생성자를 만들어줌
public class TestVO {

	private String id;
	private String pw;
	private String name;
	private int age;
	private Timestamp regdate;

	//getter, setter, toString, 생성자


}

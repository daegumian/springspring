package com.simple.basic.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

import com.simple.command.MemberVO;
import com.simple.command.ScoreVO;

public interface TestMapper {
	//xml에서 실행시킬 추상메서드 
	public String getTime(); 
	
	//insert - 단일값 전달
	public int insertOne(String name);
	//insert - 다중값 전달
	public int insertTwo(ScoreVO vo);
	//insert - 다중값 전달(맵)
	public int insertThree(HashMap<String, Object> map);
	//insert - 매개변수가 여러개 일때 - Param("이름") 
	public int insertFour(@Param("name") String name,
						  @Param("kor") String kor,
						  @Param("eng") String eng);
	
	//update
	public boolean updateOwn(ScoreVO vo);
	
	//select - 파라미터를 넘기는 과정은 위와 동일합니다.
	public ScoreVO selectOne(int num);
	
	//select - 반환유형이 맵
	public HashMap<String, Object> selectTwo(int num);
	
	//한행을 맵으로 처리하는 여러행이라면?
	public ArrayList<HashMap<String, Object> > selectThree();

	//join처리
	//M:1방식 - ORM은 M쪽에 변수를 추가한다.
	public ArrayList<ScoreVO> joinOne();
	
	//join처리2
	//1:M - ORM은 직접처리한다. 이상한 방법임.
	//ex)회원에 글을 붙이는
	public MemberVO joinTwo(String name);



}

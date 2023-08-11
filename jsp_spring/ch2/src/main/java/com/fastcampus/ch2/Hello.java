package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1.원격 호출이 가능한 프로그램으로 등록
@Controller
public class Hello {
	
	int iv = 10; //인스선트 변수
	static int cv =20; // static 변수
	
	
	@RequestMapping("/hello") //url을 main()과 연결
	private void main() {//인스턴스 메서드 iv cv 둘다 사용가능
		System.out.println("hello private");
		//System.out.println(iv);//접근 제어자 상관 없이 private 호출 가능
		System.out.println(cv); 
	}
	//Reflection API를 사용 - 클래스를 정보를 얻고 
			//다를 수 있는 강력한 기능을 제공 함 
	
	public static void main2() {//static은 인스턴스 멤버 못쓴다 기억!
		System.out.println(cv);
		//System.out.println(iv); error 발생
	}
	
	
}

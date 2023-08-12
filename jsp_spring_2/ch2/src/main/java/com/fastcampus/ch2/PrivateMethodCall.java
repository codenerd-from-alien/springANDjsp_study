package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		Hello hello = new Hello();
//		hello.main(); 
		//JAVA.LONG.REFLECT 패키지를 사용한다.	
//		Hello 클래스의 Class 객체 (클래스 정보를 담고 있는 객체) 가져옴
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		//클래스 파일이 메모리에 올라 갈 때 클래스 파일 마다 Class 객체가 생성된다.
		Hello hello =(Hello) helloClass.newInstance();//Class 객체가 가진 정보로 생성
		Method main = helloClass.getDeclaredMethod("main");
		
		main.setAccessible(true);//private인 main 호출가능하게 함
		main.invoke(hello);
	}

}

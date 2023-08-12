package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		Hello hello = new Hello();
//		hello.main(); 
		//JAVA.LONG.REFLECT ��Ű���� ����Ѵ�.	
//		Hello Ŭ������ Class ��ü (Ŭ���� ������ ��� �ִ� ��ü) ������
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		//Ŭ���� ������ �޸𸮿� �ö� �� �� Ŭ���� ���� ���� Class ��ü�� �����ȴ�.
		Hello hello =(Hello) helloClass.newInstance();//Class ��ü�� ���� ������ ����
		Method main = helloClass.getDeclaredMethod("main");
		
		main.setAccessible(true);//private�� main ȣ�Ⱑ���ϰ� ��
		main.invoke(hello);
	}

}

package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1.���� ȣ���� ������ ���α׷����� ���
@Controller
public class Hello {
	
	int iv = 10; //�ν���Ʈ ����
	static int cv =20; // static ����
	
	
	@RequestMapping("/hello") //url�� main()�� ����
	private void main() {//�ν��Ͻ� �޼��� iv cv �Ѵ� ��밡��
		System.out.println("hello private");
		//System.out.println(iv);//���� ������ ��� ���� private ȣ�� ����
		System.out.println(cv); 
	}
	//Reflection API�� ��� - Ŭ������ ������ ��� 
			//�ٸ� �� �ִ� ������ ����� ���� �� 
	
	public static void main2() {//static�� �ν��Ͻ� ��� ������ ���!
		System.out.println(cv);
		//System.out.println(iv); error �߻�
	}
	
	
}

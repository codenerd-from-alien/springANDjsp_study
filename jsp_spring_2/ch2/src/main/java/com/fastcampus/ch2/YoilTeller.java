package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//년월일 입력하면 요일을 알려주기
@Controller
public class YoilTeller {

	@RequestMapping("/getYoil")
	public  void main(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		
		int yyyy= Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);
		
		Calendar  cal = Calendar.getInstance();
		cal.set(yyyy, mm - 1, dd);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		char yoil = " 일월화수목금토".charAt(dayOfWeek);
		
		response.setContentType("text/html");//브라우저에게 text라고 알려준다.
		response.setCharacterEncoding("utf-8");//한글 인코딩 방식은 utf 8
		PrintWriter out = response.getWriter(); //response로 출력 스트림 브라우저에 출력
		
		out.println(year + "년" + month + "월" + day + "일은 ");
		out.println(yoil + "요일입니다.");
		
	}

}

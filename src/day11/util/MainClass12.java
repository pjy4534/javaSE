package day11.util;

import java.text.ParseException;

import day11.mypac.DateUtils;

public class MainClass12 {
	public static void main(String[] args) throws ParseException {
		DateUtils dateUtils = new DateUtils();
		
		String strDate = dateUtils.getDate();
		System.out.println("현재 날짜 : " + strDate);
		
		String strDateAndDay = dateUtils.getDateAndDay();
		System.out.println("현재 날짜 : " + strDateAndDay);
		
		String strCalc = dateUtils.dateCalc("2023-04-14", "yyyy-MM-dd", 0, 0, 0, 0, 0, 0);
		System.out.println("원하는 날짜 계산결과 : " + strCalc);
	}

}

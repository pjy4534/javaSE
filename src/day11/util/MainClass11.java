package day11.util;

import java.util.Calendar;

import day09.mypac.MyUtil.Calculator;

/*
 *  [[ Calendar Class ]]
 *   날짜 관련 객체
 *   날짜 계산용으로 자주 사용
 *   Date 객체와 호환 가능
 *   
 */
public class MainClass11 {
	public static void main(String[] args) {
		// Calendar 객체 생성
		// getInstance 메소드를 통해서만 객체 생성 가능
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		System.out.println("올 해 : " + year);
		
		int month = cal.get(Calendar.MONTH)+1;
		System.out.println("월 : " + month);
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("일 : " + day);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println(hour + ":" + min + ":" + sec);
		
	}

}

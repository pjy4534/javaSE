package day11.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.SimpleAttributeSet;

/*
 *  [[ Data Class ]]
 *   현재 날짜와 시간을 가진 Data 객체
 * 
 */
public class MainClass10 {
	public static void main(String[] args) throws ParseException {
		// 날짜 객체 생성
		Date date = new Date();
		
		System.out.println(date);
		
		// 날짜 포맷 변경해주는 객체
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
		String strDate = sdf.format(date);
		
		System.out.println("strDate : " + strDate);
		
		String yesterday = "2023.04.13 19:08:00";
		
		Date yDate = sdf.parse(yesterday); 
		
		System.out.println("yDate : " + yDate);
	}

}

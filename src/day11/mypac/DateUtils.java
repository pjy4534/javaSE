package day11.mypac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	/**
	 * getDate()
	 *  - 현재 날짜 yyyy년 MM월 dd일 문자열 반환
	 *  @return
	 * 
	 */
	public String getDate() { 
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String strDate = sdf.format(date);
		
		return strDate;
			
	}
	/**
	 * getDateAndDay()
	 *  - yyyy년 MM월 dd일(요일)
	 * 
	 * @return
	 */
	public String getDateAndDay() {
		String strDate = getDate();
		
		//요일 값 반환 0~6(일~토)
		int iDay = new Date().getDay();
		switch (iDay) {
		case 0 :strDate += " (일) "; break;
		case 1 :strDate += " (월) "; break;
		case 2 :strDate += " (화) "; break;
		case 3 :strDate += " (수) "; break;
		case 4 :strDate += " (목) "; break;
		case 5 :strDate += " (금) "; break;
		case 6 :strDate += " (토) "; break;
		
		}
		
		return strDate;
	}
	
	/**
	 * getDateTimeAndDay()
	 *  = yyyy년 MM월 dd일 HH:mm:ss 
	 *
	 * @return
	 */
	public String getDateTimeAndDay() {
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String strDate = sdf.format(date);
		
		int iDay = new Date().getDay();
		switch (iDay) {
		case 0 :strDate += " (일) "; break;
		case 1 :strDate += " (월) "; break;
		case 2 :strDate += " (화) "; break;
		case 3 :strDate += " (수) "; break;
		case 4 :strDate += " (목) "; break;
		case 5 :strDate += " (금) "; break;
		case 6 :strDate += " (토) "; break;
		
		}
		return strDate;
	}
	
	public String dateCalc(
			String strDate,
			String format,
			int addYear,
			int addMonth,
			int addDate,
			int addHour,
			int addMinute,
			int addSecond
			) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(strDate);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		cal.add(Calendar.YEAR, +addYear);
		cal.add(Calendar.MONTH, +addMonth);
		cal.add(Calendar.DATE, +addDate);
		cal.add(Calendar.HOUR_OF_DAY, +addHour);
		cal.add(Calendar.MINUTE, +addMinute);
		cal.add(Calendar.SECOND, +addSecond);
		
		return sdf.format(cal.getTime());
	}

}

package day06.constructor;

import day06.mypac.HandPhone;

/*
 * [[ 생성자 (constructor) ]]
 *  객체를 생성할 때 호출하는 반환값이 없는 메소드. (주의 메소드 아님)
 *  객체 초기화 목적에 사용.
 *  클래스명과 동일하다.
 *  오버로딩 가능하다.
 *   
 */
public class Mainclass01 {
	public static void main(String[] args) {
		// 핸드폰 객체 생성
		HandPhone hp = new HandPhone();
		HandPhone hp2 = new HandPhone("아이폰");
		
		//hp.model = "갤럭시S23";
		System.out.println(hp.model);
		System.out.println(hp2.model);
	}

}

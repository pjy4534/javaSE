package day06.var;

import day06.mypac.Card;

/*
 * [[ 변수 (variable) ]]
 *  메모리 공간에 붙여진 이름
 *  
 *  변수 선언 및 초기화
 *  자료형(type) 변수명 = 값
 *  
 *  1. 타입에 따른 변수
 *  	기본형 - 예약어, 소문자로 시작, 직접 값을 가지고 있다.
 *  		8가지 - boolean, byte, short, char, int, long, float, double
 *  	참조형 - 기본형 외 나머지 전부, 주소 값을 가지고 있다. 대문자로 시작한다.
 *  		ex) String
 *  2. 선언 위치에 따른 변수 - [전역변수 지역변수 중요]
 *  	전역변수 - 클래스에 안에 선언된 변수(멤버 변수), 종속된 변수
 *               초기화 하지 않으면 dafault 값이 들어간다.
 *               	boolean - false
 *               	정수형 - 0
 *               	실수형 - 0.0
 *               	참조형 - null
 *  	지역변수 - 메소드 또는 생성자 안에 선언 추가로 매개변수
 *               반드시 초기화 해줘야한다 (컴파일 에러 주의)
 *  			 코드블럭(중괄호)
 *  3. 정적(static) / 동적 변수
 *      정적 - static이 붙은 멤버변수
 *            모든 객체가 공유한다.
 *            클래스명으로 접근 가능
 *            생성하지 않고 불러올 수 있다.
 *      동적 - static이 아닌 일반 멤버변수
 *  
 */
public class Mainclass01 {
	// 전역변수
	int gNum1 = 20;
	int gNum2;
	
	String gStr1 = "Mainclass01";
	String gStr2;
	
	public static void main(String[] args) {
		int num1 = 10; // 정수형 변수 10으로 초기화
		int num2;      // 정수형 변수 초기화x
		
		System.out.println(num1);
//		System.out.println(num2); // 초기화x 컴파일에러 발생한 경우
		
		Mainclass01 m1 = new Mainclass01();
		
		System.out.println(m1.gNum1);
		System.out.println(m1.gNum2);
		
		System.out.println(m1.gStr1);
		System.out.println(m1.gStr2);
		
		System.out.println("-----------------------------");
		
		Card card = new Card();
		
		System.out.println(card.width);
		System.out.println(card.heigth);
		
		Card card1 = new Card();
		System.out.println(card.type);
		System.out.println(card.number);
		
		
		
		
		
	}

}

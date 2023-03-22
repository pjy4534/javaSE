package day02.basic;
/*
 * [[ 참조형 데이터형(레퍼런스형) ]]
 * 5. String 형(문자열) - 기본형이 아니라 만들어졌다.
 *  - 문자열을 저장할 수 있다.
 * 	- 선언하는 방법
 * 		String 변수명;
 * 
 * 기본형과 참조형 차이
 * [기본형]
 * 	- 소문자로 시작
 * 	- 값을 직접 가지고 있다.
 * 	- 8가지
 * 		boolean, char, byte, short, int, long, float, double
 * 
 * [참조형]
 * 	- 기본형 외 전부.
 * 	- 주소 값을 가지고 있다. 
 * 	- 객체이다.	속성/기능
 */
public class MainClass09 {
	public static void main(String[] args) {
		// 변수 선언과 동시에 값 대입하기
		String str = "안녕하세요";
		System.out.println("문자열 변수 str : " + str);
		
		/*
		 * h e l l o
		 * 0 1 2 3 4 => 인덱스번호
		 */
		
		String hello = "hello";
		System.out.println("1번 인덱스 : " + hello.charAt(1));
		System.out.println("replace : " + hello.replace("l", "r"));
		
		MainClass09 mc09 = new MainClass09();
		
		mc09.print();
		
		
	}
	
	public static void print() {
		System.out.println("MainClass09 입니다.");
	}

}






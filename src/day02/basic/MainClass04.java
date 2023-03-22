package day02.basic;
/*
 * [[ 기본 자료형 ]]
 * 2. 문자형(char)
 *  - 전 세계에서 쓰이는 문자 형태 대부분 표현가능
 *  - 홀따옴표 '' 값 선언
 *  - 16비트 유니코드 문자를 저장하는 변수
 *  - 0 ~ 65,535
 *  
 *  - 선언 방법
 *   char 변수명;
 * 
 * 
 * 
 */
public class MainClass04 {
	public static void main(String[] args) {
		// char 형 변수 선언과 동시에 값 대입하기
		char ch1 = 'A';
		System.out.println("char형 변수 값 : "+ ch1);
		
		char ch2 = '金';
		char ch3 = '쀍';
		
		// 줄복사 ctrl + alt + 방향키 Up or Down
		// 줄삭제 ctrl + D
		// 단축키 목록 Ctrl + Shift + L 
		System.out.println(ch2);
		System.out.println(ch3);
		
		int num = ch1; // char 형 변수 int 형으로 형변환
		System.out.println("대문자 A에 해당하는 숫자코드 : "+ num);
		
		char ch4 = 66;
		System.out.println("숫자 66에 해당하는 문자 : " + ch4);
		
		int num2 = 110;
		char ch5 = (char)num2; // int 형을 char 형으로 강제 형변환
		
		
	}

}

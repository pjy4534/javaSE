package day06.constant;
/*
 * [[ 상수 ]]
 *   처음 할당된 값 변경되지 않는다.
 *   final 예약어 사용.
 *   보통 대문자로 선언한다.(필수는 아님
 * 
 */
public class Mainclass01 {
	static final double PI = 3.14159;
	
	public static void main(String[] args) {
		//원의 반지름
		int r = 10;
		
		//원의 넓이
		// PI = 3,14; 상수 변경불가 (컴파일 에러)
		double area = PI * r * r;
		System.out.println("원의 넓이 : " + area);
		
		area = 0; // 0으로 초기화
		
		area = Math.PI * Math.pow(r, 2);
		
		
	}

}

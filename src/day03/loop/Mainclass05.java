package day03.loop;
/*
 *  4. break문
 *   반복문을 즉시 종료하는 역할을 한다.
 *   
 */
public class Mainclass05 {
	public static void main(String[] args) {
		// for문을 이용하여 0부터 4까지의 숫자 출력하기
		for(int i = 0; i < 5; i++) {
			// 만약 i가 3이면 반복문 종료
			if(i == 3) {
				break; //반복문 종료 break문
			}
			System.out.println("i : " + i); // i값 출력하기
		}
	}

}

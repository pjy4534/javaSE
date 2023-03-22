package day03.loop;
/*
 *  5. continue문
 *   반복문에서 해당 반복을 건너뛰고 다음 반복을 실행하도록 강제하는 역할을 한다.
 */
public class Mainclass06 {
	public static void main(String[] args) {
		// for문을 이용하여 0부터 4까지 숫자 출력하기
		for(int i = 0; i < 5; i++) {
			// 만약 i가 3이면 반복문을 건너뛴다.
			if(i == 3) {
				continue;	//반복문 건너뛰기
			}
			System.out.println("i : " + i);
		}
	}

}

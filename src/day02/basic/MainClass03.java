package day02.basic;
/*
 * [[ 기본 자료형 ]]
 * 1. 논리형(bloolean)
 * 
 * - 선언방법
 * 		bloolean 변수명;
 * - 가질 수 있는 범위
 * 		true, False 두가지 값 저장 가능.
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		// 논리형 변수 선언하기
		boolean isWait;
		// 선언한 변수에 값 대입하기
		isWait = true; //bloolean isWait = ture;
		
		System.out.println("논리형 변수 값 : "+ isWait);
		
		// 논리형 변수 선언과 동시 대입하기.
		boolean canRun = true;
		
		canRun = false;
		
		if(canRun) {
			System.out.println("I can Run!");
		}else {
			System.out.println("I can not Run!");
		}
	
		
	}

}

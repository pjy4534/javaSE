package day09.thread;

import day09.mypac.MyThread;

/*
 *  [[ Thread ]]
 *   스레드는 프로그램 내에서 실행되는 프로그램 제어 흐름(실행단위)을 말한다.
 *   하나의 프로세스 내부에서 독립적으로 실행되는 하나의 작업단위
 *   병렬 프로그래밍
 *   비동기 프로그래밍
 *   
 *  [[ 새로운 스레드 실행 방법 ]]
 *   1. Thread 클래스를 상속
 *   2. run 메소드 오버라이딩 구현
 *   3. 1번 클래스 생성
 *   4. 3번 객체 start() 메소드 호출★
 * 
 */
public class Mainclass01 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		MyThread thread1 = new MyThread();
		thread1.start();
		
		System.out.println("메인 스레드가 종료됩니다.");
	}

}

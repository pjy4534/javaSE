package day09.thread;

import day09.mypac.InterThread;

/*
 *  [[ Runnable ]]
 *   Thread 상속 대신 인터페이스 상속으로 Thread 객체 생성하기
 * 
 */
public class Mainclass05 {
	public static void main(String[] args) {
		System.out.println("메인메소드 시작됩니다.");
		
		
		// 다형성 Runnable  인터페이스를 구현한 객체 생성
		Runnable iThread = new InterThread();
		// InterThread 생성한 객체를 Thread 객체 생성자 인자로 전달
		Thread thread = new Thread(iThread);
		// Thread 객체의 start() 메소드 호출하여 새로운 스레드 시작
		thread.start();
		
		System.out.println("메인스레드 종료됩니다.");
	}

}

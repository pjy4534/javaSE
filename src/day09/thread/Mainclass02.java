package day09.thread;

import day09.mypac.CountThread;

public class Mainclass02 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작");
		
		new CountThread().start();
		
		System.out.println("메인스레드 종료");
	}

}

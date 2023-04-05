package day09.thread;
/*
 * synchronized 예약어
 *  동기화 시켜주는 예약어
 *  동시에 진행했을 때 순서를 정리해줌(대기시켜줌)
 * 
 */

import day09.mypac.Brother;
import day09.mypac.Sister;
import day09.mypac.Wallet;

public class Mainclass04 {
	public static void main(String[] args) {
		//Wallet 객체 생성하기
		Wallet wallet = new Wallet();
		
		//Sister 스레드객체 생성하기
		Sister sister = new Sister(wallet);
		
		//Brother 스레드객체 생성하기
		Brother brother = new Brother(wallet);
		
		//각각의 객체를 이용해서 두 개의 스레드 시작시키기
		sister.start();
		brother.start();
		
		System.out.println("메인스레드가 종료됩니다.");
	}

}

package day07.interfaceEx;

import day07.mypac.DanceMusic;

/*
 *  [[ 인터페이스 (Interface) ]]
 *   추상메소드들의 집합
 *   변수선언을 해도 변수가 아닌 상수가 된다.
 *   다중상속 가능
 *   
 *   주목적 - 객체 구조(뼈대)를 만들어준다!
 *   
 *   
 */
public class Mainclass01 {
	public static void main(String[] args) {
		DanceMusic dm = new DanceMusic();
		String groupName = dm.getGroupName();
		
		System.out.println("groupName : " + groupName);
		
		dm.listen();
		dm.sing();
		
		System.out.println(dm.LABEL);
		
		System.out.println(dm.LABEL);
//		dm.LABEL = "YG"; //인터페이스 변수 상수 (컴파일 에러)
		
	}

}

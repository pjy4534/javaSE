package day07.abstractEx;

import day07.mypac.Man;

/*
 *  [[ 추상클래스(Abstract Class ]]
 *  구현되지 않은 추상 메소드가 존재하는 클래스.
 *  메소드 선언만 하고 구현X.
 *  미완성 클래스
 *  상속을 받고 반드시 오버라이딩을 해야한다.
 *  많이 쓰이지는 않음
 *  
 */
public class Mainclass01 {
	public static void main(String[] args) {
		Man m1 = new Man();
		m1.useFire();
		m1.say();
		m1.setName("차은우");
		String name = m1.getName();
		System.out.println("m1 name : " + name);
		
		m1.setAge(25);
		int age = m1.getAge();
		System.out.println("m1 age : " + age);
	}

}

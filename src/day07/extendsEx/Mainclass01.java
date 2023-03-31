package day07.extendsEx;

import day07.mypac.Dog;

/*
 * [[ 상속(extends) ]]
 *  부모 클래스(상위 클래스)와 자식 클래스(하위 클래스)가 있으며
 *  자식 클래스는 부모 클래스를 선택해서
 *  그 부모의 멤버를 상속받아 그대로 쓸 수 있게 된다.
 *  
 *  클래스 1개 당 상속 1개 가능
 *  
 *  오버라이딩 (Overrding)
 *   상속받은 메소드를 자식 클래스에서 재정의하여 사용하는 것을 의미한다.
 *   
 * 
 */
public class Mainclass01 {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.move();
		String owner = dog1.getOwner();
		System.out.println(owner);
	}

}

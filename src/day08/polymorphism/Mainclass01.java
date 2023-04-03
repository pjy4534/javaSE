package day08.polymorphism;

import day08.mypac.AkWeapon;
import day08.mypac.M4A1Weapon;
import day08.mypac.Scope;
import day08.mypac.Weapon;

/*
 *  [[ 다향성 (polymorphism) ]]
 *   하나의 객체가 여러가지 타입을 가질 수 있는 것을 의미
 *  
 *  instanceof 연산자
 *  객체가 특정 클래스 또는 인터페이스의 인스턴스인지 여부를 확인하는데 사용
 *  
 * 
 */
public class Mainclass01 {
	public static void main(String[] args) {
		AkWeapon ak47 = new AkWeapon();
		ak47.attack();
		ak47.printType();
				
		Weapon ak47_2 = new AkWeapon();
		ak47_2.attack();
//		ak47_2.printType(); 
		
		// call by reference (얕은복사) 주소만 복사
		AkWeapon ak47_3 = (AkWeapon) ak47_2;
		ak47_3.printType();
		
		M4A1Weapon m4a1 = new M4A1Weapon();
		
		
		System.out.println(System.identityHashCode(ak47));
		System.out.println(System.identityHashCode(ak47_2));
		System.out.println(System.identityHashCode(ak47_3));
		
		classyfiyWeapon(ak47);
		classyfiyWeapon(ak47_2);
		classyfiyWeapon(ak47_3);
		classyfiyWeapon(m4a1);

	}
	
	public static void classyfiyWeapon(Weapon weapon) {
		if(weapon instanceof Scope) {
			System.out.println("저격소총 입니다.");
		}else {
			System.out.println("일반소총 입니다.");
		}
	}

}

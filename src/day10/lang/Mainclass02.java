package day10.lang;
/*
 *  1. 얕은복사(Shallow Copy, Call by refrence)
 *  	- 참조형 변수에 주소값만 복사
 *  	- 동일한 객체를 참조하게 된다.
 *  
 *  2. 깊은복사(Deep copy, Call by Value)
 *  	- 객체의 맴버 변수 값과 객체가 참조하는 객체까지 모두 복사하는 방식
 *  	- 새로운(다른) 객체를 참조하게 된다.
 */
import day10.mypac.Sports;
import day10.mypac.TestRef;

public class Mainclass02 {
	public static void main(String[] args) throws CloneNotSupportedException {
		// call by reference (얕은 복사) - 주소값 복사
		Sports sports1 = new Sports("축구", true);
		Sports sports2 = sports1;
		Object obj1 = sports1; // 다향성

		Sports sports3 = (Sports) sports1.callClone();

		sports2.kind = "농구";

		System.out.println(sports1.kind);
		System.out.println(sports1.equals(obj1));

		if (sports1.equals(sports2)) {
			System.out.println("sports1 과 sports2는 같다.");
		} else {
			System.out.println("sports1 과 sports2는 같지 않다.");
		}

		if (sports1.equals(sports3)) {
			System.out.println("sports1 과 sports3는 같다.");
		} else {
			System.out.println("sports1 과 sports3는 같지 않다.");
		}
		
		System.out.println("문제 결과값 ?" + sports3.kind);
		
		testRef(sports1);
		
		System.out.println("1. sports1.kind : " + sports1.kind);
		
		TestRef.testRef(sports1);
		
		System.out.println("2. sports.kind : " + sports1.kind);
		
		Sports sports4 = TestRef.testRef2(sports1);
		
		System.out.println("sports4.kind : " + sports4.kind);
		
	}
	
	public static void testRef(Sports sports) {
		sports.kind = "야구";
	}
}

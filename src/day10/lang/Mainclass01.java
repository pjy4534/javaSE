package day10.lang;

import day10.mypac.Sports;

/*
 *  [[ java.lang 패키지 ]]
 *   기본적으로 제공해주는 패키지
 *   import 필요없이 사용가능
 *  
 *  [[Object 클래스 ]]
 *   모든 클래스의 최상위 부모이다.
 *   즉 모든 클래스는 Object 클래스를 상속받는다.
 *   extends 생략
 *   
 *   	equals() 메소드 : 두 객체가 동일한 객체면 true 동일하지 않으면 false 반환
 *   
 *   	hashCode() 메소드 : 객체의 메모리 번지를 이용, 해시코드를 만들어 리턴
 *   
 *    	toString() 메소드 : 객체의 문자 정보를 리턴, 즉 객체를 문자열로 표현
 *    
 *    	clone() : 새로운 객체로 복사(깊은 복사)
 *    			  Cloneable 인터페이스 상속받은 객체 사용가능
 *    
 *    immutable 불변의 변수 -> 메모리 값이 변경되지 않음
 *    						thread safe
 *    
 * 
 */
public class Mainclass01 {
	public static void main(String[] args) {
		Sports sports1 = new Sports("수영", false);
		Sports sports2 = new Sports("수영", false);
		
		System.out.println(sports1);
		
		if(sports1.equals(sports2)) {
			System.out.println("sports1 과 sports2는 같습니다.");
		} else {
			System.out.println("sports1 과 sports2는 다릅니다.");
		}
		
		System.out.println(System.identityHashCode(sports1));
		System.out.println(System.identityHashCode(sports2));
		
		System.out.println(sports1.hashCode());
		System.out.println(sports2.hashCode());
		
		//기본형 변수
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(System.identityHashCode(num1));
		System.out.println(System.identityHashCode(num2));
		
		num1 = 20;
		System.out.println(System.identityHashCode(num1));
		
		// String toString() 오버라이딩 : 문자열 값이 나오게 메소드 재정의 되어있다.
		// String 기본형이 아님에도 immutable 특성을 가진다.
		String str = "hello";
		System.out.println("str : " + str);
		System.out.println("str : " + str.toString());
		
		String str2 = "hello";
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str2));
		
		String str3 = new String("hello");
		System.out.println("str3 : " + str3);
		System.out.println("str3 : " + str3.toString());
		
		System.out.println(System.identityHashCode(str3));
		
		num1 = 10;
		num2 = 10;
		if(num1 == num2) { // 기본형은 == 비교연산자로 비교가능
			System.out.println("num1 과 num2 는 같다.");
		}
		
		if(str == str2) { 
			System.out.println("str 과 str2 은 같다.");
		}
		
		if(str == str3) { 
			System.out.println("str 과 str3 은 같다.");
		}

		// String 실제값을 비교하려면 equals() 메소드를 사용해야한다.
		if(str.equals(str3)) {
			System.out.println("str 과 str3 은 같다.");
		}
		


		
	}

}

package day02.basic;
/*
 * [[ 기본 자료형 ]]
 *  3. 정수형 
 *   - 선언하는 방법
 *    byte 변수명;
 *    	1byte
 *    	 -128~127
 *    short 변수명;
 *    	2byte
 *    	 -32,768 ~32,949
 *    int 변수명;
 *    	4byte
 *     	 -2,147,483,648 ~ 2,147,483,647
 *    long 변수명;
 *    	8byte
 *    	매우크다
 *    
 */
public class MainClass05 {
	public static void main(String[] args) {
		// 정수형 변수 선언과 동시에 값 대입하기
		byte iByte = 10;
		short iShort = 100;
		int iInt = 1000;
		long iLong = 10000;
		
		//저장된 값을 문자열로 출력하기
		System.out.println("Byte 형 :" + iByte);
		System.out.println("short 형 :" + iShort);
		System.out.println("int 형 :" + iInt);
		System.out.println("long 형 :" + iLong);
		
		iByte = (byte) (iByte + 120);
		
		iInt += 10; // iInt = iInt + 10;
		
		System.out.println(iByte);
		System.out.println(iInt);
		
		String str = iInt + "10";
		System.out.println(str);
		
		
		
		
		
		
		
	}

}






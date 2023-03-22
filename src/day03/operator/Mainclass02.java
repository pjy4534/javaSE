package day03.operator;
/*
 * 	2. 증감연산자
 * 		++ : 1씩 증가시킨다.
 * 		-- : 1씩 감소시킨다.
 * 
 */
public class Mainclass02 {
	public static void main(String[] args) {
		int num = 0;
		num = num + 1;
		System.out.println(num);	//1
		num++;	// 증감연산자 1증감, 뒤에 ++코드가 있는 걸 더 많이 씀
		System.out.println(num);	//2
		System.out.println(++num);	//3, ++가 앞에 있어서 실행코드가 증감이 되기 전에 반영됨 
		System.out.println(num++);	//3, ++가 뒤에 있어서 실행코드가 증감이 되고 나서 반영됨
		System.out.println(num);	//4
		
		System.out.println();
		
		// 0 ~ 99까지 출력하는 반복문(for)
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		int num2 = 0;
		num2 = num2 - 1;
		System.out.println(num2);
		num2--;
		System.out.println(num2);
		
	}
}

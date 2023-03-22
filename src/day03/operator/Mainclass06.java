package day03.operator;
/*
 *  6. 비트연산자 - 2진수로 표현된 두 비트 연산자
 *    & : And 연산자
 *    | : Or 연산자
 *    ^ : XOR 연산자
 *    ~ : Not 연산자
 *    
 *  7. 쉬프트연산자
 *   << : 왼쪽으로 비트 이동
 *   >> : 오른쪽으로 비트 이동
 */
public class Mainclass06 {
	public static void main(String[] args) {
		System.out.println(3&4); //
		System.out.println(3|4);
		System.out.println(3^4);
		System.out.println(~3); // 빼기부호자체가 없기 때문에 음수 부호 비트가 포함이 되어 나온다. 맨 앞 값이 1이 되면 음수.(ex.1101(-11), 1010(-2), 1100(-4))
		// 0011 => 1의 보수 ==> 1100
		// 0000 >> 1의보수 >> 1111
		// 음수 2의 보수값 출력
		
		System.out.println(1<<1);
		System.out.println(2>>1);
	}

}

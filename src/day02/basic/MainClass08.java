package day02.basic;
/*
 * [[ 형변환(cast) ]]
 *  1. 업캐스팅(프로모션)
 *  	- 포현 범위가 더 큰 데이터형으로 변환하기
 *  	- 자동으로 된다.
 *  	- 데이터 손실이 없다.
 *  2. 다운캐스팅(디모션)
 *  	-표현 범위가 더 작은 데이터형으로 변환하기
 *  	- 명시적으로 해야한다.
 *  	- 데이터 손실이 있을 수 있다.
 *  
 * 
 * 
 */
public class MainClass08 {
	public static void main(String[] args) {
		// 업캐스팅 예
		byte iByte = 10;
		int iInt = iByte; //자동으로 형변환이 된다.
		
		float iFloat = 10.1f;
		double iDouble = iFloat; // 자동으로 형변환이 된다.
		
		//다운캐스팅 예
		iDouble = 10.1234567891234d;
		System.err.println("iDouble"+ iDouble);
		
		float iFloat2 = (float)iDouble;
		System.out.println("iFloat2 : " + iFloat2);
		
		int iInt2 = (int)iDouble;
		System.out.println("iInt2 : " + iInt2);

		
	}

}







package day08.exception;

public class Mainclass03 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
		try {
			System.out.println("DB를 연결합니다.");
			
			result = num1 / num2;
			System.err.println("result" + result);
		}catch (Exception e) {
			System.out.println("예외가 발생하였습니다.");
			
		}finally { // 실행이 보장되는 블럭
			System.out.println("DB 연결을 해제합니다.");
		}
	}

}

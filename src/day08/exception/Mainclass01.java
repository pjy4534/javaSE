package day08.exception;
/*
 *  [[ 예외 (Exception) ]]
 *   프로그램 실행도중 발생되는 개발자가 해결 가능한 에러에 해당된다.
 *   
 *   예외처리 방법
 *   try  {
 *   		실행코드
 *   } catch(익셉션클래스명 변수명) {
 *   	해당 예외가 발생했을 경우 실행할 코드
 *   
 *   } finally {
 *   	정상 또는 예외가 발생해도 실행되는 블럭
 *   }
 * 
 */
public class Mainclass01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		int result = 0;

		/*
		if(num2 != 0) {
			result = num1 / num2;
			System.out.println("result : " + result);
		} else {
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
		}
		*/
		
		try {
			// 정상 실행코드
			result = num1 / num2;
			System.out.println("result : " + result);
		} catch (Exception e) {
			System.out.println("관리자에게 문의바랍니다.");
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
			
			e.printStackTrace();
			System.out.println("에러메시지" + e.getMessage());
		}
		
		
		
	}

}

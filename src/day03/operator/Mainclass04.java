package day03.operator;
/*
 *  4. 논리 연산자
 *   && : And 조건, 교집합 개념, 양쪽 모두 true 일 때만 true
 *   || : Or 조건, 합집합 개념, 어느 한쪽이 ture이면 true
 *   !  : Not 조건, 여집합 개념, 논리값을 반전 시킨다.
 * 
 */
public class Mainclass04 {
	public static void main(String[] args) {
		boolean result = true && true; //둘다 ture 여야만 ture가 나옴 하나라도 거짓이면 거짓으로 나
		System.out.println("&& : " + result);
		
		result = true || false;
		System.out.println("|| : " + result);
		
		result = !false;
		System.out.println("! : " + result);
		
		if(10 < 20 || 5==4) {
			System.out.println("조건 중 하나이상 항 true 입니다.");
		}
		
		String order = "영화예매";
		
		if(order.equals("식품")
				|| order.equals("영화예매")
				|| order.equals("의류")
				) {
			System.out.println("식품/영화예매/의류 카테고리에서 주문하였습니다.");
		} else {
			System.out.println("식품/영화예매/의류 외 카테고리에서 주문하였습니다.");
		}
		
		result = true || false || false || false;
		System.out.println(result);
		
		result = !(true && true && true) || false;
		System.out.println(result);
	}
}

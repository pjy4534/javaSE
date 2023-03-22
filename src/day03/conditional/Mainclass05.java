package day03.conditional;

public class Mainclass05 {
	public static void main(String[] args) {
		// 01 : 환불신청중
		// 02 : 환불처리중
		// 03 : 환불취소
		// 04 : 계좌이치중
		// 05 : 환불완료
		// 01, 02, 04 상태일 때 환불 불가
		
		String rtCd = "04";
		switch(rtCd) {
		case "01":
		case "02":
		case "04":
			System.out.println("환불불가!");
			System.out.println("환불상태코드:" + rtCd);
			break;
		}
		
		if(rtCd.equals("01") ||
				rtCd.equals("02") ||
			 	rtCd.equals("04")
					) {
						System.out.println("환불불가!");
						System.out.println("환불상태코드:" + rtCd);
					}
		
	}

}

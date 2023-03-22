package day03.conditional;

/*
 *  null - 변수에 값이 없다라는 뜻
 *  	정확히는 참조형 변수에 참조값이 없다!
 */

public class Mainclass02 {
	public static void main(String[] args) {
		int score = 75;
		String result = null;
		if(score >= 90) {
			result = "수";
		} else if (score >= 80) {
			result = "우";
		} else if (score >= 70) {
			result = "미";
		} else if (score >= 60) {
			result = "양";
		} else {
			result = "가";
		}
		System.out.println("성적 : " + result);
	}

}

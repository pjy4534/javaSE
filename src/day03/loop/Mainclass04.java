package day03.loop;
/* 조건식안에 조건식이 가능함
 *  
 */
public class Mainclass04 {
	public static void main(String[] args) {
		for(int i = 0; i < 7; i++) { 
			
			for(int j = 0; j < i; j++) { // i:0 j - 0:* 1:*... 6:*
										 // i:2 j - 0:* 1:*... 6:*
												//...
										 // i:6 j - 0:* 1:*... 6:*
				System.out.print("*"); // ln을 안하면 커서가 옆으로 간다. (개행을 안함
			}
			
			System.out.println(); //개행용
		}
	}

}

package day03.loop;

public class practice {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			System.out.println(i+": ");
			for(int j = 0; j < i+1; j++) {
				System.out.println("*");
			}
		}
	}

}

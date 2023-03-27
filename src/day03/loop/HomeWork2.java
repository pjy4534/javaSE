package day03.loop;

public class HomeWork2 {
	public static void main(String[] args) {
		int[][] array = new int[7][7];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = i * 7 + j + 1;
				if (array[i][j] < 10) {
					System.out.print(" " + array[i][j] + "[" + "i" + "]" + "[" + "j" + "] ");
				} else {
					System.out.print(array[i][j] + "[" + "i" + "]" + "[" + "j" + "] ");
				} // else
			} // for j
			System.out.println();
		} // for i

		System.out.println();

		for (int i = 0; i < 13; i++) {
			if (i < 10) {
				System.out.print(" "); //맨 앞 공백 배열
			}
			System.out.print(i + ": "); //맨 앞 : 문자 배열

			// 숙제코드
			if (i < 7) { //6번까지의 배열
				for (int j = 0; j < i + 1; j++) {
					if (i % 2 < 1) { // 인덱스번호 짝수 0포함 / 홀수 짝수 맞추기
						System.out.print(array[i - j][j] + " "); //array - 배열 맞추기
					} else {
						System.out.print(array[i][i - j] + " "); // 제외시킨 배열
					}
				}
			} else {
				for (int j = 0; j < 13 - i; j++) { //6번 이후의 배열
					if (i % 2 < 1) {   		//홀짝 맞추기
						System.out.print(array[6 - j][i - 6 + j] + " "); //배열 출력
					} else {
						System.out.print(array[i - 6 + j][6 - j] + " "); //제외시킨 배열
					}

				}
			}

			System.out.println();
		}
	} // main
}// homework2
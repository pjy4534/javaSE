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
		
		for(int i = 0; i < 13; i++) {
			if(i < 10) {
				System.out.print(" " + array);
			}
			System.out.print(i+": ");
			
			
			
			// 숙제코드
			if(i<7) {
				for(int j = 0; j < i+1; j++) {
					if(1%2 < 1) { //인덱스번호 짝수 0포함
						System.out.print(array[i-j][j]+" ");
					}else {
						System.out.print(array[i][i-j]+" ");
					}

				} else {
					for(int j = 0; j < 13 - i; j++) {
						if(1 % 2 < 1) {
						System.out.print(array[6-j][i-6+j] + " ");
					}else {
						System.out.print(array[i-6+j][6-j] + " ");
					}
				}
				
				
			}
			
			System.out.println();
		}
	} // main
}// homework2
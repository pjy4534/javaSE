package day04.array;

public class Mainclass05 {
	public static void main(String[] args) {
		// new연산자 사용하지 않고 2중배열 선언
		int[][] nums = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};
		
		for(int i = 0; i < nums.length; i++) {
			for(int j =0; j<nums[i].length; j++) {
				System.out.println(nums[i][j]+" ");
			}
			System.out.println(); //개행
		}
	}

}

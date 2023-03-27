package day05.method;

public class Mainclass02 {
	private static String name; // 전역변수 name 선언
	
	public static void main(String[] args) {
		setName("잠만보");
		
		String name = getName();
		
		System.out.println("name : " + name);
		
		int[] nums = {1, 2, 3};
		int resultSum = sum(nums);
		System.out.println(resultSum);
		
		int resultSum2 = sum(1,2,3);
		System.out.println(resultSum2);
	}
	
	//인자X 리턴O
	public static String getName() {
		return Mainclass02.name;
	}
	
	public static void setName(String name) { //setName 프로젝트에서 많이 씀
		Mainclass02.name = name;
	}
	
	//인자O 리턴O
	public static int sum(int[] args) {
		int sum = 0;
		for(int arg : args) {
			sum += arg;
			
		}
		return sum;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

}

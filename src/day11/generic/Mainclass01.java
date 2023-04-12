package day11.generic;
/*
 *  [[ 제네릭 (Generic) ]]
 *   컴파일 시간에 타입 안정성을 보장하면서 유연성과 재사용성을 높이기 위한 기능
 *   1. 잘못된 타입 들어오는 것 방지
 *   2. 변환(Cast) 필요없다.
 *   
 */
public class Mainclass01 {
	public static void main(String[] args) {
		MyClass<String> stringObj = new MyClass<>();
		stringObj.setData("Hello, World!");
		String data = stringObj.getData();
		System.out.println(data);
		
		MyClass stringObj2 = new MyClass();
		stringObj2.setData("Hello, World!"); // 다향성!
		String data2 = (String) stringObj2.getData();
		
	}

}

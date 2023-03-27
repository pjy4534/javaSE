package day05.method;
/*
 * [[ 메소드(Method) ]]
 *  어떤 특정 작업을 수행하기 위한 명령문의 집합.
 *  객체의 기능역할을 한다.
 *  
 *  메소드 구조
 *  (접근제어자) (정적) 반환타입 메소드이름(매개변수타입 매개변수명)<-인자값 {	// 선언부
 *  	 실행할 코드(명령문) // 구현부
 *  	...
 *  	return 반환값;
 *  }
 *  
 *  Overloading(오버로딩)
 *  	클래스 내에서 같은 이름을 가진 메소드를 여러 개 정의하는 것을 말한다.
 *  	매개변수 개수 또는 타입이 다르면 된다.
 *  	
 * 
 */
public class Mainclass01 {
	public static void main(String[] args) {
		hello(); //메소드 호출
		printName("피카츄");
		
		printMember("PIKA", "피카츄", 27);
		
		String[] pokemon = {"피카츄", "라이츄", "파이리", "꼬부기"};
		printPoKemon(pokemon);
		
		System.out.println(String.valueOf(false)); //valueof공식
		System.out.println(String.valueOf(10));
		
	}
	// 인자x 리턴x -> 호출시 실행하고 끝나는 메소드
	public static void hello() {
		System.out.println("Hello, World!");
	}
	// 인자O 리턴X -> 인자값을 받아 실행하고 끝나는 메소드
	public static void printName(String name) { //스트링타입의 네임변수/String name = "피카츄";
		System.out.println("이름 : "+ name);
	}
	//인자O 배열리턴X
	public static void printMember(String id, String name, int age) {
		System.out.println("ID : " + id);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	// 오버로딩(overloading) 메소드
	//인자O 여러타입 여러개 리턴X
	public static void printMember(String id, String name, int age, String job) {
		System.out.println("ID : " + id);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("직업 : " + job);
	}
	
	public static void printPoKemon(String[] mons) {
		for(String mon : mons)
			System.out.println(mon);
	}
}

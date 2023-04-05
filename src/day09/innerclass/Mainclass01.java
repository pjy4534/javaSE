package day09.innerclass;
/*
 *  [[ 내부 클래스 (InnerClass) ]]
 *   클래스 내부에 다른 클래스를 선언하는 것을 의미한다.
 *   
 */
public class Mainclass01 {
	public static void main(String[] args) {
		new Mainclass01.InnerClass().doSomething();
		new InnerClass().doSomething();
	}
	
	static class InnerClass {
		public void doSomething() {
			System.out.println("무언가를 해요!");
		}
	}

}

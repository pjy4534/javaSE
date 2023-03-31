package day07.mypac;

public class Dog extends Animal{
	
	public Dog() {
		System.out.println("Dog 생성자 입니다.");
	}
	//오버로딩 생성자
	public Dog(String name) {
		System.err.println(name + "의 Dog생성자 입니다.");
	}
	
	public void bark() {
		System.out.println("왈왈 bowbow");
	}

	@Override
	public void move() {
		// 부모 멤버 접근가능 예약어 super
		System.out.print("활발하게 ");
		super.move();
		
	}
	
	public String getOwner() {
		return super.owner;
	}
	
	

}

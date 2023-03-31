package day07.mypac;

public class Jindo extends Dog {
	
	public Jindo() { //ctrl + space
		super("야옹이");	// 부모생성자를 뜻한다.
						// 생성자 첫 줄 위치해야한다.
		System.out.println("진돗개 입니다.");
	}
	
	public void special() {
		System.out.println(owner +"한 주인만 섬기다.");
	}

}

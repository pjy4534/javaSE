package day07.mypac;

public class Animal {
	private String name;
	public String owner;
	
	public Animal() {
		this.owner = "차은우";
		System.out.println("Animal 생성자 입니다.");
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void move() {
		System.out.println("움직인다.");
	}
	
	

}

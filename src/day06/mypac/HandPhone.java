package day06.mypac;

public class HandPhone {
	public String model;
	
	static {
		System.out.println("static 초기화 블럭");
	}
	
	{
		System.out.println("-----"); // - 초기화 블럭
	}
	
	//생성자 - 초기화하는데 사용함
	public HandPhone() {
		model = "갤럭시S23";
		printModel();
	}
	
	//생성자 오버로딩
	public HandPhone(String model) {
		this.model = model;
	}
	
	public void printModel() {
		System.out.println(this.model);
	}

}

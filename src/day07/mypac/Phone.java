package day07.mypac;

public class Phone {
	public String model;

	public Phone() {
		this.model = "유선다이얼전화기";
	}

	public void call() {
		System.out.println("전화를 걸어요!");
	}

	protected void sendMessage() {
		System.out.println("문자 보내기");
	}

}

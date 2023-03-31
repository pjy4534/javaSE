package day07.extendsEx;

import day07.mypac.Jindo;

public class Mainclass02 {
	public static void main(String[] args) {
		System.out.println("메인메소드 진도 생성");
		Jindo Jindo = new Jindo();
		System.out.println(Jindo.owner);
		Jindo.special();
	}

}


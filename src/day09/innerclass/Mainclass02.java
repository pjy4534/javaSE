package day09.innerclass;

import day09.mypac.MyUtil;

public class Mainclass02 {
	public static void main(String[] args) {
		//MyUtil 클래스안에 HelloPrinter 내부클래스 생성하기
		// 첫번째 방법
		MyUtil mu = new MyUtil();
		MyUtil.HelloPrinter hp = mu.new HelloPrinter();
		hp.printHello();
		
		// 두번째 방법
		MyUtil.HelloPrinter hp2 = new MyUtil().new HelloPrinter();
		hp2.printHello();
		
		// static 내부클래스 생성
		MyUtil.Calculator calc = new MyUtil.Calculator();
		calc.calc(10, 20);
		
		
	}

}

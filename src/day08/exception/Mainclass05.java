package day08.exception;

import day08.mypac.Numberprinter;

/*
 *  [[ throws]]
 *   예외가 발생하면 상위메소드로 예외를 미룬다.
 *   
 * 
 */
public class Mainclass05 {
	public static void main(String[] args) throws InterruptedException {
		Numberprinter np = new Numberprinter();
		
		np.printNumber();
		
		//강제로 익셉션 발생시키기
		throw new NullPointerException();
	}

}

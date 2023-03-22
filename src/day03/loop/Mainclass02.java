package day03.loop;
/*
 *  2. do ~ while()문
 *   while문과 비슷하지만, 최소 한번은 실행된다.
 *   
 *   do{
 *   	반복 수행할 코드
 *   } while(조건문);
 */
public class Mainclass02 {
	public static void main(String[] args) {
		int count = 0;
		do {
			System.out.println(count);
			count++;
		} while(count < 100);
	}

}

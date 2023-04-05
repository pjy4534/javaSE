package day09.innerclass;

import day09.mypac.Music;

/*
 *  [[ 익명클래스 (Anonymous Class) ]]
 *   클래스 선언과 생성을 동시에 하는 이름없는 클래스
 *   일회용 클래스
 * 
 */
public class Mainclass03 {
	public static void main(String[] args) {

		Music music = new DanceMusic() { // 익명클래스 -> Music을 상속받고 있는 이름없는 클래스
			String genre = "발라드";

			@Override
			public void listen() {
				System.out.println("음악을 들어요");

			}

		};

		String genre = new DanceMusic() { // 익명클래스 -> Music을 상속받고 있는 이름없는 클래스
			String genre = "발라드";

			@Override
			public void listen() {
				System.out.println("음악을 들어요");

			}

			public String getGenre() {
				return genre;
			}

		}.getGenre();

		System.out.println("장르 : " + genre);

	}

}

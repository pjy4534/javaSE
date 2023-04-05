package day09.innerclass;

import day09.mypac.Music;
import day09.mypac.Singer;

public class Mainclass04 {
	public static void main(String[] args) {
		Singer s = new Singer(new Music() {

			@Override
			public void sing() {
				System.out.println("노래를 불러요");

			}

			@Override
			public void listen() {
				System.out.println("음악을 들어요");

			}
		});

		s.m.sing();
		
		DanceMusic dMusic = new DanceMusic();
		Singer s2 = new Singer(dMusic);
		s.m.sing();

	}
}


class DanceMusic implements Music {
	
	String genre = "댄스";
	
	@Override
	public void listen() {
		System.out.println(genre + "음악을 들어요");
		
	}

	@Override
	public void sing() {
		System.out.println(genre + "노래를 불러요");
		
	}

	
	
}

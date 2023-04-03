package day09.mypac;

public class CountThread extends Thread {

	@Override
	public void run() {
		System.out.println("CountThread 시작");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {

				Thread.sleep(1000); // 1초 일시정지

			} catch (InterruptedException e) {
				System.out.println("예외발생");
			}
		}
		System.out.println("CountThread 종료");

	}
}

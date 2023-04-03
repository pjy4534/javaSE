package day09.mypac;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("MyThread 만의 작업을 해요");
		
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("MyThread가 종료됩니다.");
		
	}
	
	

}

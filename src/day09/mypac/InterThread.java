package day09.mypac;

public class InterThread implements Runnable {
	
	@Override
	public void run() {
		System.out.println("InterThread가 시작되었습니다.");
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("InterThread가 종료되었습니다.");
		
	}

}

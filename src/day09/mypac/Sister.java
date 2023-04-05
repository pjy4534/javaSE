package day09.mypac;

public class Sister extends Thread {
	public Wallet wallet; // 지갑객체
	public int Money;
	
	public Sister(Wallet wallet) {
		this.wallet = wallet;
	}
	
	@Override
	public void run() {
		while(true) {
			int returnedMoney = wallet.getMoney();
			if(returnedMoney == 0) //지갑 잔고가 0이면
				break;
			
			Money = Money + returnedMoney;
		}
		
		System.out.println("Sister 총 재산 : " + Money);
	}

}

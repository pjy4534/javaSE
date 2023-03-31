package day07.accessmodifier;

import day07.mypac.CellPhone;
import day07.mypac.Phone;
import day07.mypac.SlidePhone;
import day07.mypac2.SmartPhone;

/*
 * [[ 접근제어자/접근제한자 ]]
 *  public - 모든 클래스에서 접근 가능.
 *  protected - 같은 패키지 또는 상속 관계에서 접근가능.
 *  default - 같은 패키지 접근 가능.
 *  private - 같은 클래스 안에서 접근 가능.
 * 
 */
public class Mainclass01 {
	public static void main(String[] args) {
		Phone phone = new Phone();
		CellPhone cellPhone = new CellPhone();
		SlidePhone slidePhone = new SlidePhone();
		SmartPhone smartPhone = new SmartPhone();
		System.out.println("모델명 : " + phone.model);
		System.out.println("모델명 : " + cellPhone.model);
		System.out.println("모델명 : " + slidePhone.model);
		System.out.println("모델명 : " + smartPhone.getModel());
		
//		cellPhone.sendMessage();	// protected 다른패키지 접근 불가
		slidePhone.sendMessage();
//		slidePhone.telecomInternet();	// default 다른패키지 접근 불가
		
	}

}

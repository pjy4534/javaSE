package day08.mypac;

import java.awt.Window.Type;

public class AkWeapon implements Weapon {
	@Override
	public void attack() {
		System.out.println("소총 공격을 해요");
		
	}
	
	public void printType() {
		System.out.println("TYPE:" + TYPE);
	}
	

}

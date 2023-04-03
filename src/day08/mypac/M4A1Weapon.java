package day08.mypac;

public class M4A1Weapon implements Weapon, Scope {

	@Override
	public void attack() {
		System.out.println("80데미지 공격해요");
		
	}

	@Override
	public void doSnip() {
		System.out.println("3000 거리 저격 공격해요");
		
	
	}
	

}

package day10.mypac;

public class TestRef {
	public static void testRef(Sports sports) {
		sports.kind = "요가";
		sports.isGroup = false;
	}
	
	public static Sports testRef2(Sports sports) {
		return new Sports("배구", sports.isGroup);
	}
}

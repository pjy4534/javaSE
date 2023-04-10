package day10.mypac;

public class Sports implements Cloneable{
	public String kind;
	public boolean isGroup;
	
	public Sports(String kind, boolean isGroup) {
		this.kind = kind;
		this.isGroup = isGroup;
	}
	
	@Override
	public String toString() { // toString 재정의
		return kind;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Object callClone() throws CloneNotSupportedException {
		return clone();
	}
	
}

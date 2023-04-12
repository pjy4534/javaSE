package day11.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 *  [[ 반복자 (Iterator) ]]
 *   자바 컬렉션 프레임워크에서 컬렉션에 저장된 요소를 읽어오는데 사용되는 인터페이스
 *   hasNext() - 다음요소가 있는지 확인 boolean 반환
 * 
 */
public class MainClass04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("블루");
		list.add("그린");
		list.add("레드");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println("name : " + name);
		}
		
	}

}

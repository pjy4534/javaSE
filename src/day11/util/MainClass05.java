package day11.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 *  [[ Set ]]
 *   순서가 없는 데이터 집합
 *   중복 허용하지 않음
 *   
 *   HashSet(제일 많이 씀), TreeSet
 */
public class MainClass05 {
	public static void main(String[] args) {
		Set<String> set= new HashSet<>();
		
		// 데이터 저장
		set.add("피카츄");
		set.add("라이츄");
		set.add("파이리");
		
		// 중복값 허용 안함★
		set.add("잉어킹");
		set.add("잉어킹");
		
		// 데이터 개수
		System.out.println("데이터 개수 : " + set.size());
		
		// Iterator(반복자) 객체 이용해서 출력
		Iterator<String> it = set.iterator();
		
		// 순서가 없음
		while(it.hasNext()) {
			String name = it.next();
			System.out.println("name : " + name);
		}
	}

}

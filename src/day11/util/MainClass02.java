package day11.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 *  [[ List ]]
 *   선형배열 객체
 *   가변 배열
 *   인덱스값이 있다.
 *   
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		// 데이터 저장하기
		list.add("피카츄");	//0
		list.add("라이츄");	//1
		list.add("파이리");	//2
		
		// 저장된 데이터의 특정 인덱스 값 얻어오기
		String str = list.get(0);
		System.out.println("list 0 인덱스 값 : " + str);
		
		// 저장된 데이터에서 특정 인덱스 내용 삭제하기
		list.remove(1);
		
		System.out.println("저장된 데이터의 개수 : " + list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list["+i+"] : " + list.get(i));
		}
		
		// 확장 for문
		for(String name : list) {
			System.out.println("name : " + name);
		}
		
		// 다향성 List 타입으로 선언 ArrayList 객체 생성
		List<String> list2 = new ArrayList<>();
		
		// 깊은 복사
		List<String> list3 = (List<String>) list.clone();
		
		// LinkedList
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("잠만보");
		linkedList.add("이브이");
		linkedList.add(1, "블래키");
		
		for(String name : linkedList) {
			System.out.println("linked name : " + name);
		}
	}

}

package day11.util;

import java.util.LinkedList;
import java.util.Queue;

/*
 *  [[ Queue ]]
 *   선입선출(FIFO) : 먼저 들어온 값이 먼저 나간다.
 * 
 */
public class MainClass07 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("피카츄");
		queue.offer("라이츄");
		queue.offer("파이리");
		
		LinkedList<String> list = (LinkedList<String>) queue;
		
		// 데이터 가져오기
		//System.out.println(queue.poll(0)); queue에는 get 메소드가 없다
//		System.out.println(queue.get(0));  queue에는 get메소드가 없다.
		System.out.println(list.get(0)); //값 삭제하지 않음 가져오기만 함
		
		System.out.println("1번 poll : " + queue.poll());
		System.out.println("2번 poll : " + queue.poll());
		System.out.println("3번 poll : " + queue.poll()); 
		
		System.out.println("list size : " + list.size()); // 위에서 poll로 인해 값을 빼왔기 때문에 값이 0이 됨 
		
	}

}

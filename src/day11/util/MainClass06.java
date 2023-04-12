package day11.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


/*
 *  [[ Map ]]
 *   Key 값, Value 값을 쌍으로 저장한다. (사전형태)
 *   Key 값은 중복 불가
 *   
 *   HashMap, TreeMap
 */
public class MainClass06 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		// 데이터 저장하기
		map.put("Hello", "안녕하세요");
		map.put("Car", "자동차");
		map.put("Tiger", "호랑이");

		// 데이터 가져오기
		String value = map.get("Tiger");
		System.out.println("value : " + value);

		// Map에 있는 키값 불러오기
		Set<String> keys = map.keySet();

		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + ":" + map.get(key));
		}

		/*
		 * 
		 * no:1 name:blue mobile:010-1111-1111
		 * no:2 name:red mobile:010-2222-2222
		 * no:3 name:green mobile:010-3333-3333
		 * no:4 name:orange mobile:010-4444-4444
		 * 
		 * 자바로 어떻게 출력할지
		 * 
		 */

		List<Map> list = new ArrayList<>();
		Map<String, Object> map1 = new HashMap<>();
		Map<String, Object> map2 = new HashMap<>();
		Map<String, Object> map3 = new HashMap<>();
		Map<String, Object> map4 = new HashMap<>();

		map1.put("no", 1);
		map1.put("name", "blue");
		map1.put("mobile", "010-1111-1111");

		map2.put("no", 2);
		map2.put("name", "red");
		map2.put("mobile", "010-2222-2222");

		map3.put("no", 3);
		map3.put("name", "green");
		map3.put("mobile", "010-3333-3333");

		map4.put("no", 4);
		map4.put("name", "orange");
		map4.put("mobile", "010-4444-4444");

		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);

		System.out.println("no / name / mobile");
		for (Map row : list) {
			Integer no = (Integer) row.get("no");
			String name = (String) row.get("name");
			String mobile = (String) row.get("mobile");

			System.out.println(no + " / " + name + " / " + mobile);
		}
		
		List<MemberVO> memberList = new ArrayList<>();
		
		MemberVO member1 = new MemberVO();
		MemberVO member2 = new MemberVO();
		MemberVO member3 = new MemberVO();
		MemberVO member4 = new MemberVO();
		
		member1.setNo(1);
		member1.setName("blue");
		member1.setMobile("010-1111-1111");
		
		member2.setNo(2);
		member2.setName("red");
		member2.setMobile("010-2222-2222");
		
		member3.setNo(3);
		member3.setName("green");
		member3.setMobile("010-3333-3333");
		
		member4.setNo(4);
		member4.setName("orange");
		member4.setMobile("010-4444-4444");
		
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		memberList.add(member4);
		
		for(MemberVO member : memberList) {
			System.out.println(member.getNo() + " / " + member.getName() + " / " + member.getMobile());
		}

	}

}

class MemberVO {
	private Integer no;
	private String name;
	private String mobile;

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}

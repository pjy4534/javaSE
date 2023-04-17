package day12.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import day12.mypac.Member;

/*
 *  [[ ObjectInputStream / ObjectOutputStream ]]
 *   객체를 바이트 스트림으로 읽고 쓰는 클래스
 *   
 *  [[ Serializable ]]
 *   직렬화, 객체를 일련의 바이트(byte)로 변환하는 것을 말한다.
 * 
 */
public class MainClass05 {
	public static void main(String[] args) throws IOException {
		String filePath = "./upload/example.obj";
		
		Member member = new Member("iPod", 18);
		
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(filePath));
			oos.writeObject(member);
			System.out.println("객체 -> 파일백업");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(oos !=null)oos.close();
		}
		
		
		try {
			ois = new ObjectInputStream(new FileInputStream(filePath));
			Member loadedMember = (Member) ois.readObject();
			System.out.println("백업파일 -> 객체화");
			System.out.println("이름 : " + loadedMember.getName());
			System.out.println("나이 : " + loadedMember.getAge());
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(ois!=null)ois.close();
		}
		
	}

}

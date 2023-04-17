package day12.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  [[ FileReader / FileWriter ]]
 *   문자 파일을 읽기/쓰기 기능을 제공하는 클래스
 *   
 * 
 */
public class MainClass04 {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//hello.txt 파일을 읽기 위한 FileReader 객체 생성
			fr = new FileReader("./upload/hello.txt");
			// BufferedReader로 기존 Reader를 감싸서 버퍼 기능을 추가함
			br = new BufferedReader(fr);
			
			// hello4.txt 파일을 쓰기 위한 FileWriter 객체 생성
			fw = new FileWriter("./upload/hello4.txt");
			// BufferedWriter 로 기존 Writer를 감싸서 버퍼 기능을 추가함
			bw = new BufferedWriter(fw);
			
			//파일에서 읽은 문자를 버퍼에 쓰고, 버퍼가 가득차면 파일에 한번에 쓰기를 수행함
//			int readCharCnt = 0;
//			char[] c = new char[5];
//			
//			int i = 0;
//			while((readCharCnt = br.read(c)) != -1) {
//				bw.write(c, 0, readCharCnt);
//				System.out.println(i + ": " + new String(c, 0, readCharCnt));
//				i++;
//				
//			}
			
			String line = "";
			int i = 0;
			while((line = br.readLine()) != null) {
				System.out.println(i+": "+line);
				i++;
			}
			
			System.out.println("실행완료");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(bw != null) bw.close();
			if(br != null) br.close();
			if(fw != null) fw.close();
			if(fr != null) fr.close();
			
		}
	}

}

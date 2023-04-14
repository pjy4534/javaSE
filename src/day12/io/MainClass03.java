package day12.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 *  [[ BufferedInputStream / BufferedOutputStream ]]
 *   버퍼 보조스트림
 *   성능 향상
 *   병목현상 방지
 * 
 */
public class MainClass03 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null; // null로 값을 잡는 이유 - 복습
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		PrintStream ps = null;
		
		try {
			// hello.txt 파일을 읽기 위한 객체생성
			fis = new FileInputStream("./upload/hello.txt");
			// 기존 스트림을 감싸서 버퍼 기능을 추가함
			bis = new BufferedInputStream(fis);
			
			// hello3.txt 파일을 쓰기위한 객체 생성
			fos = new FileOutputStream("./upload2/hello3.txt");
			// 기존 스트림을 감싸서 버퍼 기능을 추가함
			bos = new BufferedOutputStream(fos);
			
			ps = new PrintStream(bos, true);
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			// 파일에서 읽은 데이터를 버퍼에 쓰고, 버퍼가 가득차면 파일에 한 번에 쓰기를 수행함
			while((readByteCnt = bis.read(b)) != -1) {
				bos.write(b, 0, readByteCnt);
			}
			
			
			bos.flush();	// 버퍼에 남은 데이터를 파일에 쓰고 버퍼를 비움
			
			ps.println();
			ps.println("-------------------------------------------");
			ps.print("안녕하세요");
			ps.println("PrintStream으로 작성했어요");
			ps.println("-------------------------------------------");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(bos!=null)bos.close();
			if(fos!=null)fos.close();
			if(bis!=null)bis.close();
			if(fis!=null)fis.close();
		}
		
	}

}

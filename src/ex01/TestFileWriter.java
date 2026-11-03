package ex01;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) throws IOException {
		
		// java에서 ""안에 \를 한개만 넣으면 에러 발생 
		String   filename = "D:\\Young\\JAVA\\PrjIO\\src\\ex01\\bts.txt";
		System.out.println(filename);
		
		String  filename2 = "D:/Young/JAVA/PrjIO/src/ex01";
		System.out.println(filename2);
		
		
		// 파일 생성: open, close 하면 새로운 파일이 생성
		// java는 open 명령을 new 할 때 실행한다. 
		String []   names = {"Rm", "정국", "지민", "슈가", "뷔", "진", "제이홉"};
		
		FileWriter     fw = new FileWriter(filename); // import해도 에러가 남. 왜??? 파일은 반드시 받고, trycatch 해줘야 함! 또는 IOexception! 
		
		for (int i = 0; i < names.length; i++) { // 배열은 length, Arraylist는 size 
			fw.write((i+1) + "." + names[i] + "\n"); // i+1 에 소괄호 입력!!! 
			System.out.println(names[i]);
		}
		
		fw.close();
		System.out.println(filename + "이 저장되었습니다.");
		
		
		}
	}
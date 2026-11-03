package ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	// java는 예외처리를 필수 - 이 두가지의 경우에 대해서는 반드시 throws, try catch 하도록!  
	// 1. IO
	// 2. converstion 
	public static void main(String[] args) throws IOException {
		
		String        path = "D:\\Young\\JAVA\\PrjIO\\src\\ex01\\";
		String    filename = "bts.txt";
		
		FileReader      fr = new FileReader(path + filename);
		BufferedReader  br = new BufferedReader(fr);
		
		
		// 반복 갯수를 모르는 반복 : while() 또는 EOF: end of file 
		// while: 파일 끝이 아닐동안 계속 읽기
		String        line = "";
		
		while ((line = br.readLine()) !=null) {
			System.out.println(line);
		}	
		
		br.close();
		fr.close();
		
		System.out.println("End....");

	}

}

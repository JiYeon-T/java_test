package Demo;
//���������ռ����������	 
import java.io.*;
//java.util.*;
//java.lang.*;

public class Stream {
	//BufferedReader
	//JDK 5 ��İ汾����Ҳ����ʹ�� Java Scanner ������ȡ����̨�����롣
//	public static void inputStream() {
//		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
//		String str;
//		System.out.println("Enter a String, end with \"end\" ");
//		do {
//			str = br.readLine();
//			System.out.println(str);
//		}while(!str.equals("end"));
//	}
	
	//
	public void writeTest(char ch) {
		//��һ���ֽ�д�뵽����
		System.out.write(ch);
		System.out.write('\n');
	}
	public void writeTest(int ch) {
		//��һ���ֽ�д�뵽����
		System.out.write(ch);
		System.out.write('\n');
	}
	
	//�����ļ���IO
	public static void main(String[] args) {
		//
		Stream s = new Stream();
		//s.inputStream();
		int b = 5;
		char c = 'a';
		s.writeTest(b);
		s.writeTest(c);
	}
}

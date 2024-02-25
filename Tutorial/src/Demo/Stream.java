package Demo;
//包和命名空间的作用类似	 
import java.io.*;
//java.util.*;
//java.lang.*;

public class Stream {
	//BufferedReader
	//JDK 5 后的版本我们也可以使用 Java Scanner 类来获取控制台的输入。
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
		//将一个字节写入到流中
		System.out.write(ch);
		System.out.write('\n');
	}
	public void writeTest(int ch) {
		//将一个字节写入到流中
		System.out.write(ch);
		System.out.write('\n');
	}
	
	//流，文件，IO
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

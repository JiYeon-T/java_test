package Stream;

import java.io.*;

public class StreamClass {
	//文件流
//	public void bufferReader() throws IOException {
//		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
//		String temp;
//		char in;
//		System.out.println( "输入一个字符，'q'推出:" );
//		//读取字符
//		do {
//			//int read( ) throws IOException
//			//temp = br.readLine();
//			//java.io.Buffered.readLine(),从终端读取多字符输入,以int返回,输入:abc + 回车，检测到:abc\r\n
//			in = (char)br.read();
//			System.out.println("input:" + in);
//		}while( in != 'q' );
//	}
	
	//写入
	public void writeDemo() {
		char ch = 'a';
		System.out.write(ch);
		//read
	}
	
	//FileInputStream类有多种构造函数
	public void fileStreamTest() {
		try {
			FileInputStream fs = new FileInputStream("D:\\install_location\\java_workspace\\java_runoob\\hello.txt");
			
			//fs.close()调用方法
			//public void close() throws IOException{}, 关闭此文件输入流并释放与此流有关的所有系统资源。抛出IOException异常。
			//char ch;
			//ch = fs.read();
			//打印读到的数据
			System.out.println("read data:" + (char)fs.read());
			fs.close();
			
			//使用文件对象来创建
	//		File f = new File("D:\\\\install_location\\\\java_workspace\\\\java_runoob\\\\hello.txt");
	//		FileInputStream fs = new FileInputStream(f);
			
			//FileOutputStream
			//与FileInputStream的构造函数类似
			
		}catch( IOException e ) {
			System.out.println("Unable to open file.");
		}
	}
	
	//FileStreamTest2
	//这个类属于字节流
	public void fileStreamTest2() {
		try {
			//写入到文件
			byte bWrite[] = {1, 2, 3, 4, 5};
			FileOutputStream fo = new FileOutputStream("D:\\\\install_location\\\\java_workspace\\\\java_runoob\\\\hello.txt");
			for( int ix = 0; ix < bWrite.length; ++ix ) {
				fo.write(bWrite[ix]);
			}
			fo.close();
			
			//读出
			FileInputStream fi = new FileInputStream("D:\\\\install_location\\\\java_workspace\\\\java_runoob\\\\hello.txt");
			int size = fi.available();	//获取可以独到的字节数
			for( int ix = 0; ix < size; ++ix ) {
				System.out.println("读到的:" + fi.read());
			}
			fi.close();
			
		}catch(IOException e) {
			System.out.println("Exception");
		}
	}
	
	//文件File
	public void fileTest() {
		String dirName = "D:\\install_location\\java_workspace\\java_runoob\\fileTest"; 
		File f = new File(dirName);
		f.mkdirs();
	}
	
	//列出文件夹中的所有内容
	public void listDirs() {
		String dirName = "D:\\install_location\\java_workspace\\java_runoob";
		File file = new File(dirName);
		if( file.isDirectory() ) {
			String[] subFileNameList = file.list();
			//处理子文件夹
			for( int ix = 0; ix < subFileNameList.length; ++ix ) {
				System.out.println("\"" + subFileNameList[ix] + "\"" );
			}
		}
		else {
			System.out.println("\"" + dirName + "\" is not a directory, A file." );
		}
	}
	
	//import java.io.File;
	//删除文件deleteFolder()
	
	public static void main(String[] args) {
		StreamClass sc = new StreamClass();
		//sc.bufferReader();
		//sc.writeDemo();
//		int b;
//	    b = 'A';
//	    System.out.write(b);
//	    System.out.write('\n');
		
		//
		//sc.fileStreamTest();
		
		//sc.fileStreamTest2();
		
//		sc.fileTest();
		
		sc.listDirs();
	}
}

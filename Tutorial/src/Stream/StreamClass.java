package Stream;

import java.io.*;

public class StreamClass {
	//�ļ���
//	public void bufferReader() throws IOException {
//		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
//		String temp;
//		char in;
//		System.out.println( "����һ���ַ���'q'�Ƴ�:" );
//		//��ȡ�ַ�
//		do {
//			//int read( ) throws IOException
//			//temp = br.readLine();
//			//java.io.Buffered.readLine(),���ն˶�ȡ���ַ�����,��int����,����:abc + �س�����⵽:abc\r\n
//			in = (char)br.read();
//			System.out.println("input:" + in);
//		}while( in != 'q' );
//	}
	
	//д��
	public void writeDemo() {
		char ch = 'a';
		System.out.write(ch);
		//read
	}
	
	//FileInputStream���ж��ֹ��캯��
	public void fileStreamTest() {
		try {
			FileInputStream fs = new FileInputStream("D:\\install_location\\java_workspace\\java_runoob\\hello.txt");
			
			//fs.close()���÷���
			//public void close() throws IOException{}, �رմ��ļ����������ͷ�������йص�����ϵͳ��Դ���׳�IOException�쳣��
			//char ch;
			//ch = fs.read();
			//��ӡ����������
			System.out.println("read data:" + (char)fs.read());
			fs.close();
			
			//ʹ���ļ�����������
	//		File f = new File("D:\\\\install_location\\\\java_workspace\\\\java_runoob\\\\hello.txt");
	//		FileInputStream fs = new FileInputStream(f);
			
			//FileOutputStream
			//��FileInputStream�Ĺ��캯������
			
		}catch( IOException e ) {
			System.out.println("Unable to open file.");
		}
	}
	
	//FileStreamTest2
	//����������ֽ���
	public void fileStreamTest2() {
		try {
			//д�뵽�ļ�
			byte bWrite[] = {1, 2, 3, 4, 5};
			FileOutputStream fo = new FileOutputStream("D:\\\\install_location\\\\java_workspace\\\\java_runoob\\\\hello.txt");
			for( int ix = 0; ix < bWrite.length; ++ix ) {
				fo.write(bWrite[ix]);
			}
			fo.close();
			
			//����
			FileInputStream fi = new FileInputStream("D:\\\\install_location\\\\java_workspace\\\\java_runoob\\\\hello.txt");
			int size = fi.available();	//��ȡ���Զ������ֽ���
			for( int ix = 0; ix < size; ++ix ) {
				System.out.println("������:" + fi.read());
			}
			fi.close();
			
		}catch(IOException e) {
			System.out.println("Exception");
		}
	}
	
	//�ļ�File
	public void fileTest() {
		String dirName = "D:\\install_location\\java_workspace\\java_runoob\\fileTest"; 
		File f = new File(dirName);
		f.mkdirs();
	}
	
	//�г��ļ����е���������
	public void listDirs() {
		String dirName = "D:\\install_location\\java_workspace\\java_runoob";
		File file = new File(dirName);
		if( file.isDirectory() ) {
			String[] subFileNameList = file.list();
			//�������ļ���
			for( int ix = 0; ix < subFileNameList.length; ++ix ) {
				System.out.println("\"" + subFileNameList[ix] + "\"" );
			}
		}
		else {
			System.out.println("\"" + dirName + "\" is not a directory, A file." );
		}
	}
	
	//import java.io.File;
	//ɾ���ļ�deleteFolder()
	
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

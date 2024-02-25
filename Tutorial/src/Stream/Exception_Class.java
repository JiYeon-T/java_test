package Stream;
//
//import java.io.File;
import java.io.IOException;

public class Exception_Class {

	public String name;
	
	public Exception_Class(String name) {
		this.name = name;
	}
	//java.lang.����
	//�쳣����
	//������쳣�� ����ʱ�쳣�� ����
	//������java ����ķ�Χ֮��
	//����:ThrowEnable��:
	//����:Error��������еĴ���
	//����:Exception��������쳣����򿪲����ڵ��ļ���
	
	//��Java�ж������������͵��쳣�ʹ���
	//JVM(Java�����) �쳣���� JVM �׳����쳣��������磺NullPointerException �࣬ArrayIndexOutOfBoundsException �࣬ClassCastException �ࡣ
	//�����쳣���ɳ������API�����׳����쳣������ IllegalArgumentException �࣬IllegalStateException �ࡣ
	
	//�쳣���
	//��������Խ����������ʱ�쳣,��������޷���鵽
	
	public void exceptionTest() {
		int arr[] = new int[2];
		try {
			//File f = new f();
			System.out.println( "array element:" + arr[2] );
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println( "Error occured:  " + e );
		}
//		catch(IOException e) {
//			
//		}
		finally {	//��鵽�쳣��ִ�����쳣����Ĵ����֮����ִ��finally()�����
			arr[0] = 1;
			arr[1] = 2;
			System.out.println( "array element:" + arr[0] + ", " + arr[1] );
		}
		
		System.out.println( "Error Test successful.");
	}
	
	//test
	public static void main(String[] args) {
		Exception_Class ec = new Exception_Class("ex");
		ec.exceptionTest();
	}
}

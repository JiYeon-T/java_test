package Demo;

public class BasicDataType {

	//����ֵ����Ĭ��ֵ
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static boolean b2;
	static char c;
	static String s2;
	
	//�����������͵�����ռ���ڴ�Ĵ�С�Լ����Сֵ����Ϊ���������ڰ�װ����
	//java.langͷ�ļ�����Ҫ����
	//����������������
	//byte, short, int, long, float, double, bool, char�� String
	public static void main( String[] args ) {
		//byte
		System.out.println("byte�Ļ������ͳ���:" + Byte.SIZE);
		System.out.println("��װ��:java.lang.Byte");
		System.out.println("max:" + Byte.MAX_VALUE + " , min:" + Byte.MIN_VALUE);
		
		//short
		System.out.println("short�Ļ������ͳ���:" + Short.SIZE);
		System.out.println("��װ��:java.lang.Short");
		System.out.println("max:" + Short.MAX_VALUE + " , min:" + Short.MIN_VALUE);
		
		//int
		System.out.println("int�Ļ������ͳ���:" + Integer.SIZE);
		System.out.println("��װ��:java.lang.Integer");
		System.out.println("max:" + Integer.MAX_VALUE + " , min:" + Integer.MIN_VALUE);
	
		//long
		System.out.println("long�Ļ������ͳ���:" + Long.SIZE);
		System.out.println("��װ��:java.lang.Long");
		System.out.println("max:" + Long.MAX_VALUE + " , min:" + Long.MIN_VALUE);
		
		//float
		System.out.println("float�Ļ������ͳ���:" + Float.SIZE);
		System.out.println("��װ��:java.lang.Float");
		System.out.println("max:" + Float.MAX_VALUE + " , min:" + Float.MIN_VALUE);
		
		//double
		System.out.println("double�Ļ������ͳ���:" + Double.SIZE);
		System.out.println("��װ��:java.lang.Double");
		System.out.println("max:" + Double.MAX_VALUE + " , min:" + Double.MIN_VALUE);
		
		//char
		System.out.println("char�Ļ������ͳ���:" + Character.SIZE);
		System.out.println("��װ��:java.lang.Character");
		System.out.println("max:" + (int)Character.MAX_VALUE + " , min:" + (int)Character.MIN_VALUE);
		
		//String
		//bool
		
		
		//��ӡ��Щ�������ݽṹ��Ĭ��ֵ
		System.out.println("byte��Ĭ��ֵ:" + b);
		System.out.println("short��Ĭ��ֵ:" + s);
		System.out.println("int��Ĭ��ֵ:" + i);
		System.out.println("long��Ĭ��ֵ:" + l);
		System.out.println("float��Ĭ��ֵ:" + f);
		System.out.println("double��Ĭ��ֵ:" + d);
		System.out.println("char��Ĭ��ֵ:" + c);
		System.out.println("String��Ĭ��ֵ:" + s2);
		System.out.println("boolean��Ĭ��ֵ:" + b2);
		
		
		//java�е�������������
		
	}
}

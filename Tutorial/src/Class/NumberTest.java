package Class;

import java.util.Random; // ���������

//��ʵ�ʿ��������У����Ǿ�����������Ҫʹ�ö��󣬶����������������͵����Ρ�
//Ϊ�˽��������⣬Java ����Ϊÿһ���������������ṩ�˶�Ӧ�İ�װ�ࡣ
//���еİ�װ�ࣨInteger��Long��Byte��Double��Float��Short, Character, Boolean�����ǳ����� Number �����ࡣ
//Number ������ java.lang ��
// �����ɱ������ر�֧�ֵİ�װ��Ϊװ�䣬���Ե������������ͱ���������ʹ�õ�ʱ�򣬱����������������װ��Ϊ��װ�ࡣ

public class NumberTest {

	public static void main(String[] args) {
		//��װ��
//		Integer x = 10;
//		x += 10;
//		System.out.println("x:" + x);

//		mathPackTest();
//		mathMethodTest();
		javaPackTest();
	}
	
	public static void mathPackTest() {
		//Java �� Math ����������ִ�л�����ѧ��������Ժͷ����������ָ����������ƽ���������Ǻ�����
		//Math �ķ�����������Ϊ static ��ʽ��ͨ�� Math ���������������ֱ�ӵ��á�
        System.out.println("90 �ȵ�����ֵ��" + Math.sin(Math.PI/2));  
        System.out.println("0�ȵ�����ֵ��" + Math.cos(0));  
        System.out.println("60�ȵ�����ֵ��" + Math.tan(Math.PI/3));  
        System.out.println("1�ķ�����ֵ�� " + Math.atan(1));  
        System.out.println("��/2�ĽǶ�ֵ��" + Math.toDegrees(Math.PI/2));  
        System.out.println(Math.PI);  
	}
	
	// math class �ṩ��һЩ��ѧ���㷽��:
	public static void mathMethodTest() {
		Integer i1 = 10;
		byte b1 = i1.byteValue(); // ���� byte ԭ����������
		print("i1:" + i1.byteValue() + "  b1:" + b1);
		print("double:" + i1.doubleValue() + "  long:" + i1.longValue());
		print("Compare result:" + i1.compareTo(0) + "  " + i1.compareTo(10) + "  " + i1.compareTo(15));
//		print("Compare result:" + i1.compareTo(0) + "  " + i1.compareTo((int)1.5) + "  " + i1.compareTo(15));
		
		print("equals:" + i1.equals(1) + "  " + i1.equals(i1));
		
		Integer x = Integer.valueOf(99);
		Double y = Double.valueOf(5);
		Float z = Float.valueOf(225);
		Integer u = Integer.valueOf("64", 16); // 16 ���Ƶ��ַ��� 64 ת��Ϊint
		print("x=" + x + "  y=" + y + "  z=" + z + "  u=" + u);
		print("string:" + x.toString() + "  " + x.toString(x) + "  " + x.toString(x, 16)); // ת��Ϊ�ַ���
		
		print("parse:" + Integer.parseInt("123") + "  " + Double.parseDouble("123") + "  " + Integer.parseInt("64", 16));
		
		print("abslute val:" + Math.abs(-1.5) + "  " + Math.abs(2));
		
		print("floor round ceil:");
		print("-1.4:" + Math.floor(-1.4) + "  " + Math.round(-1.4) + "  " + Math.ceil(-1.4));
		print("-1.5:" + Math.floor(-1.5) + "  " + Math.round(-1.5) + "  " + Math.ceil(-1.5));
		print("-1.6:" + Math.floor(-1.6) + "  " + Math.round(-1.6) + "  " + Math.ceil(-1.6));
		print("1.4:" + Math.floor(1.4) + "  " + Math.round(1.4) + "  " + Math.ceil(1.4));
		print("1.5:" + Math.floor(1.5) + "  " + Math.round(1.5) + "  " + Math.ceil(1.5));
		print("1.6:" + Math.floor(1.6) + "  " + Math.round(1.6) + "  " + Math.ceil(1.6));
		
		print("rint:" + Math.rint(1.5) + "  " + Math.rint(-1.5) + "  " + Math.rint(1.6) + "  " + Math.rint(-1.6));
		
		print("min/max:" + Math.min(1, 1.5) + "  " + Math.max(2, 2.5));
		
		// exp(), log, sin, cos, tan, arctan(), arcsin(), arccos()...
		
		//random() �������ڷ���һ����������������ΧΪ 0.0 =< Math.random < 1.0��
		print("random:" + Math.random());
		generateRandomNumTest();
		print("get random:" + getRandom(1, 5));
	}
	
	/**
	* ���д�ӡ�ַ���, System.out.println ��д
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public static void print(String str) {
		System.out.println(str);
	}
	
	public static void generateRandomNumTest() {
		Random rand = new Random();
		for (int i = 0; i < 10; ++i) {
//			print(""+rand.nextInt(100));
			System.out.print(rand.nextInt(100));
			System.out.print(",");
		}
		System.out.print("\n");
	}

	/**
	* ����һ�� min~max �����һ�������
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public static int getRandom(int min, int max) {
		Random rand = new Random();
		return (rand.nextInt(max - min + 1) + min);
	}
	
	/**
	* java�е��Զ�װ�������:
	* ��һ��˵��װ������Զ���������������ת��Ϊ��װ�����ͣ���������Զ�����װ������ת��Ϊ�����������͡�
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public static void javaPackTest() {
//        Integer i1 = 128;  // װ�䣬�൱�� Integer.valueOf(128);
//        int t = i1; //�൱�� i1.intValue() ����
//        System.out.println(t);

        /**
        ���ڨC128��127��Ĭ����127��֮���ֵ,��װ��󣬻ᱻ�����ڴ����������
        ����������������ֵ,ϵͳ������new һ������
        */
		//��1��Java ��� -128 ~ 127 ���������л��棬���Ե���������������ʼ��ֵλ�� -128 ~ 127 ֮��ʱ����������ʹ����ͬһ��ַ��
//        Integer i1 = 20; // equal address
//        Integer i2 = 20;
		//��2�������� Integer ��������ֵ���� -128 ~ 127 ��Χʱ, ����ʹ���˲�ͬ��ַ��
//        Integer i1 = 200; // uneqaul address
//        Integer i2 = 200;
        /**
        ע�� == �� equals������
        == ���Ƚϵ��Ƕ���ĵ�ַ
        equals �Ƚϵ��Ƕ��������
        */
//        if (i1 == i2) {
//        	System.out.println("equal address");
//        } else {
//        	System.out.println("unequal address");
//        }
//        
//        if (i1.equals(i2)) {
//        	System.out.println("equal value");
//        } else {
//        	System.out.println("unequal value");
//        }
        
        //1. int �ǻ����������ͣ�int �����洢������ֵ��
        //Integer ���������ͣ�ʵ����һ������Integer �洢�������ö���ĵ�ַ��
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        System.out.println("address i1==i2:" + (i1 == i2)); // ��Ϊ new ���ɵ��������������ڴ��ַ��ͬ��
        System.out.println("value i1==i2:" + (i1.equals(i2)));
        
        
        
	}
}

//package Hello;

import java.util.Arrays;
import java.util.Scanner;
//import org.apache.commons.lang3.ObjectUtils;
import java.util.Collections;


//import Class.�쳣����;


//2.1������
//java�в���֧�ֶ�̳У�Java��Ҳ������ָ��ĸ���
//java���Եĵײ���c++ʵ��
//2.2���������
//java�Ǵ��������ģ��������˵�˼άģʽ�����������
//2.3������ֲ��
//java��������һ�α��룬�������У�java������windoesϵͳ�����У������κ��޸ľͿ�����Linuxϵͳ�����С�
//java����������һ̨����ļ�������У�JVM��Ȼ����JVM���ӵײ�Ĳ���ϵͳ
//2.4�����߳�
//2.5����׳��
//java�����в������������Զ����յģ���GC���ƣ�

// class name ������ �ļ�����ͬ, ���ִ�Сд
public class B {
	public static void main(String[] args) {
//		System.out.println("����������7��Ӣ���ַ������ģ�");
		System.out.println("Hello, world");

		// ���ñ�������
//		byte b = 0; // -127-128, size:1byte
//		System.out.println("b="+b);
//		short s = 1000; // size:2 bytes, default:'\u0000'
//		System.out.println("s="+s);
//		int i1 = 9999; // size:4 bytes, default:0
//		System.out.println("i1="+i1);
//		long l1 = 99999L; // size:8 bytes, default:0, java ������Ĭ��Ϊ int ����,���Ҫʹ�ó�����, ����
//		long l1 = 9999l;
//		System.out.println("l1="+l1);

//		boolean b2 = false; // true/false, size:1, default:false
//		System.out.println("b2="+b2);
//		char c1 = 'a', c2 = '��'; // size:2, default:0
//		System.out.println("c1="+c1);
//		System.out.println("c="+c2);
//
//		// java ��, ���еĸ�����Ĭ�ϵ��� double ����,Ҫ�뵱�� float, ��βҪ�� f
		/** ����������������ʾ��ȷ��ֵ�������	 */
//		float f1 = 0.999f; // size:4, 
//		System.out.println("f1="+f1);
//		double d1 = 0.9999;
//		System.out.println("d1="+d1);
		// ����ת��,С����->������:�Զ�����ת��; ������->С����:ǿ������ת��, ����ʧ����
		// byte��short��char�ڻ�������ʱ�򣬸�����ת����int�������㣻
		// �����������ͻ�����㣬��ת����������������������������㣻
//		float fTest = (float)d1;
//		System.out.println("fTest=" + fTest);
		// ����:
		//Q:short a = 1, b = 2; a+b ��ʲô����?
		//A:��java������������int����С�����������㣬java�ڱ����ʱ��ͻὫ����ͳһǿת��int���͡�
		//���Ǳ�int���ʹ�����������㣬�ͻ��Զ�ת������������������Ǹ���
		
		/**
		 * java �У��κ��ַ��������ַ�����ӣ��������ƴ�ӡ�
		 * ԭ����Ӧ�� String.valueOf �ó� s �� value ֵ����ͨ�� StringBuilder ƴ�� hello��
		 * ��˽� value �� hello ������ƴ�ӡ�
		 */
//		String s = null;
//		s += " hello";
//		s = (new StringBuilder(String.valueOf(s))).append("hello").toString();
//		System.out.println(s);

		/** �����������Ͳ��Ե��� */
//		PrimitiveTypeTest p = new PrimitiveTypeTest();
//		p.primitiveTypeTest();

		/** ������������ */
		// 1.��Java�У��������͵ı����ǳ�������C/C++��ָ�롣��������ָ��һ������ָ�����ı��������ñ�����
		// ��Щ����������ʱ��ָ��Ϊһ���ض������ͣ����� Employee��Puppy �ȡ�����һ�����������;Ͳ��ܱ��ı��ˡ�
		// 2. �������鶼�������������͡�
		// 3.�����������͵�Ĭ��ֵ����null��
		// 4. һ�����ñ����������������κ���֮���ݵ����͡����磺Site site = new Site("Runoob")��
//		String[] strArr = {"Libai", "Wanganshi", "WangZhiHuan"};
//		System.out.println(strArr[0]);
//		randomArray(strArr); // ���鴫�ݲ���Ϊ��������
//		System.out.println(strArr[0]);

		/** ����:final, ����ֻ�ܱ���ֵһ�� */
//		final double PI; // 		final double PI = 3.14;
//		PI = 3.14;
//		System.out.println("Pi="+PI);
		// �ַ����������ַ����������԰����κ� Unicode �ַ�
//		char a = '\u0001';
//		String s2 = "\u0001\u0002";
//		System.out.println("a:" + a + " s:" + s2);

		/** ��ͬ����:
		 * ��ʹ����������ʱ��ǰ׺ 0 ��ʾ 8 ���ƣ���ǰ׺ 0x ���� 16 ���� */
//		int decimal = 100;
//		int octal = 0144;
//		int hext = 0x64;
//		System.out.println("decimal:" + decimal + " octal:" + octal + " hext:" + hext);
		
		/** ���������: */
//		int a = 1, b = 22;
//		System.out.println("a+b=" + (a+b));
//		System.out.println("a-b=" + (a-b));
//		System.out.println("a*b=" + (a*b));
//		System.out.println("a/b=" + (a/b));
//		System.out.println("a%b=" + (a%b));
//		System.out.println("++a=" + (++a));
//		System.out.println("b++=" + (b++));
		
		// λ�����: &, |, ~, ^, <<, >>, >>>
		// 0000 0001
		// 0000 0010
//		byte a = 0x01, b = 0x02;
//		System.out.println("a&b=" + (a & b));
//		System.out.println("a|b=" + (a | b));
//		System.out.println("a^b=" + (a ^ b));
		//��Java�У��������ݵı�ʾ���������Բ������ʽ��ʾ
		//����:�����ķ������䱾��, �����ķ���:����λ����, ���ఴλȡ��
		//����:�����Ĳ������䱾��, �����Ĳ���:����λ����, ���ఴλȡ��, Ȼ�� +1
		//����:
		//0x01 �������Ϊ: 0000 0001
		//~a ��λȡ����: 1111 1110
		//��Ϊ��λ��1������ԭ��Ϊ�����������Ĳ����������ֵ��ԭ��ȡ����ĩβ�ټ�1����ˣ����ǿɽ�������������Ĳ�����л�ԭ��
		//��1�����ȣ�ĩβ��1�÷���: 1111 1101
		//��2����Σ�����λȡ����ԭ��(����:����λ����)��1000 0010
		//��3����ʱ������תԭ��Ϊ-2
//		System.out.println("~a=" + (~a)); // -2
//		System.out.println("a<<1=" + (a << 1));
//		System.out.println("a>>1=" + (a >> 1));
		// ��λ���Ʋ�������������������ֵ���Ҳ�����ָ����λ�����ƣ��ƶ��õ��Ŀ�λ������䡣 
//		System.out.println("a>>>1=" + (a >>> 1));
		
		// ��ϵ�����:>, >=, <, <=, !=, ==,
		// = ��ֵ�����
		// ����ĸ�ֵ�����: +=, -=, *=, /=, %=, <<=, >>=, ^=, %=
		
		// �߼������:
		// ! �߼���
		// && ��·��, || ��·��
		// Note: �߼������߼����������һ��, ֻ�Ǵ��ڶ�·����
		// ��·����:a && b, ��� a Ϊ true, �򲻻��ټ�����ʽ b
//		int a = 1, b = 8;
//		System.out.println("a^b=" + (a ^ b));
//		System.out.println("a&&b=" + ((a != 0) && (b != 0)));
//		System.out.println("a||b=" + ((a != 0) || (b != 0)));
//		System.out.println("!a=" + (!(a != 0)));
//		logicOpTest();

		/** ��Ԫ����� */
//		int a = 2;
//		System.out.println("A:a>1? A:" + (a > 1 ? "�ǵ�" : "����"));
		
		// instance of �����
//		String name = "Libai";
//		boolean result = name instanceof String;
//		System.out.println("name:" + name + "  result:" + result);
		
		/** ��������ȼ� */
		// ��Ŀ�����, ��Ŀ�����, ��ֵ����� ������������, ���඼�Ǵ������Ҽ���� 
		// �ȼ���: f = a ? b : (c ? d : e);
//		boolean a = true, b = true, c = true, d = true, e = true, f = true;
//		f = a ? b: c ? d : e;
		
//		short s = 100;
		//���뱨��, cannot convert from int to short, java ��Ĭ��Ϊ int ����
//		s = s + 3;
//		s = (short)(s + 3);
//		s += 3; //�ȿ���ʵ�����㣬�ֲ������s����������
		//��� 16 ����
//		System.out.println(String.format("s:0x%x", s)); 
		
		// ���� Scanner ����
//		Scanner sc = new Scanner(System.in);
//		System.out.print("������:");
//		int i = sc.nextInt();
//		System.out.println("������:" + i);
//		String s = sc.nextLine();
//		System.out.println("������:" + s);
//		double d = sc.nextDouble();
//		boolean b = sc.nextBoolean();

		/** if */
//		int cnt = 5;
//		if (cnt < 5) {
//			System.out.println("<5");
//		} else if (cnt == 5) {
//			System.out.println("==5");
//		} else if (cnt > 5) {
//			System.out.println(">5");
//		} else {
//			System.out.println("?");
//		}
		
		/** switch */
		// 5��Switch�����ֵֻ����int��String���͵����ݣ���������������
		// 6��byte��short��char����ֱ��д��Switch���棬��Ϊ������Զ�����ת����
//		int month = 4;
//		switch (month) {
//		case 1:
//		case 2:
//		case 3: // case ��͸����
//			System.out.println("�� month:" + month);
//			break;
//		case 4:
//		case 5:
//		case 6:
//			System.out.println("�� month:" + month);
//			break;
//		default:
//			System.out.println("unknown situation a=" + month);
//			break;
//		}
		
		/** for */
//		System.out.println("for ���:");
//		for (int i = 1; i < 11; ++i) {
//			if (i == 2)
//				continue; // �жϱ���ѭ������ʼ��һ��ѭ����
//			if (i == 5)
//				break; // breakֻ�� ������ǰbreak������ڵ��ǲ�ѭ��
//			System.out.println("i=" + i);
//		}
		
		// �� Java5 ��������һ����Ҫ�����������ǿ�� for ѭ����
//		String names[] = {"James", "Larry", "Tom", "Lacy"};
//		for (String name : names) {
//			System.out.print(name);
//			System.out.print(", ");
//		}
//		System.out.print("\n");
		
		/** while */
//		System.out.println("while ���:");
//		int i = 1;
//		while (i < 11) {
//			if (i == 2) {
//				++i;
//				continue;
//			}
//			if (i == 5)
//				break;
//			System.out.println("i=" + i);
//			++i;
//		}
		
		/** do...while */
//		System.out.println("do-while ���:");
//		i = 1;
//		do {
//			if (i == 2) {
//				++i;
//				continue;
//			}
//			if (i == 5)
//				break;
//			System.out.println("i=" + i);
//			++i;
//		} while (i < 11);
		
		/** ����: */
//		int a = 1, b = 2;
//		System.out.println("a+b=" + (Hello.add(a,  b))); // ������� static:Cannot make a static reference to the non-static method add(int, int) from the type Hello
//		// ����������������ߺͷ�����ͬһ�����У���������ʡ��
//		printString("�����ڲ������÷���,��������Ҳ����!!!");

		/** �ݹ� */
//		recursionTest(0);
		
		/** ���飺����Ҳ��һ���������ͣ������������ͣ�,��������ͬ��������Ԫ�صļ��� */
		// ע��: ����ʹ�� dataType[] arrayRefVar ���������������������� 
		//dataType arrayRefVar[] ��������� C/C++ ���� ����Java�в�����Ϊ���� C/C++ ����Ա�ܹ��������java���ԡ�
		// ����:
//		int[] arr = new int [10]; // Ĭ��ֵ 0
//		int[] arr = {1, 4, 5, 8};
//		int[] arr = new int[] {1, 2, 4, 5, 8}; // ��ʼ��Ϊ:{1, 4, 5, 8}, ���ַ���ֻ����������ʱ��һͬ��ʼ��, ����֮������ʹ�����ַ���
//		for (int i = 0; i < arr.length; ++i) {
//			System.out.println("arr[" + i + "]=" + arr[i]);
//		}
//		System.out.println("arr len:" + arr.length);
//		System.out.println("arr:" + Arrays.toString(arr)); // �� array ת��Ϊ�ַ���
//		int[] arr2 = new int[20];
//		System.arraycopy(arr, 0, arr2, 0, 4); // System.arraycopy(src, srcPos, dest, destPos, length);
//		System.out.println("arr2 len:" + arr2.length);
//		System.out.println(Arrays.toString(arr2));
//		int[] arr3 = new int[20];
//		int[] arr3 = Arrays.copyOf(arr,  4);
//		System.out.println("arr3 len:" + arr3.length);
//		System.out.println(Arrays.toString(arr3));

		// ��������
//		arr = Arrays.copyOf(arr, arr.length + 20); // ��������
//		System.out.println("arr len:" + arr.length);
//		System.out.println("arr:" + Arrays.toString(arr));

		// ��������
//		Arrays.sort(arr);
//		System.out.println("sorted arr:" + Arrays.toString(arr));
		
		// ������Ϊ�����Լ�����ֵʹ��
//		int[] arr = {1, 2, 3, 4, 5};
//		int[] retArr;
//		retArr = arrParamTest(arr);
//		print(Arrays.toString(retArr));
		
		//NOTE:
		//���ô���Ҳ��һ��ֵ���ݣ��������޸�ԭ�������õ�ֵ���� myArray ���õ�ֵû�б仯�����Ǻ�ԭ��һ����
		//�����������ô��� ���ݵ������������ڶ��еĵ�ַ����˿���ͨ�� ���ô��� �޸��������������ڶ��е�ֵ��
		//�������ô��ݲ������޸�ԭ�������õ�ֵ��
//		int[] testArr = {1, 2 ,3 ,4, 5};
//		print(Arrays.toString(testArr));
//		changeItToNull(testArr);
//		print(Arrays.toString(testArr)); // 1, 2 ,3 ,4, 5
		
		// ��ά����
//		String s1[][] = new String[2][3]; // 2��, 3�е�����
//		s1[0][0] = "Hello";
//		print(Arrays.toString(s1));
//		String s2[][] = new String[2][]; // �ֱ�Ϊÿһ�з���ռ�
//		s2[0] = new String[2]; // ��1�� 2 ��
//		s2[1] = new String[4]; // ��2�� 4 ��
//		s2[0][0] = new String("(0,0)");
//		s2[0][1] = new String("(0,1)");
//		s2[1][0] = new String("(1,0)");
//		s2[1][1] = new String("(1,1)");
//		s2[1][2] = new String("(1,2)");
//		s2[1][3] = new String("(1,3)");
//		print(Arrays.toString(s2));

		// java.lang.Arrays
//		ArraysTest.arraysMethodTest();
//		char[] arr = ArraysTest.stringToCharArray(new String("Hello,world"));
//		print("result:" + Arrays.toString(arr));
		int arr[] = {1, 3, 2, 5, 4, 8, 9, 0};
		ArraysTest.bubbleSort(arr);

	}
	
	// ����
	//[���η��б�]  ����ֵ����  ������(��ʽ�����б�){ �����壻}
	// static:��̬����,����ֱ��ͨ���������õķ���, ����Ҫʵ��������(��� C++ ��ȫһ��������)
	public static int add(int a, int b) {
		return (a + b);
	}

	// ����������
	// ��ͬһ������, ��������ͬ, �����б�ͬ(������ͬ/���Ͳ�ͬ/˳��ͬ)
	// �������غͷ�����+�����б��й�ϵ���������غͷ���ֵ�����޹أ������η��б��޹�
	public static float add (float a, float b) {
		return (a + b);
	}

	public static int add(int a, int b, int c) {
		return (a + b + c);
	}

	public static void printString(String info) {
		System.out.println(info);
	}
	
	// �ݹ����
	// ���д����ᵼ���ڴ����/ջ���
	public static void recursionTest(int cnt) {
		System.out.println("��" + cnt + "�ε���");
		++cnt;
		if (cnt == 10) // recursion base
			return;
		recursionTest(cnt);
	}
	
	/** 
	 * @fun Make a random array
	 * 
	 * @param[in] reference type
	 * @ret
	 * */
	public static void randomArray(String[] strArr) {
//		System.out.println("arr size:" + strArr.)
		strArr[0] = "default";
	}
	
	/** 
	 * @fun �߼���/��Ķ�·����
	 * 
	 * @param[in] reference type
	 * @ret
	 * */
	public static void logicOpTest() {
		int a = 5;
		boolean b = (a < 4) && (a++<10); // a<4 Ϊ false ʱ, �����жϺ�����ʽ�Ƿ�Ϊ true
		System.out.println("a=" + a + "  b=" + b);
	}
	
	/** 
	 * @fun ������Ϊ�����Լ�����ֵ
	 * 
	 * @param[in] ��������
	 * @ret ��������
	 * */
	public static int[] arrParamTest(int[] array) {
		int[] resultArr = Arrays.copyOf(array, array.length);
		resultArr[0] = 9999;

		for (int item : array) {
			System.out.print(item + ",");
		}
		System.out.print("\n");

		return resultArr;
	}

	/** 
	 * @fun ���޸����β�,ԭ�������е�ֵû�б��޸�
	 * 
	 * @param[in] reference type
	 * @ret
	 * */
	public static void changeItToNull(int[] z) {
		z = null;
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
}

/**
 * ԭʼ���ͣ�boolean��char��byte��short��int��long��float��double��
 * ��װ���ͣ�Boolean��Character��Byte��Short��Integer��Long��Float��Double��
 * Java �еĻ�����������ֻ������ 8 �������˻������ͣ�primitive type����ʣ�µĶ����������ͣ�reference type����
 * */
class PrimitiveTypeTest {
	public static void primitiveTypeTest() {
		System.out.println("primitive type test:");
        // byte  
        System.out.println("�������ͣ�byte ������λ����" + Byte.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Byte");  
        System.out.println("��Сֵ��Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("���ֵ��Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        System.out.println("�������ͣ�short ������λ����" + Short.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Short");  
        System.out.println("��Сֵ��Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("���ֵ��Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("�������ͣ�int ������λ����" + Integer.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Integer");  
        System.out.println("��Сֵ��Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("���ֵ��Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("�������ͣ�long ������λ����" + Long.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Long");  
        System.out.println("��Сֵ��Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("���ֵ��Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        System.out.println("�������ͣ�float ������λ����" + Float.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Float");  
        System.out.println("��Сֵ��Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("���ֵ��Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("�������ͣ�double ������λ����" + Double.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Double");  
        System.out.println("��Сֵ��Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("���ֵ��Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        System.out.println("�������ͣ�char ������λ����" + Character.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Character");  
        // ����ֵ��ʽ�������ַ���ʽ��Character.MIN_VALUE���������̨  
        System.out.println("��Сֵ��Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // ����ֵ��ʽ�������ַ���ʽ��Character.MAX_VALUE���������̨  
        System.out.println("���ֵ��Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
	}
}

//java.util.Arrays ���ܷ���ز������飬���ṩ�����з������Ǿ�̬�ġ�
class ArraysTest {
	public static void arraysMethodTest() {
		int[] arr1 = {9, 1, 2, 3, 4, 5, 6, 7};
		int[] arr2 = new int[20];
		
		Arrays.fill(arr2, 999);
		print(Arrays.toString(arr2));
		
		// ����������������ͬ������Ԫ�أ��������������е�������ӦԪ�ضԶ�����ȵģ�����Ϊ��������������ȵ�
		print("equals:" + Arrays.equals(arr1, arr2));
		
		Arrays.sort(arr1);
		print(Arrays.toString(arr1));
		
		// not defined
//		Arrays.sort(arr1, Collections.re);
		
		//�����ڵ���ǰ��������õġ�
		//�ö��ֲ����㷨�ڸ�����������������ֵ�Ķ���(Byte,Int,double��)��
		//�������ֵ�����������У��򷵻������������������򷵻� (-(�����) - 1)��
		// If array is not sorted, the results are undefined.
		print("binarySearch index:" + Arrays.binarySearch(arr1, 5));
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

	/**
	* string to character array
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public static char[] stringToCharArray(String str) {
		//TODO:
		//�������Ĳ��Ƕ��ڴ���? 
		//������Ϊ����ֵ����Ϊʲôû�б��ͷ�???
		char[] charArr = str.toCharArray();
		print(Arrays.toString(charArr));
		return charArr;
	}
	
	/**
	* ð������
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public static void bubbleSort(int[] arr) {
		print("in:" + Arrays.toString(arr));
		for (int i = 0; i < arr.length; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[i] > arr[j]) { // ����
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				print("��" + i + "," + j + "�������:" + Arrays.toString(arr));
			}
			print("��" + i + "����ѭ�������:" + Arrays.toString(arr));
		}
		print("result:" + Arrays.toString(arr));
	}
}

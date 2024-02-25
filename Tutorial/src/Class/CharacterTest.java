package Class;


import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CharacterTest {
	char ch = 'a';
	 
	// Unicode �ַ���ʾ��ʽ
	char uniChar = '\u039A'; 
	 
	// �ַ�����
	char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };

	public static void main(String[] args) {
//		charPackTest();
//		extractUpperLower("Hello, World, 123456");
		
//		StringTest.stringAddrTest();
//		StringTest.stringMethodTest();
//		StringTest.stringStorageTest();

		StringBufferTest.stringBufferMethodTest();
		
//		StringBuilderTest.stringBuilderMethodTest();
	}
	
	public static void charPackTest() {
		// char->Character:װ��
		Character ch1 = 'a';
		print("ch1:" + ch1);

		// Character->char:����
		// ���뾯��:Character ���캯���԰汾 9 ���������á�
		// The constructor Character(char) is deprecated since version 9
//		char ch2 = new Character('2');
		char ch2 = Character.valueOf('2');
		print("ch2:" + ch2);
		
		// ת������:\n \t \b \t \f \' \" \\
		
		print("isLetter:" + Character.isLetter(ch1));
		
		print("isDigit:" + Character.isDigit(ch2));
		
		print("isWhiteSpace:" + Character.isWhitespace(ch1));
		
		print("isUpperCase:" + Character.isUpperCase(ch1));
		print("isLowerCase:" + Character.isLowerCase(ch1));
		print("toUpperCase:" + Character.toUpperCase(ch1));
		print("toLowerCase:" + Character.toLowerCase(ch1));
		print("toLowerCase:" + Character.toLowerCase(ch1));
		
		print("toString, type? :" + (Character.toString(ch1) instanceof String));
		
	}
	
	/**
	* ���д�ӡ�ַ���, System.out.println ��д
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public static void extractUpperLower(String str) {
		int len = str.length(); // ���Ч��, ��֪�� Character.length() �ڲ������ʵ�ֵ�
		String upperStr = "";
		String lowerStr = "";
		for (int i = 0; i < len; ++i) {
			if (Character.isUpperCase(str.charAt(i))) {
				upperStr += str.charAt(i);
			} else if (Character.isLowerCase(str.charAt(i))) {
				lowerStr += str.charAt(i);
			} else {
				print("\'" + str.charAt(i) + "\'"+ " is not a Character");
			}
		}
		
		print("upperStr:" + upperStr);
		print("lowerStr:" + lowerStr);
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
 * StringTest �� String �������ԵĲ���
 * @author qz
 *
 */
class StringTest {
	public static void stringAddrTest() {
		//String �������ַ����洢�ڹ������У��� new �������ַ��������ڶ��ϣ�
		String s1 = "Runoob";              // String ֱ�Ӵ���
		String s2 = "Runoob";              // String ֱ�Ӵ���
		String s3 = s1;                    // ��ͬ����
		String s4 = new String("Runoob");   // String ���󴴽�
		String s5 = new String("Runoob");   // String ���󴴽�
		print("s1==s2:" + (s1 == s2));
		print("s4==s5:" + (s4 == s5));
		
		//String ���ǲ��ɸı�ģ�������һ�������� String ����������ֵ���޷��ı��ˣ��꿴�ʼǲ��ֽ�������
		//�����Ҫ���ַ������ܶ��޸ģ���ôӦ��ѡ��ʹ�� StringBuffer & StringBuilder �ࡣ
	}

	/**
	* String methods
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/	public static void stringMethodTest() {
		// String ���� 11 �й��캯��
		char welcomeInfoStr[] = {'W', 'e', 'l', 'c', 'o', 'm', 'e'};
		String s1 = new String(welcomeInfoStr);;
		String s2 = new String("Welcome");
		print(s1);
		print(s2);
		print("address s1==s2:" + (s1 == s2));
		print("value s1==s2:" + (s1.equals(s2)));
		print("value equalsIgnoreCase:" + (s1.equalsIgnoreCase("welcome")));
		
		print("length:" + s1.length());
		
		print("concat result:" + s1.concat(s2));
		
		// ��ʽ���ַ���
		System.out.printf("string info s1:%s\n", s1); //C �����е� printf()
		String s3 = String.format("s1:%s s2:%s", s1, s2);
		print(s3);
		
		char ch0 = s1.charAt(0);
		print("ch0:" + ch0);
		
		// �������ʱ:���αȽϱȶ�ASCII���ֵ, ��һ����ȾͱȽ���һ��
		// ���Ȳ����ʱ:����ֵ=ԭ�ַ���������ַ��������ַ�������ԭ�ַ������ȴ�ʱΪ������֮Ϊ��
		print("compare to:" + s1.compareTo("Abc") + "  " + s1.compareTo(s2) + "  " + s1.compareTo("XYZ"));
		print("compare to:" + s1.compareTo("Welcom") + "  " + s1.compareTo(s2) + "  " + s1.compareTo("Welcome1"));
		print("compareToIgnoreCase:" + s1.compareToIgnoreCase("welcome"));

		print("concat:" + s1.concat(" To My world"));
		
		// �� StringBuffer �Ƚ�
		StringBuffer strBuf = new StringBuffer("ABC");
		print("contentEquals:" + s1.contentEquals(strBuf));
		
		// copyValueOf
		char strArr2[] = {'W', 'e', 'l', 'c', 'o', 'm', 'e'};
		String s4 = String.copyValueOf(strArr2);
		String s5 = "";
		s5 = s5.copyValueOf(strArr2, 2, 3);
		print("copyValueOf s4:" + s4 + "  s5:" + s5);
		
		print("endsWith:" + s1.endsWith("come") + "  " + s1.endsWith("Wel"));
		
		try {
			//ʹ��ƽ̨��Ĭ���ַ������ַ�������Ϊ byte ���У���������洢��һ���µ� byte �����С�
			byte[] str1Bytes = s1.getBytes();
			print("str1Btres:" + str1Bytes);
			// ʹ��ָ�����ַ������ַ�������Ϊ byte ���У���������洢��һ���µ� byte �����С�
			str1Bytes = s1.getBytes("UTF-8");
			print("str1Bytes:" + str1Bytes); 
			for (byte bi : str1Bytes) { // ��ӡ����Ԫ��
				print("" + bi);
			}
			str1Bytes = s1.getBytes("ISO-8859-1");
			print("str1Bytes:" + str1Bytes); 
		} catch (UnsupportedEncodingException e) {
			print("not suppoerted exception");
		}
		
		char[] destArr = new char[20];
		s1.getChars(0, 5, destArr, 0); // ����ҿ�����
		for (int i = 0; i < destArr.length; ++i) {
			System.out.print(destArr[i] + ",");
		}
		System.out.println("");
		
		print("hashCode:" + s1.hashCode());
		
		// Welcome
		print("indexOf:" + s1.indexOf('e'));
		print("indexOf:" + s1.indexOf('e', 5));
		print("indexOf:" + s1.indexOf("We"));
		print("indexOf:" + s1.indexOf("We", 5));
		print("lastIndexOf:" + s1.lastIndexOf('e')); // ���һ�γ��ֵ�λ������/�Ӻ���ǰ��һ�γ��ֵ�λ������(��ָ����λ�ÿ�ʼ��������)
		print("lastIndexOf:" + s1.lastIndexOf('e', 5));
		print("lastIndexOf:" + s1.lastIndexOf("We"));
		print("lastIndexOf:" + s1.lastIndexOf("We", 5));

		//����ʵ���У�str1 ��ֱ�Ӹ�ֵ���ַ������������ᱻ�Զ���ӵ��ַ������С�
		//str2 ��ͨ ��new String() ���������ַ��������������Զ���ӵ��ַ������С�
		//Ȼ��ͨ������ intern() �������� str2 ��ӵ��ַ������У��������ַ������е����ã������� str3 �С�
		//ע�⣬== ��������ڱȽ������Ƿ���ȡ��������ʾ���У�str1 == str3 ���� true��������Ϊ���Ƕ������ַ������е�ͬһ������
		//ʹ�� intern() ������������Ҫ�Ƚ��ַ�������ʱ��ʡ�ڴ棬��Ϊ������ȷ����ͬ���ݵ��ַ�������ͬһ������
		//Ȼ��������ʹ�� intern() �������ܵ����ַ����ص����������Ĵ����ڴ档
		//��ˣ�Ӧ����ʹ�� intern() ������ֻ�ڱ�Ҫʱʹ�á�
        String str6 = "Runoob";
        String str7 = new String("Runoob");
        String str8 = str6.intern();
        System.out.println(str6 == str7); // false
        System.out.println(str6 == str8); // true

        print("length:" + s1.length());
	
        //������ʽ
//        print("matches:" + s1.matches("*"));
	
        print("regionMatches:" + s1.regionMatches(true, 0, s2, 0, 5));
        
        print("replace:" + s1.replace('e', 'E'));
	
        print("startsWith:" + s1.startsWith("We"));
        print("startsWith:" + s1.startsWith("We", 5));
	
        //String replaceAll(String regex, String replacement)
        //ʹ�ø����� replacement �滻���ַ�������ƥ�������������ʽ�����ַ�����
        //String replaceFirst(String regex, String replacement)
        //ʹ�ø����� replacement �滻���ַ���ƥ�������������ʽ�ĵ�һ�����ַ�����
        //String[] split(String regex)
        //���ݸ���������ʽ��ƥ���ִ��ַ�����
        //String[] split(String regex, int limit)
        //����ƥ�������������ʽ����ִ��ַ�����
        
        print("subSequence:" + s1.subSequence(1, 5));
        print("substring:" + s1.substring(1));
        print("substring:" + s1.substring(1, 5));
        
        char[] destArr2 = new char[20];
        destArr2 = s1.toCharArray();
        for (int i = 0; i < destArr2.length; ++i) {
        	System.out.print(destArr2[i] + ",");
        }
        System.out.print("\n");
        
//        print("toLowerCase:" + s1.toLowerCase());
        //print("toLowerCase:" + s1.toLowerCase(Locale locale));
//        print("toUpperCase:" + s1.toUpperCase());
//        print("toString:" + s1.toString());

        //trim() ��������ɾ���ַ�����ͷβ�հ׷���
        print("trim:" + s1.trim());
        
        //���ص� valueOf() ����, ����ͬ����������ת��Ϊ�ַ���
        print("valueOf:" + String.valueOf(false));
        
        print("isEmpty:" + s1.isEmpty());
        
        print("contains" + s1.contains("WE"));
        print("contains:" + s1.contains("We"));
        
	}
	
	public static void stringStorageTest() {
		/** Java String.length() ����: */
		//������ length ��Ա
		//Java �е� size() ��������Է��ͼ���˵��, ����뿴��������ж��ٸ�Ԫ��, �͵��ô˷������鿴!
//		String nameArr[] = {"Libai", "Wanganshi", "Dufu", "Baijuyi", "Wangbo"};
//		String a = "HelloWorld";
//		List<String> list = new ArrayList<String>();
//		list.add(a);
//		print("����Ԫ�ظ���:" + nameArr.length);
//		print("�ַ�������:" + a.length());
//		print("list��Ԫ�ظ���" + list.size());

		/** String ���ǲ��ɸı�Ľ��� */
		//�ӽ���Ͽ��Ǹı��ˣ���Ϊʲô˵ String �����ǲ��ɱ���أ�
		//ԭ������ʵ���е� s ֻ��һ�� String ��������ã������Ƕ�����
		//��ִ�� s = "Runoob"; ������һ���µĶ��� "Runoob"����ԭ���� "Google" ���������ڴ��С�
		//��ʱ:"�ַ���������" �б����������ַ���, ֻ�� s ָ�� "def"
		//�� jdk ԭ�� String ��ʵ�ֽǶȷ���: �����ַ���ֵ������Ϊ����
		//public final class String
//	    implements java.io.Serializable, Comparable<String>, CharSequence {
//	        /** The value is used for character storage. */
//	        private final char value[]; // ����

//		String s = "abc";
//		print(s);
//		s = "def";
//		print(s);
		
//		String a = "a";
//		String b = "b";
//		String c = a + b; // String c = new StringBuffer().append(a).append(b).toString();
//		String d = "ab";
		//�����ַ����ļ����㣬������� class �ļ�ʱ�����Զ�����Ϊ StringBuffer �������ַ��������Ӳ�����
		//String c = new StringBuffer().append(a).append(b).toString();
		//ͬʱ�����ַ��������أ�
		//��һ���ַ�����һ��������ʱ�����ᱻ�ŵ��ַ����������У��ȴ����á�
//		print("address c==d:" + (c==d)); // false ����ʹ�� StringBuffer ����
//		print("value c==d:" + (c.equals(d))); // true
		
		//e.g.
//		String s1 = "abc"; // �ַ���������
//		String s2 = new String("abc"); // ���ڴ���
//		System.out.println(s1==s2); // false��������ĵ�ֵַ��һ����
//		System.out.println(s1.equals(s2)); // true, �����ַ���ֵ��ͬ, s1.compareTo(s2) Ϊ 0;
		
		// ���õĶ��� �ַ��������� �е��ַ���
//		String s1="a"+"b"+"c";
//		String s2="abc";
//		System.out.println(s1==s2); // true java �г����Ż����ƣ�����ʱ s1 �Ѿ���Ϊ abc �ڳ������в��Ҵ�����s2 ����Ҫ�ٴ�����
//		System.out.println(s1.equals(s2)); // true
		
		//���� s3���ȴ���StringBuilder���� StringBuffer������
		//ͨ�� append ���ӵõ� abc ,�ٵ��� toString() ת���õ��ĵ�ַָ�� s3���� (s3==s2) Ϊ false��
//		String s1 = "ab";
//		String s2 = "abc";
//		String s3 = s1 + "c"; // ���ڴ���:String s3 = new StringBuffer().append(s1).append("c").toString();
//		System.out.println(s3 == s2); // false ָ��ͬ�ĵ�ַ
//		System.out.println(s3.equals(s2));  // true ֵ��ͬ
		
//        String str1 = "a".concat("b").concat("c");
//        String str2 = "a"+"b"+"c";
//        String str3 = "abc";
//        String str4 = new String("abc");
//        System.out.println(str1 == str2); //false
//        System.out.println(str1 == str3); //false
//        System.out.println(str2 == str3); //ture java �����еĳ����Ż�����
//        System.out.println(str2 == str4); //false һ�����ַ��������� һ���ڶ� StringBuffer ��
//        System.out.println(str1.equals(str4)); //true ֵ���
		
		/** String/StringBuffer/StringBuilder */
		/*
		String���ַ����������ַ������Ȳ��ɱ䡣
		Java��String ��immutable�����ɱ䣩�ġ�
		���ڴ���ַ������鱻����Ϊfinal�ģ����ֻ�ܸ�ֵһ�Σ������ٸ��ġ�
		
		StringBuffer���ַ���������Synchronized�����̰߳�ȫ����
		���ҪƵ�����ַ������ݽ����޸ģ�����Ч�ʿ������ʹ�� StringBuffer��
		�����ת�� String ���ͣ����Ե��� StringBuffer �� toString() ������
		Java.lang.StringBuffer �̰߳�ȫ�Ŀɱ��ַ����С�������ʱ�������������ĳ���ض����ַ����У�
		��ͨ��ĳЩ�������ÿ��Ըı�����еĳ��Ⱥ����ݡ��ɽ��ַ�����������ȫ�����ڶ���̡߳�
		
		StringBuilder���ַ������������̰߳�ȫ����
		���ڲ� StringBuilder ���󱻵�����һ�������ַ����еı䳤���顣
		
		����ԭ��
		���Ҫ���������������� String ��
		���̲߳�������������StringBuilder ��
		���̲߳����������ݣ���StringBuffer��
		
		�����ַ��������޸ĵ�ʱ����Ҫʹ�� StringBuffer �� StringBuilder �ࡣ
		�� String �಻ͬ���ǣ�StringBuffer �� StringBuilder ��Ķ����ܹ�����ε��޸ģ����Ҳ������µ�δʹ�ö���
		
		��ʹ�� StringBuffer ��ʱ��ÿ�ζ���� StringBuffer ��������в����������������µĶ���
		���������Ҫ���ַ��������޸��Ƽ�ʹ�� StringBuffer��
		
		StringBuilder ���� Java 5 �б������
		���� StringBuffer ֮������ͬ���� StringBuilder �ķ��������̰߳�ȫ�ģ�����ͬ�����ʣ���
		���� StringBuilder ����� StringBuffer ���ٶ����ƣ����Զ�������½���ʹ�� StringBuilder �ࡣ
		*/
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

//StringBuffer
//��Ӧ�ó���Ҫ���̰߳�ȫ������£������ʹ�� StringBuffer �ࡣ
class StringBufferTest {
	public static void stringBufferMethodTest() {
		print("StringBuffer Class Test");
		StringBuffer strBuff = new StringBuffer("Hello, world.");
		print(strBuff);
		
		strBuff.append(false);
		print(strBuff);
		
		strBuff.reverse();
		print(strBuff);
		
		strBuff.reverse();
		print(strBuff);
		
		strBuff.delete(0, 2);
		print(strBuff);
		
		strBuff.insert(0, "He");
		print(strBuff);
		
		strBuff.replace(0, 5, "World");
		print(strBuff);
		
		strBuff.ensureCapacity(1000); // ָ������>= 1000
		
		print("capacity:" + strBuff.capacity());
		
		print("charAt:" + strBuff.charAt(0));
		
		char[] arr = new char[20];
		strBuff.getChars(0, 5, arr, 5);
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + ",");
		}
		System.out.print("\n");
		
		print("indexOf:" + strBuff.indexOf("H"));
		print("indexOf:" + strBuff.indexOf("H", 5));
		print("lastIndexOf:" + strBuff.lastIndexOf("H"));
		print("lastIndexOf:" + strBuff.lastIndexOf("H", 5));	

		strBuff.setCharAt(0, 'H');
		
		print("subSequence:" + strBuff.subSequence(0, 5));
		print("subString:" + strBuff.substring(0));
		print("substring:" + strBuff.substring(0, 5));
		
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

	public static void print(StringBuffer sB) {
		System.out.println(sB.toString());
	}
}

//StringBuilder
//���̰߳�ȫ��,�����ٶȿ�
class StringBuilderTest {
	public static void stringBuilderMethodTest() {
		print("StringBuilder Class Test");
		StringBuilder sB = new StringBuilder(10);
		sB.append(" abced");
		print(sB);
		sB.append("!");
		print(sB);
		sB.insert(0, false);
		print(sB);
		sB.delete(0, 2); // [0,2), ����ҿ�����, 0, 1
		print(sB);
		
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
	
	public static void print(StringBuilder sB) {
		System.out.println(sB.toString());
	}
}

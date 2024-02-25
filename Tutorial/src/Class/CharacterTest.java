package Class;


import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CharacterTest {
	char ch = 'a';
	 
	// Unicode 字符表示形式
	char uniChar = '\u039A'; 
	 
	// 字符数组
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
		// char->Character:装箱
		Character ch1 = 'a';
		print("ch1:" + ch1);

		// Character->char:拆箱
		// 编译警告:Character 构造函数自版本 9 以来被弃用。
		// The constructor Character(char) is deprecated since version 9
//		char ch2 = new Character('2');
		char ch2 = Character.valueOf('2');
		print("ch2:" + ch2);
		
		// 转义序列:\n \t \b \t \f \' \" \\
		
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
	* 换行打印字符串, System.out.println 缩写
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static void extractUpperLower(String str) {
		int len = str.length(); // 提高效率, 不知道 Character.length() 内部是如何实现的
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
	* 换行打印字符串, System.out.println 缩写
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static void print(String str) {
		System.out.println(str);
	}

}

/** 
 * StringTest 类 String 方法测试的操作
 * @author qz
 *
 */
class StringTest {
	public static void stringAddrTest() {
		//String 创建的字符串存储在公共池中，而 new 创建的字符串对象在堆上：
		String s1 = "Runoob";              // String 直接创建
		String s2 = "Runoob";              // String 直接创建
		String s3 = s1;                    // 相同引用
		String s4 = new String("Runoob");   // String 对象创建
		String s5 = new String("Runoob");   // String 对象创建
		print("s1==s2:" + (s1 == s2));
		print("s4==s5:" + (s4 == s5));
		
		//String 类是不可改变的，所以你一旦创建了 String 对象，那它的值就无法改变了（详看笔记部分解析）。
		//如果需要对字符串做很多修改，那么应该选择使用 StringBuffer & StringBuilder 类。
	}

	/**
	* String methods
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/	public static void stringMethodTest() {
		// String 类有 11 中构造函数
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
		
		// 格式化字符串
		System.out.printf("string info s1:%s\n", s1); //C 语言中的 printf()
		String s3 = String.format("s1:%s s2:%s", s1, s2);
		print(s3);
		
		char ch0 = s1.charAt(0);
		print("ch0:" + ch0);
		
		// 长度相等时:依次比较比对ASCII码的值, 第一个相等就比较下一个
		// 长度不相等时:返回值=原字符串与参数字符串相差的字符个数，原字符串长度大时为正，反之为负
		print("compare to:" + s1.compareTo("Abc") + "  " + s1.compareTo(s2) + "  " + s1.compareTo("XYZ"));
		print("compare to:" + s1.compareTo("Welcom") + "  " + s1.compareTo(s2) + "  " + s1.compareTo("Welcome1"));
		print("compareToIgnoreCase:" + s1.compareToIgnoreCase("welcome"));

		print("concat:" + s1.concat(" To My world"));
		
		// 与 StringBuffer 比较
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
			//使用平台的默认字符集将字符串编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
			byte[] str1Bytes = s1.getBytes();
			print("str1Btres:" + str1Bytes);
			// 使用指定的字符集将字符串编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
			str1Bytes = s1.getBytes("UTF-8");
			print("str1Bytes:" + str1Bytes); 
			for (byte bi : str1Bytes) { // 打印数组元素
				print("" + bi);
			}
			str1Bytes = s1.getBytes("ISO-8859-1");
			print("str1Bytes:" + str1Bytes); 
		} catch (UnsupportedEncodingException e) {
			print("not suppoerted exception");
		}
		
		char[] destArr = new char[20];
		s1.getChars(0, 5, destArr, 0); // 左闭右开区间
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
		print("lastIndexOf:" + s1.lastIndexOf('e')); // 最后一次出现的位置索引/从后往前第一次出现的位置索引(从指定的位置开始反向搜索)
		print("lastIndexOf:" + s1.lastIndexOf('e', 5));
		print("lastIndexOf:" + s1.lastIndexOf("We"));
		print("lastIndexOf:" + s1.lastIndexOf("We", 5));

		//以上实例中，str1 是直接赋值的字符串常量，它会被自动添加到字符串池中。
		//str2 是通 过new String() 创建的新字符串对象，它不会自动添加到字符串池中。
		//然后，通过调用 intern() 方法，将 str2 添加到字符串池中，并返回字符串池中的引用，保存在 str3 中。
		//注意，== 运算符用于比较引用是否相等。在上面的示例中，str1 == str3 返回 true，这是因为它们都引用字符串池中的同一个对象。
		//使用 intern() 方法可以在需要比较字符串内容时节省内存，因为它可以确保相同内容的字符串共享同一个对象。
		//然而，过度使用 intern() 方法可能导致字符串池的增长，消耗大量内存。
		//因此，应谨慎使用 intern() 方法，只在必要时使用。
        String str6 = "Runoob";
        String str7 = new String("Runoob");
        String str8 = str6.intern();
        System.out.println(str6 == str7); // false
        System.out.println(str6 == str8); // true

        print("length:" + s1.length());
	
        //正则表达式
//        print("matches:" + s1.matches("*"));
	
        print("regionMatches:" + s1.regionMatches(true, 0, s2, 0, 5));
        
        print("replace:" + s1.replace('e', 'E'));
	
        print("startsWith:" + s1.startsWith("We"));
        print("startsWith:" + s1.startsWith("We", 5));
	
        //String replaceAll(String regex, String replacement)
        //使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
        //String replaceFirst(String regex, String replacement)
        //使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
        //String[] split(String regex)
        //根据给定正则表达式的匹配拆分此字符串。
        //String[] split(String regex, int limit)
        //根据匹配给定的正则表达式来拆分此字符串。
        
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

        //trim() 方法用于删除字符串的头尾空白符。
        print("trim:" + s1.trim());
        
        //重载的 valueOf() 方法, 将不同的数据类型转换为字符串
        print("valueOf:" + String.valueOf(false));
        
        print("isEmpty:" + s1.isEmpty());
        
        print("contains" + s1.contains("WE"));
        print("contains:" + s1.contains("We"));
        
	}
	
	public static void stringStorageTest() {
		/** Java String.length() 方法: */
		//数组有 length 成员
		//Java 中的 size() 方法是针对泛型集合说的, 如果想看这个泛型有多少个元素, 就调用此方法来查看!
//		String nameArr[] = {"Libai", "Wanganshi", "Dufu", "Baijuyi", "Wangbo"};
//		String a = "HelloWorld";
//		List<String> list = new ArrayList<String>();
//		list.add(a);
//		print("数组元素个数:" + nameArr.length);
//		print("字符串长度:" + a.length());
//		print("list中元素个数" + list.size());

		/** String 类是不可改变的解析 */
		//从结果上看是改变了，但为什么说 String 对象是不可变的呢？
		//原因在于实例中的 s 只是一个 String 对象的引用，并不是对象本身，
		//当执行 s = "Runoob"; 创建了一个新的对象 "Runoob"，而原来的 "Google" 还存在于内存中。
		//此时:"字符串常量池" 中保存了两个字符串, 只是 s 指向 "def"
		//从 jdk 原码 String 类实现角度分析: 保存字符串值的数组为常量
		//public final class String
//	    implements java.io.Serializable, Comparable<String>, CharSequence {
//	        /** The value is used for character storage. */
//	        private final char value[]; // 常量

//		String s = "abc";
//		print(s);
//		s = "def";
//		print(s);
		
//		String a = "a";
//		String b = "b";
//		String c = a + b; // String c = new StringBuffer().append(a).append(b).toString();
//		String d = "ab";
		//对于字符串的加运算，当编译成 class 文件时，会自动编译为 StringBuffer 来进行字符串的连接操作。
		//String c = new StringBuffer().append(a).append(b).toString();
		//同时对于字符串常量池：
		//当一个字符串是一个字面量时，它会被放到字符串常量池中，等待复用。
//		print("address c==d:" + (c==d)); // false 堆区使用 StringBuffer 保存
//		print("value c==d:" + (c.equals(d))); // true
		
		//e.g.
//		String s1 = "abc"; // 字符串常量池
//		String s2 = new String("abc"); // 堆内存中
//		System.out.println(s1==s2); // false两个对象的地址值不一样。
//		System.out.println(s1.equals(s2)); // true, 两个字符串值相同, s1.compareTo(s2) 为 0;
		
		// 引用的都是 字符串常量池 中的字符串
//		String s1="a"+"b"+"c";
//		String s2="abc";
//		System.out.println(s1==s2); // true java 中常量优化机制，编译时 s1 已经成为 abc 在常量池中查找创建，s2 不需要再创建。
//		System.out.println(s1.equals(s2)); // true
		
		//对于 s3，先创建StringBuilder（或 StringBuffer）对象，
		//通过 append 连接得到 abc ,再调用 toString() 转换得到的地址指向 s3。故 (s3==s2) 为 false。
//		String s1 = "ab";
//		String s2 = "abc";
//		String s3 = s1 + "c"; // 堆内存中:String s3 = new StringBuffer().append(s1).append("c").toString();
//		System.out.println(s3 == s2); // false 指向不同的地址
//		System.out.println(s3.equals(s2));  // true 值相同
		
//        String str1 = "a".concat("b").concat("c");
//        String str2 = "a"+"b"+"c";
//        String str3 = "abc";
//        String str4 = new String("abc");
//        System.out.println(str1 == str2); //false
//        System.out.println(str1 == str3); //false
//        System.out.println(str2 == str3); //ture java 编译中的常量优化机制
//        System.out.println(str2 == str4); //false 一个在字符串常量池 一个在堆 StringBuffer 中
//        System.out.println(str1.equals(str4)); //true 值相等
		
		/** String/StringBuffer/StringBuilder */
		/*
		String：字符串常量，字符串长度不可变。
		Java中String 是immutable（不可变）的。
		用于存放字符的数组被声明为final的，因此只能赋值一次，不可再更改。
		
		StringBuffer：字符串变量（Synchronized，即线程安全）。
		如果要频繁对字符串内容进行修改，出于效率考虑最好使用 StringBuffer，
		如果想转成 String 类型，可以调用 StringBuffer 的 toString() 方法。
		Java.lang.StringBuffer 线程安全的可变字符序列。在任意时间点上它都包含某种特定的字符序列，
		但通过某些方法调用可以改变该序列的长度和内容。可将字符串缓冲区安全地用于多个线程。
		
		StringBuilder：字符串变量（非线程安全）。
		在内部 StringBuilder 对象被当作是一个包含字符序列的变长数组。
		
		基本原则：
		如果要操作少量的数据用 String ；
		单线程操作大量数据用StringBuilder ；
		多线程操作大量数据，用StringBuffer。
		
		当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
		和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
		
		在使用 StringBuffer 类时，每次都会对 StringBuffer 对象本身进行操作，而不是生成新的对象，
		所以如果需要对字符串进行修改推荐使用 StringBuffer。
		
		StringBuilder 类在 Java 5 中被提出，
		它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
		由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。
		*/
	}
	
	
	/**
	* 换行打印字符串, System.out.println 缩写
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static void print(String str) {
		System.out.println(str);
	}
}

//StringBuffer
//在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
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
		
		strBuff.ensureCapacity(1000); // 指定容量>= 1000
		
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
	* 换行打印字符串, System.out.println 缩写
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static void print(String str) {
		System.out.println(str);
	}

	public static void print(StringBuffer sB) {
		System.out.println(sB.toString());
	}
}

//StringBuilder
//非线程安全的,但是速度快
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
		sB.delete(0, 2); // [0,2), 左闭右开区间, 0, 1
		print(sB);
		
	}
	
	/**
	* 换行打印字符串, System.out.println 缩写
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static void print(String str) {
		System.out.println(str);
	}
	
	public static void print(StringBuilder sB) {
		System.out.println(sB.toString());
	}
}

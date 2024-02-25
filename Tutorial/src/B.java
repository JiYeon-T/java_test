//package Hello;

import java.util.Arrays;
import java.util.Scanner;
//import org.apache.commons.lang3.ObjectUtils;
import java.util.Collections;


//import Class.异常类型;


//2.1、简单性
//java中不在支持多继承，Java中也屏蔽了指针的概念
//java语言的底层是c++实现
//2.2、面向对象
//java是纯面向对象的，更符合人的思维模式，更容易理解
//2.3、可移植性
//java可以做到一次编译，到处运行，java程序在windoes系统上运行，不做任何修改就可以在Linux系统上运行。
//java程序运行在一台虚拟的计算机当中（JVM）然后让JVM链接底层的操作系统
//2.4、多线程
//2.5、健壮性
//java语言中产生的垃圾是自动回收的，（GC机制）

// class name 必须与 文件名相同, 区分大小写
public class B {
	public static void main(String[] args) {
//		System.out.println("请输入两行7个英文字符的明文：");
		System.out.println("Hello, world");

		// 内置变量类型
//		byte b = 0; // -127-128, size:1byte
//		System.out.println("b="+b);
//		short s = 1000; // size:2 bytes, default:'\u0000'
//		System.out.println("s="+s);
//		int i1 = 9999; // size:4 bytes, default:0
//		System.out.println("i1="+i1);
//		long l1 = 99999L; // size:8 bytes, default:0, java 中整数默认为 int 类型,如果要使用长整型, 后面
//		long l1 = 9999l;
//		System.out.println("l1="+l1);

//		boolean b2 = false; // true/false, size:1, default:false
//		System.out.println("b2="+b2);
//		char c1 = 'a', c2 = '中'; // size:2, default:0
//		System.out.println("c1="+c1);
//		System.out.println("c="+c2);
//
//		// java 中, 所有的浮点数默认当作 double 处理,要想当作 float, 结尾要加 f
		/** 浮点数不能用来表示精确的值，如货币	 */
//		float f1 = 0.999f; // size:4, 
//		System.out.println("f1="+f1);
//		double d1 = 0.9999;
//		System.out.println("d1="+d1);
		// 类型转换,小容量->大容量:自动类型转换; 大容量->小容量:强制类型转换, 会损失精度
		// byte、short、char在混合运算的时候，各自先转换成int在做运算；
		// 多种数据类型混合运算，先转换成最大容量的那种类型在做运算；
//		float fTest = (float)d1;
//		System.out.println("fTest=" + fTest);
		// 例如:
		//Q:short a = 1, b = 2; a+b 是什么类型?
		//A:在java的世界里，如果比int类型小的类型做运算，java在编译的时候就会将它们统一强转成int类型。
		//当是比int类型大的类型做运算，就会自动转换成它们中最大类型那个。
		
		/**
		 * java 中，任何字符类型与字符串相加，结果都是拼接。
		 * 原因：先应用 String.valueOf 得出 s 的 value 值，再通过 StringBuilder 拼接 hello，
		 * 因此将 value 与 hello 进行了拼接。
		 */
//		String s = null;
//		s += " hello";
//		s = (new StringBuilder(String.valueOf(s))).append("hello").toString();
//		System.out.println(s);

		/** 基本数据类型测试的类 */
//		PrimitiveTypeTest p = new PrimitiveTypeTest();
//		p.primitiveTypeTest();

		/** 引用数据类型 */
		// 1.在Java中，引用类型的变量非常类似于C/C++的指针。引用类型指向一个对象，指向对象的变量是引用变量。
		// 这些变量在声明时被指定为一个特定的类型，比如 Employee、Puppy 等。变量一旦声明后，类型就不能被改变了。
		// 2. 对象、数组都是引用数据类型。
		// 3.所有引用类型的默认值都是null。
		// 4. 一个引用变量可以用来引用任何与之兼容的类型。例如：Site site = new Site("Runoob")。
//		String[] strArr = {"Libai", "Wanganshi", "WangZhiHuan"};
//		System.out.println(strArr[0]);
//		randomArray(strArr); // 数组传递参数为引用类型
//		System.out.println(strArr[0]);

		/** 常量:final, 常量只能被赋值一次 */
//		final double PI; // 		final double PI = 3.14;
//		PI = 3.14;
//		System.out.println("Pi="+PI);
		// 字符串常量和字符变量都可以包含任何 Unicode 字符
//		char a = '\u0001';
//		String s2 = "\u0001\u0002";
//		System.out.println("a:" + a + " s:" + s2);

		/** 不同进制:
		 * 当使用字面量的时候，前缀 0 表示 8 进制，而前缀 0x 代表 16 进制 */
//		int decimal = 100;
//		int octal = 0144;
//		int hext = 0x64;
//		System.out.println("decimal:" + decimal + " octal:" + octal + " hext:" + hext);
		
		/** 算数运算符: */
//		int a = 1, b = 22;
//		System.out.println("a+b=" + (a+b));
//		System.out.println("a-b=" + (a-b));
//		System.out.println("a*b=" + (a*b));
//		System.out.println("a/b=" + (a/b));
//		System.out.println("a%b=" + (a%b));
//		System.out.println("++a=" + (++a));
//		System.out.println("b++=" + (b++));
		
		// 位运算符: &, |, ~, ^, <<, >>, >>>
		// 0000 0001
		// 0000 0010
//		byte a = 0x01, b = 0x02;
//		System.out.println("a&b=" + (a & b));
//		System.out.println("a|b=" + (a | b));
//		System.out.println("a^b=" + (a ^ b));
		//在Java中，所有数据的表示方法都是以补码的形式表示
		//反码:正数的反码是其本身, 负数的反码:符号位不变, 其余按位取反
		//补码:正数的补码是其本身, 负数的补码:符号位不变, 其余按位取反, 然后 +1
		//例如:
		//0x01 补码后结果为: 0000 0001
		//~a 按位取反后: 1111 1110
		//因为高位是1，所以原码为负数，负数的补码是其绝对值的原码取反，末尾再加1。因此，我们可将这个二进制数的补码进行还原：
		//（1）首先，末尾减1得反码: 1111 1101
		//（2）其次，将各位取反得原码(负数:符号位不变)：1000 0010
		//（3）此时二进制转原码为-2
//		System.out.println("~a=" + (~a)); // -2
//		System.out.println("a<<1=" + (a << 1));
//		System.out.println("a>>1=" + (a >> 1));
		// 按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。 
//		System.out.println("a>>>1=" + (a >>> 1));
		
		// 关系运算符:>, >=, <, <=, !=, ==,
		// = 赋值运算符
		// 特殊的赋值运算符: +=, -=, *=, /=, %=, <<=, >>=, ^=, %=
		
		// 逻辑运算符:
		// ! 逻辑非
		// && 短路与, || 短路或
		// Note: 逻辑与与逻辑或的运算结果一致, 只是存在短路现象
		// 短路现象:a && b, 如果 a 为 true, 则不会再计算表达式 b
//		int a = 1, b = 8;
//		System.out.println("a^b=" + (a ^ b));
//		System.out.println("a&&b=" + ((a != 0) && (b != 0)));
//		System.out.println("a||b=" + ((a != 0) || (b != 0)));
//		System.out.println("!a=" + (!(a != 0)));
//		logicOpTest();

		/** 三元运算符 */
//		int a = 2;
//		System.out.println("A:a>1? A:" + (a > 1 ? "是的" : "不是"));
		
		// instance of 运算符
//		String name = "Libai";
//		boolean result = name instanceof String;
//		System.out.println("name:" + name + "  result:" + result);
		
		/** 运算符优先级 */
		// 单目运算符, 三目运算符, 赋值运算符 从右往左计算的, 其余都是从左往右计算的 
		// 等价于: f = a ? b : (c ? d : e);
//		boolean a = true, b = true, c = true, d = true, e = true, f = true;
//		f = a ? b: c ? d : e;
		
//		short s = 100;
		//编译报错, cannot convert from int to short, java 中默认为 int 类型
//		s = s + 3;
//		s = (short)(s + 3);
//		s += 3; //既可以实现运算，又不会更改s的数据类型
		//输出 16 进制
//		System.out.println(String.format("s:0x%x", s)); 
		
		// 创建 Scanner 对象
//		Scanner sc = new Scanner(System.in);
//		System.out.print("请输入:");
//		int i = sc.nextInt();
//		System.out.println("输入是:" + i);
//		String s = sc.nextLine();
//		System.out.println("输入是:" + s);
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
		// 5、Switch后面的值只能是int、String类型的数据，不能是其他类型
		// 6、byte、short、char可以直接写在Switch后面，因为会进行自动类型转换；
//		int month = 4;
//		switch (month) {
//		case 1:
//		case 2:
//		case 3: // case 穿透现象
//			System.out.println("春 month:" + month);
//			break;
//		case 4:
//		case 5:
//		case 6:
//			System.out.println("夏 month:" + month);
//			break;
//		default:
//			System.out.println("unknown situation a=" + month);
//			break;
//		}
		
		/** for */
//		System.out.println("for 输出:");
//		for (int i = 1; i < 11; ++i) {
//			if (i == 2)
//				continue; // 中断本次循环，开始下一次循环；
//			if (i == 5)
//				break; // break只会 跳出当前break语句所在的那层循环
//			System.out.println("i=" + i);
//		}
		
		// 在 Java5 中引入了一种主要用于数组的增强型 for 循环。
//		String names[] = {"James", "Larry", "Tom", "Lacy"};
//		for (String name : names) {
//			System.out.print(name);
//			System.out.print(", ");
//		}
//		System.out.print("\n");
		
		/** while */
//		System.out.println("while 输出:");
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
//		System.out.println("do-while 输出:");
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
		
		/** 方法: */
//		int a = 1, b = 2;
//		System.out.println("a+b=" + (Hello.add(a,  b))); // 如果不加 static:Cannot make a static reference to the non-static method add(int, int) from the type Hello
//		// 方法调用如果调用者和方法在同一个类中，类名可以省略
//		printString("在类内部掉调用方法,不加类名也可以!!!");

		/** 递归 */
//		recursionTest(0);
		
		/** 数组：数组也是一种数据类型（引用数据类型）,数组是相同数据类型元素的集合 */
		// 注意: 建议使用 dataType[] arrayRefVar 的声明风格声明数组变量。 
		//dataType arrayRefVar[] 风格是来自 C/C++ 语言 ，在Java中采用是为了让 C/C++ 程序员能够快速理解java语言。
		// 声明:
//		int[] arr = new int [10]; // 默认值 0
//		int[] arr = {1, 4, 5, 8};
//		int[] arr = new int[] {1, 2, 4, 5, 8}; // 初始化为:{1, 4, 5, 8}, 这种方法只能在声明的时候一同初始化, 声明之后不能再使用这种方法
//		for (int i = 0; i < arr.length; ++i) {
//			System.out.println("arr[" + i + "]=" + arr[i]);
//		}
//		System.out.println("arr len:" + arr.length);
//		System.out.println("arr:" + Arrays.toString(arr)); // 将 array 转换为字符串
//		int[] arr2 = new int[20];
//		System.arraycopy(arr, 0, arr2, 0, 4); // System.arraycopy(src, srcPos, dest, destPos, length);
//		System.out.println("arr2 len:" + arr2.length);
//		System.out.println(Arrays.toString(arr2));
//		int[] arr3 = new int[20];
//		int[] arr3 = Arrays.copyOf(arr,  4);
//		System.out.println("arr3 len:" + arr3.length);
//		System.out.println(Arrays.toString(arr3));

		// 数组扩容
//		arr = Arrays.copyOf(arr, arr.length + 20); // 扩容数组
//		System.out.println("arr len:" + arr.length);
//		System.out.println("arr:" + Arrays.toString(arr));

		// 数组排序
//		Arrays.sort(arr);
//		System.out.println("sorted arr:" + Arrays.toString(arr));
		
		// 数组作为参数以及返回值使用
//		int[] arr = {1, 2, 3, 4, 5};
//		int[] retArr;
//		retArr = arrParamTest(arr);
//		print(Arrays.toString(retArr));
		
		//NOTE:
		//引用传递也是一种值传递，并不会修改原来的引用的值，即 myArray 引用的值没有变化，还是和原来一样；
		//但是由于引用传递 传递的是引用数据在堆中的地址，因此可以通过 引用传递 修改引用数据类型在堆中的值，
		//但是引用传递并不能修改原来的引用的值。
//		int[] testArr = {1, 2 ,3 ,4, 5};
//		print(Arrays.toString(testArr));
//		changeItToNull(testArr);
//		print(Arrays.toString(testArr)); // 1, 2 ,3 ,4, 5
		
		// 多维数组
//		String s1[][] = new String[2][3]; // 2行, 3列的数组
//		s1[0][0] = "Hello";
//		print(Arrays.toString(s1));
//		String s2[][] = new String[2][]; // 分别为每一行分配空间
//		s2[0] = new String[2]; // 第1行 2 列
//		s2[1] = new String[4]; // 第2行 4 列
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
	
	// 方法
	//[修饰符列表]  返回值类型  方法名(形式参数列表){ 方法体；}
	// static:静态方法,可以直接通过类名调用的方法, 不需要实例化对象(这和 C++ 完全一样啊！！)
	public static int add(int a, int b) {
		return (a + b);
	}

	// 方法的重载
	// 在同一个类中, 方法名相同, 参数列表不同(数量不同/类型不同/顺序不同)
	// 方法重载和方法名+参数列表有关系，方法重载和返回值类型无关，和修饰符列表无关
	public static float add (float a, float b) {
		return (a + b);
	}

	public static int add(int a, int b, int c) {
		return (a + b + c);
	}

	public static void printString(String info) {
		System.out.println(info);
	}
	
	// 递归调用
	// 如果写错误会导致内存溢出/栈溢出
	public static void recursionTest(int cnt) {
		System.out.println("第" + cnt + "次调用");
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
	 * @fun 逻辑与/或的短路现象
	 * 
	 * @param[in] reference type
	 * @ret
	 * */
	public static void logicOpTest() {
		int a = 5;
		boolean b = (a < 4) && (a++<10); // a<4 为 false 时, 不再判断后面表达式是否为 true
		System.out.println("a=" + a + "  b=" + b);
	}
	
	/** 
	 * @fun 数组作为参数以及返回值
	 * 
	 * @param[in] 数组类型
	 * @ret 数组类型
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
	 * @fun 仅修改了形参,原来数组中的值没有被修改
	 * 
	 * @param[in] reference type
	 * @ret
	 * */
	public static void changeItToNull(int[] z) {
		z = null;
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
 * 原始类型：boolean，char，byte，short，int，long，float，double。
 * 包装类型：Boolean，Character，Byte，Short，Integer，Long，Float，Double。
 * Java 中的基本数据类型只有以上 8 个，除了基本类型（primitive type），剩下的都是引用类型（reference type）。
 * */
class PrimitiveTypeTest {
	public static void primitiveTypeTest() {
		System.out.println("primitive type test:");
        // byte  
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);  
        System.out.println("包装类：java.lang.Byte");  
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);  
        System.out.println("包装类：java.lang.Short");  
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);  
        System.out.println("包装类：java.lang.Integer");  
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);  
        System.out.println("包装类：java.lang.Long");  
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);  
        System.out.println("包装类：java.lang.Float");  
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);  
        System.out.println("包装类：java.lang.Double");  
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);  
        System.out.println("包装类：java.lang.Character");  
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台  
        System.out.println("最小值：Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台  
        System.out.println("最大值：Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
	}
}

//java.util.Arrays 类能方便地操作数组，它提供的所有方法都是静态的。
class ArraysTest {
	public static void arraysMethodTest() {
		int[] arr1 = {9, 1, 2, 3, 4, 5, 6, 7};
		int[] arr2 = new int[20];
		
		Arrays.fill(arr2, 999);
		print(Arrays.toString(arr2));
		
		// 如果两个数组包含相同数量的元素，并且两个数组中的所有相应元素对都是相等的，则认为这两个数组是相等的
		print("equals:" + Arrays.equals(arr1, arr2));
		
		Arrays.sort(arr1);
		print(Arrays.toString(arr1));
		
		// not defined
//		Arrays.sort(arr1, Collections.re);
		
		//数组在调用前必须排序好的。
		//用二分查找算法在给定数组中搜索给定值的对象(Byte,Int,double等)。
		//如果查找值包含在数组中，则返回搜索键的索引；否则返回 (-(插入点) - 1)。
		// If array is not sorted, the results are undefined.
		print("binarySearch index:" + Arrays.binarySearch(arr1, 5));
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

	/**
	* string to character array
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static char[] stringToCharArray(String str) {
		//TODO:
		//这里分配的不是堆内存吗? 
		//数组作为返回值返回为什么没有被释放???
		char[] charArr = str.toCharArray();
		print(Arrays.toString(charArr));
		return charArr;
	}
	
	/**
	* 冒泡排序
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static void bubbleSort(int[] arr) {
		print("in:" + Arrays.toString(arr));
		for (int i = 0; i < arr.length; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[i] > arr[j]) { // 交换
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				print("第" + i + "," + j + "次排序后:" + Arrays.toString(arr));
			}
			print("第" + i + "大轮循环排序后:" + Arrays.toString(arr));
		}
		print("result:" + Arrays.toString(arr));
	}
}

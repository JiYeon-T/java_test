package Class;

import java.util.Random; // 生成随机数

//在实际开发过程中，我们经常会遇到需要使用对象，而不是内置数据类型的情形。
//为了解决这个问题，Java 语言为每一个内置数据类型提供了对应的包装类。
//所有的包装类（Integer、Long、Byte、Double、Float、Short, Character, Boolean）都是抽象类 Number 的子类。
//Number 类属于 java.lang 包
// 这种由编译器特别支持的包装称为装箱，所以当内置数据类型被当作对象使用的时候，编译器会把内置类型装箱为包装类。

public class NumberTest {

	public static void main(String[] args) {
		//包装类
//		Integer x = 10;
//		x += 10;
//		System.out.println("x:" + x);

//		mathPackTest();
//		mathMethodTest();
		javaPackTest();
	}
	
	public static void mathPackTest() {
		//Java 的 Math 包含了用于执行基本数学运算的属性和方法，如初等指数、对数、平方根和三角函数。
		//Math 的方法都被定义为 static 形式，通过 Math 类可以在主函数中直接调用。
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));  
        System.out.println("0度的余弦值：" + Math.cos(0));  
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));  
        System.out.println("1的反正切值： " + Math.atan(1));  
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));  
        System.out.println(Math.PI);  
	}
	
	// math class 提供的一些数学计算方法:
	public static void mathMethodTest() {
		Integer i1 = 10;
		byte b1 = i1.byteValue(); // 返回 byte 原生数据类型
		print("i1:" + i1.byteValue() + "  b1:" + b1);
		print("double:" + i1.doubleValue() + "  long:" + i1.longValue());
		print("Compare result:" + i1.compareTo(0) + "  " + i1.compareTo(10) + "  " + i1.compareTo(15));
//		print("Compare result:" + i1.compareTo(0) + "  " + i1.compareTo((int)1.5) + "  " + i1.compareTo(15));
		
		print("equals:" + i1.equals(1) + "  " + i1.equals(i1));
		
		Integer x = Integer.valueOf(99);
		Double y = Double.valueOf(5);
		Float z = Float.valueOf(225);
		Integer u = Integer.valueOf("64", 16); // 16 进制的字符串 64 转换为int
		print("x=" + x + "  y=" + y + "  z=" + z + "  u=" + u);
		print("string:" + x.toString() + "  " + x.toString(x) + "  " + x.toString(x, 16)); // 转换为字符串
		
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
		
		//random() 方法用于返回一个随机数，随机数范围为 0.0 =< Math.random < 1.0。
		print("random:" + Math.random());
		generateRandomNumTest();
		print("get random:" + getRandom(1, 5));
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
	* 返回一个 min~max 区间的一个随机数
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static int getRandom(int min, int max) {
		Random rand = new Random();
		return (rand.nextInt(max - min + 1) + min);
	}
	
	/**
	* java中的自动装箱与拆箱:
	* 简单一点说，装箱就是自动将基本数据类型转换为包装器类型；拆箱就是自动将包装器类型转换为基本数据类型。
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static void javaPackTest() {
//        Integer i1 = 128;  // 装箱，相当于 Integer.valueOf(128);
//        int t = i1; //相当于 i1.intValue() 拆箱
//        System.out.println(t);

        /**
        对于–128到127（默认是127）之间的值,被装箱后，会被放在内存里进行重用
        但是如果超出了这个值,系统会重新new 一个对象
        */
		//（1）Java 会对 -128 ~ 127 的整数进行缓存，所以当定义两个变量初始化值位于 -128 ~ 127 之间时，两个变量使用了同一地址：
//        Integer i1 = 20; // equal address
//        Integer i2 = 20;
		//（2）当两个 Integer 变量的数值超出 -128 ~ 127 范围时, 变量使用了不同地址：
//        Integer i1 = 200; // uneqaul address
//        Integer i2 = 200;
        /**
        注意 == 与 equals的区别
        == 它比较的是对象的地址
        equals 比较的是对象的内容
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
        
        //1. int 是基本数据类型，int 变量存储的是数值。
        //Integer 是引用类型，实际是一个对象，Integer 存储的是引用对象的地址。
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        System.out.println("address i1==i2:" + (i1 == i2)); // 因为 new 生成的是两个对象，其内存地址不同。
        System.out.println("value i1==i2:" + (i1.equals(i2)));
        
        
        
	}
}

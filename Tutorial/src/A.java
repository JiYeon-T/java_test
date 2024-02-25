/**
* Copyright (C), 2006-2010, ChengDu Lovo info. Co., Ltd.
* FileName: Test.java
* 文件注释
*
* @author 类创建者姓名
* @Date    创建日期
* @version 1.00
*/

//package OOP;
/*
 * 编程规范:
 * 命名规范:
 * 1. 项目(project)名全部小写
 * 2. 包(package)名全部小写, 例如：com.runoob。
 * 3. 类(class)/interface名:大驼峰
 * 4. 变量名、方法名:小驼峰, 参数的名字和变量的命名规范一致
 * 5. 常量名全部大写
 * 
 * */

//package语句，该部分至多只有一句，必须放在源程序的第一句。
//import语句，该部分可以有若干import语句或者没有，必须放在所有的类定义之前。	
//public classDefinition，公共类定义部分，至多只有一个公共类的定义，Java语言规定该Java源程序的文件名必须与该公共类名完全一致。
//classDefinition，类定义部分，可以有0个或者多个类定义。
//interfaceDefinition，接口定义部分，可以有0个或者多个接口定义。
//例如:
/*把编译生成的所有．class文件放到包javawork.helloworld中*/
//package javawork.helloworld;
/*告诉编译器本程序中用到系统的AWT包*/
//import java awt.*;
/*告诉编译器本程序中用到用户自定义的包javawork.newcentury*/
//import javawork.newcentury;
/*公共类HelloWorldApp的定义，名字与文件名相同*/ 
// public class HelloWorldApp{...｝
//第一个普通类TheFirstClass的定义 
//class TheFirstClass｛...｝;
/*定义一个接口TheFirstInterface*/
//interface TheFirstInterface{......}


//package语句(C++ namespace)：
//由于Java编译器为每个类生成一个字节码文件，且文件名与类名相同因此同名的类有可能发生冲突。
//为了解决这一问题，Java提供包来管理类名空间，包实 提供了一种命名机制和可见性限制机制。

// 源文件声明规则:
//一个源文件中只能有一个 public 类(java因强制要求类名（唯一的public类）和文件名统一，因此在引用其它类时无需显式声明。在编译时，编译器会根据类名去寻找同名文件。) 只能有一个 public 类是为了给类装载器提供方便
//一个源文件可以有多个非 public 类( 当然一个编译单元内也可以没有 public 类。)
//源文件的名称应该和 public 类的类名保持一致。例如：源文件中 public 类的类名是 Employee，那么源文件应该命名为Employee.java。
//如果一个类定义在某个包中，那么 package 语句应该在源文件的首行。
//如果源文件包含 import 语句，那么应该放在 package 语句和类定义之间。如果没有 package 语句，那么 import 语句应该在源文件中最前面
//import 语句和 package 语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。
//类有若干种访问级别，并且类也分不同的类型：抽象类和 final 类等。这些将在访问控制章节介绍。
//除了上面提到的几种类型，Java 还有一些特殊的类，如：内部类、匿名类。

//在 Java 中，如果给出一个完整的限定名，包括包名、类名，那么 Java 编译器就可以很容易地定位到源代码或者类。
//import 语句就是用来提供一个合理的路径，使得编译器可以找到某个类。

// 命令编译器载入 java_installation/java/io 路径下的所有类
import java.io.*;


public class A {
	/**
	* 构造方法的详细使用说明
	*
	* @param 参数1 参数1的使用说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	
	
	/** 属性注释:提示信息 */
	String name;
	int id;
	double account;
	
	// 处注意，main 是一个程序的入口，一个 java 程序运行必须而且有且仅有一个 main 方法
//	public static void main(String[] args) {
//		System.out.println("args:" + args);
//		printHello();
//	}

	// 可变参数形式的 main() 函数
// 访问修饰符 关键字 返回类型 函数名 参数
//	像其他语言一样，Java可以使用修饰符来修饰类中方法和属性。主要有两类修饰符：
//	访问控制修饰符 : default, public , protected, private
//	非访问控制修饰符 : final, abstract, static, synchronized
	public static void main(String... args) {
		A a = new A();
		System.out.println("args:" + args);
//		printHello();
//		a.varTypeTest(3);
		a.paramTransTest();
	}
	//定义几个方法
	/**
	* 方法注释
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static double getSum(double a, double b) {
		return a + b;
	}
	
	public static void printSome(String str) {
		System.out.println( "message: " + str );
	}
	
	public static void printHello() {
		System.out.println("Hello, world.");
	}
	
	// 定义枚举类型
	// 枚举可以单独声明或者声明在类里面。方法、变量、构造函数也可以在枚举中定义
	enum AlphSize {SMALL, MIDDLE, LARGE}
	AlphSize alphSize;
	// TODO:
//	AlphSize alphSize = A.AlphSize.SMALL;
	
//	public static void printAlphSize() {
//		System.out.println("alphebetic size" + alphSize);
//	}
	
	/** 变量类型 */
	// 局部变量, 实例变量(成员变量), 静态变量(类变量)
	// NOTE:
	// 不能在静态方法中调用非静态成员, 因为静态成员编译的时候还没有实例对象, 无法获取该对象的成员
	// 静态变量由于多个对象只有一个静态变量, 需要考虑线程安全问题
	// 静态变量通常用于以下场景：
	//a.存储全局状态或配置信息
	//b.计数器或统计信息
	//c.缓存数据或共享资源
	//d.工具类的常量或方法
	//e.单例模式中的实例变量
	public int objVar1 = 1;
	public static int classVar1 = 2;
	public void varTypeTest(int localVar1) {
		System.out.println("objVar1: " + objVar1 + "  classVar1:" + classVar1 + "  localVar1:" + localVar1);
	}
	
	/** 参数传递 */
	// 值传递:Java 中的基本数据类型都采用值传递方式传递参数变量的值
	// 引用传递:	Java 中的数组、对象类型采用引用传递方式传递参数变量的值
	public void paramTransTest() {
		int a = 1, b = 2;
		System.out.println("a:" + a + "  b:" + b);
		swap(a, b);
		System.out.println("a:" + a + "  b:" + b);

		IntNum a2 = new IntNum(a), b2 = new IntNum(b);
		System.out.println("a2:" + a2.val + "  b2:" + b2.val);
		swapIntNum(a2, b2);
		System.out.println("a2:" + a2.val + "  b2:" + b2.val);
	}
	
	/**
	* 方法注释:错误的交换两个数的写法
	*
	* @param a 值传递
	* @param b 值传递
	* @return None
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	// 一个整数类, 用于对象作为参数传递测试
	class IntNum {
		int val;
		// 构造函数
		public IntNum(int val) {
			this.val = val;
		}
	}

	/**
	* 交换两个 IntNum 类型对象
	* TODO:
	* 为什么这里传递的不是引用呢?
	*
	* @param a 引用传递
	* @param b 引用传递
	* @return None
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public void swapIntNum(IntNum a, IntNum b) {
		IntNum temp = new IntNum(a.val);
		a = b;
		b = temp;
	}
	
	/** Java 修饰符:访问修饰符 + 非访问修饰符 */
	// 访问控制修饰符,Java中，可以使用访问控制符来保护对类、变量、方法和构造方法的访问。Java 支持 4 种不同的访问权限。
	//default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
	//private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类
	//public : 对所有类可见。使用对象：类、接口、变量、方法
	//protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
	
	//protected 需要从以下两个点来分析说明：
	//子类与基类在同一包中：被声明为 protected 的变量、方法和构造器能被同一个包中的任何其他类访问；
	//子类与基类不在同一包中：那么在子类中，子类实例可以访问其从基类继承而来的 protected 方法，而不能访问基类实例的protected方法。
	// 其实对于protected的理解通俗点讲就是，这个方法，只有你跟我在一起（同一个包）的时候才给你用，你不跟我在一起我就不给你用了。

	//非访问修饰符:
	//static：静态变量/静态方法
	//final:常量, final 修饰符通常和 static 修饰符一起使用来创建类常量
	//父类中的 final 方法可以被子类继承，但是不能被子类重写。声明 final 方法的主要目的是防止该方法的内容被修改。
	//final 类不能被继承，没有类能够继承 final 类的任何特性。
	class FinalTest{
		final int FINAL_TEST_VAL = 1;
		
		public FinalTest() {
			
		}
		
		public final void cannotModifyFun() {
			// 可以被子类继承, 但不可以被子类重写
		}
	}
	
	// abstract:
	//抽象类:
	//抽象类不能用来实例化对象，声明抽象类的唯一目的是为了将来对该类进行扩充。
	//一个类不能同时被 abstract 和 final 修饰。如果一个类包含抽象方法，那么该类一定要声明为抽象类，否则将出现编译错误。
	//抽象类可以包含抽象方法和非抽象方法。
	// 抽象方法：
	//抽象方法是一种没有任何实现的方法，该方法的具体实现由子类提供。
	//抽象方法不能被声明成 final 和 static。
	//任何继承抽象类的子类必须实现父类的所有抽象方法，除非该子类也是抽象类。
	//如果一个类包含若干个抽象方法，那么该类必须声明为抽象类。抽象类可以不包含抽象方法。
	abstract class AbstractClassTest{
	   private double price;
	   private String model;
	   private String year;
	   public abstract void goFast(); //抽象方法
	   public abstract void changeColor();
//	   public void printClassInfo();
	}
	
	//synchronized 修饰符
	//synchronized 关键字声明的方法同一时间只能被一个线程访问。synchronized 修饰符可以应用于四个访问修饰符。
	// 主要用于需要保证线程安全的函数???
	
	//transient 修饰符
	//序列化的对象包含被 transient 修饰的实例变量时，java 虚拟机(JVM)跳过该特定的变量。
	//该修饰符包含在定义变量的语句中，用来预处理类和变量的数据类型。
	//当对象被序列化时（写入字节序列到目标文件）时，transient阻止实例中那些用此关键字声明的变量持久化；
	//当对象被反序列化时（从源文件读取字节序列进行重构），这样的实例变量值不会被持久化和恢复。
	public transient int limit = 55;   // 不会持久化
	public int not_limit; // 持久化
	
	//volatile 修饰符
	//volatile 修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。
	// 而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。
	//这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。
	//一个 volatile 对象引用可能是 null。
	//例如:
	public volatile boolean active = false;
	//通常情况下，在一个线程调用 run() 方法（在 Runnable 开启的线程），在另一个线程调用 stop() 方法。 
	//如果 第一行 中缓冲区的 active 值被使用，那么在 第二行 的 active 值为 false 时循环不会停止。
	//但是以上代码中我们使用了 volatile 修饰 active，所以该循环会停止。
	public void run() {
		active = true;
		while (active) {
			
		}
	}
	
	public void stop() {
		active = false;
	}
	
	
}

class B {
	public static void test() {
	}
}




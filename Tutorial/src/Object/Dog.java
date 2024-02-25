/**
* Copyright (C), 2006-2010, ChengDu Lovo info. Co., Ltd.
* FileName: Test.java
* 文件注释
*
* @author 类创建者姓名
* @Date    创建日期
* @version 1.00
*/

package Object;

/**
 * 成员变量与类变量(static)的区别:
 * 1、两个变量的生命周期不同:
 * 成员变量随着对象的创建而存在，随着对象的回收而释放。
 * 静态变量随着类的加载而存在，随着类的消失而消失。
 * 2、调用方式不同
 * 成员变量只能被对象调用 d.size。
 * 静态变量可以被对象调用 d.hasName，还可以被类名调用 Dog.hasName。 
 * 4、数据存储位置不同
 * 成员变量存储在堆内存的对象中，所以也叫对象的特有数据。
 * 静态变量数据存储在方法区（共享数据区）的静态区，所以也叫对象的共享数据。
 * 
 * static 关键字，是一个修饰符，用于修饰成员(成员变量和成员函数)。特点：
 * 1、想要实现对象中的共性数据的对象共享。可以将这个数据进行静态修饰。
 * 2、被静态修饰的成员，可以直接被类名所调用。也就是说，静态的成员多了一种调用方式。类名.静态方式。
 * 3、静态随着类的加载而加载。而且优先于对象存在。 
 * 弊端:
 * 1、有些数据是对象特有的数据，是不可以被静态修饰的。
 * 因为那样的话，特有数据会变成对象的共享数据。这样对事物的描述就出了问题。所以，在定义静态时，必须要明确，这个数据是否是被对象所共享的。
 * 2、静态方法只能访问静态成员，不可以访问非静态成员。
 * 因为静态方法加载时，优先于对象存在，所以没有办法访问对象中的成员(对象变量)。
 * 3、静态方法中不能使用this，super关键字。
 * 因为this代表对象，而静态加载时，有可能没有对象，所以this无法使用。
 * 
 * */

/**
 * new关键字的作用:
 * 1、为对象分配内存空间。
 * 2、引起对象构造方法的调用。
 * 3、为对象返回一个引用。
 * */

public class Dog {
	/** 类变量, 不需要实例化对象也可以访问 */
	static boolean hasName;
	/** 成员变量, 必须要实例化对象才可以访问 */
	int size;
	String color;
	int age;
	String name;
	
	public static void main(String[] args) {
//		eat();
//		run(); // ERROR
//		setAge(); // ERROR
	}
	
	/**
	* 每个类都有构造方法。如果没有显式地为类定义构造方法，Java 编译器将会为该类提供一个默认构造方法。
	* 在创建一个对象的时候，至少要调用一个构造方法。
	* 构造方法的名称必须与类同名，一个类可以有多个构造方法(构造函数也可以重载)。
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public Dog() {	
	}
	
	/** 3.在一个类中，局部变量可以与成员变量同名，但是局部变量优先,如果非要访问成员变量的属性，则必须使用 this.color 
	 * this 代表当前这个对象，也就是当前谁调用这个方法则这个对象就是谁
	 * 1.( this 指向对象本身的指针，形参与成员名字重名，用 this 来区分。)
	 * 2. super 超（父）类对象的一个指针
	 * 对象与引用的区别:
	 * 对象是具体的一个实例，如：new Student(); new 表示创建一个对象，并在堆内存中开辟一块空间。
	 * 引用名称是存放的对象的地址。
	 * */
	public Dog(String name) {
		System.out.println("dog:" + name + " constructor");
		this.name = name; // this 指针?
	}
	
	public Dog(int size, String color, int age) {
		this.size = size;
		this.color = color;
		this.age = age;
	}
	
	/**
	* 方法注释:Getter 方法
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public void setAge(int iAge) {
		
	}

	/**
	* 方法注释:Getter 方法
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public int getAge() {
		return age;
	}

	/**
	* 方法注释:Getter 方法, 获取类变量
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public boolean getHasName() {
		/**编译报错:The static field Dog.breed should be accessed int a static way*/
		// return this.breed;
		System.out.println(this.name + " get has name:" + hasName);
		return hasName;
	}

	/**
	* 方法注释:Setter 方法, 设置类变量
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public void setHasName(boolean dogHasName) {
		hasName = dogHasName;
		System.out.println(this.name + " set has name:" + hasName);
	}

	/**
	* 方法注释
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static void eat() {
		// 静态方法只能访问静态成员，不可以访问非静态成员。
		// 因为静态方法加载时，优先于对象存在，所以没有办法访问对象中的成员。
		/** 编译报错:Can not use this in a static method */
		// System.out.println("eat" + this.name);
		System.out.println("eat");
	}
	
	void run() {
		System.out.println("run");
	}
	
	void sleep() {
		System.out.println("sleep");
	}
	
	void name() {
		System.out.println("name");
	}
	
	/**
	* 方法注释
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public void printDogInfo() {
		System.out.println("name:" + this.name);
		System.out.println("age:" + this.age);
		System.out.println("color:" + this.color);
		System.out.println("size:" + this.size);
		System.out.println();
	}
}


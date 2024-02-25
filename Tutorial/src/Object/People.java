package Object;

/**
 * 1.( this 指向对象本身的指针，形参与成员名字重名，用 this 来区分。)
 * 2. super 超（父）类对象的一个指针
 */

public class People {
	public static void prt(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		System.out.println("People class test");
	}

	public People() {
		prt("People 无参构造函数");
	}
	
	public People(String name) {
		prt("People 一参数构造函数, name:" + name);
	}
}


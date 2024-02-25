package Demo;

//在 Java 中，类的继承是单一继承，也就是说，一个子类只能拥有一个父类，所以 extends 只能继承一个类。
//使用 implements 关键字可以变相的使java具有多继承的特性，使用范围为类继承接口的情况，
//可以同时继承多个接口（接口跟接口之间采用逗号分隔）。
public class Penguin extends Animal {
	//constructor
	public Penguin(String name, int id) {
		//调用父类的构造函数
		super(name, id);
	}
}

//
package Reflect;



public class ClassJava {
	public static void main(String[] args) {
		Demo d = new Demo();
		//1.创建Class对象的三种方法
		Class c1 = Demo.class;
		Class c2 = d.getClass();
		Class c3 = null;
		c3 = Class.forName("Reflect.demo");
	}
}
//2. Class类
//a.任何一个类都是Class类的子类;
//b.任何一个类都有一个隐含的静态的成员变量Class; b.getClass()方法;
//c.Class.forName("类的全名");不仅表示了类的类型，还表示了动态加载类;
//d.编译的时候加载的类都是静态加载类；运行时加载的类都是动态加载类;
class Demo{
	
}


//3.方法，成员变量，构造函数的反射
//java方法反射
//方法的名称 和 方法的参数才能唯一的确定一个han'shu
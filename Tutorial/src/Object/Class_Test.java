package Object;

public class Class_Test {
	//可以使用super()关键字在子类中调用父类中被重写的方法

	//无法以返回值类型作为重载函数的区分标准
	//但是重载函数的返回值可以相同，也可以不同没有影响
	public int getMax(int a, int b) {
		return a > b ? a : b;
	}
	public double getMax(double a, double b) {
		return a > b ? a : b;
	}
	
	//overriding / overloading
	//方法重写:描述的是父类与子类之间的多态，方法的参数，返回值都相同;
	//方法重载描述的是一个类的多态，参数列表必须不同，返回值可以相同或者不同;
	
	//多态存在的三个必要条件
	//a.继承
	//b.重写
	//c.父类引用指向子类对象：Parent p = new Child();
	
	
	//
	
	
}

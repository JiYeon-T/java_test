package inherit;
//import inhert.Animal;

//Java中一个类只能有一个基类
public class Dog extends Animal {
	//super();
	
	public Dog() {}
	
	//java中怎么调用父类的带参构造呢?
//	public Dog(String name, String food, String fork) {
//		Animal(name, food, fork);
//	}
	
	//super
	//使用super调用父类的方法以及属性
	public void eat_food() {
		super.eat();		//super调用父类的方法
	}
	
	//重写eat()方法
	public void eat() {
		System.out.println("Wang Wang is eat.");
	}
}

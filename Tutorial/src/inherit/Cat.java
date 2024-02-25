package inherit;

public class Cat extends Animal {
	
	
	
	//重写
	//当这个类不想使用父类的方法时，可以对父类的方法进行重写
	//调用时，优先调用子类的方法
	public void eat() {
		System.out.println("I want to eat vegetable. not  meat.");
	}
}

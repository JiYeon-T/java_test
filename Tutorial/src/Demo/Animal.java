package Demo;

//父类
//如果没有使用extends指明继承的父类，则默认继承java.lang.Object类，
//java.lang这个包不需要import

public class Animal {
	private String name;
	private int id;
	
	//constructor
	public Animal(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	//functions
	void eat() {
		System.out.println(name + " is eating...");
	}
	
	void showInfo() {
		System.out.println(name + "'s information:");
		System.out.println("name:" + name);
		System.out.println("ID:" + id);
	}
	
	//测试
	public static void main(String[] args) {
		Animal cat = new Animal("mimi", 1);
		cat.eat();
		cat.showInfo();
	}
}

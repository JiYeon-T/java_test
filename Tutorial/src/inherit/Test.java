package inherit;
//import inhert.Dog;

public class Test {
	
	public static void main(String[] args) {
		//继承
//		Dog d = new Dog();
//		d.name = "WangWang";
//		d.food = "meat";
//		d.eat();
//		d.move();
//		d.eat_food();
//		
//		Cat mimi = new Cat();
//		mimi.eat();
		
		//多态
		Animal obj1 = new Animal();
		obj1.eat();
		//使用子类的对象指向父类的引用
		Animal obj2 = new Dog();	
		obj2.eat();
	}
}

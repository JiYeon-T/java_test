package inherit;
//import inhert.Dog;

public class Test {
	
	public static void main(String[] args) {
		//�̳�
//		Dog d = new Dog();
//		d.name = "WangWang";
//		d.food = "meat";
//		d.eat();
//		d.move();
//		d.eat_food();
//		
//		Cat mimi = new Cat();
//		mimi.eat();
		
		//��̬
		Animal obj1 = new Animal();
		obj1.eat();
		//ʹ������Ķ���ָ���������
		Animal obj2 = new Dog();	
		obj2.eat();
	}
}

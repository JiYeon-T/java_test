package inherit;
//import inhert.Animal;

//Java��һ����ֻ����һ������
public class Dog extends Animal {
	//super();
	
	public Dog() {}
	
	//java����ô���ø���Ĵ��ι�����?
//	public Dog(String name, String food, String fork) {
//		Animal(name, food, fork);
//	}
	
	//super
	//ʹ��super���ø���ķ����Լ�����
	public void eat_food() {
		super.eat();		//super���ø���ķ���
	}
	
	//��дeat()����
	public void eat() {
		System.out.println("Wang Wang is eat.");
	}
}

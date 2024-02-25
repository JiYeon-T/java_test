package Demo;

//通过接口，implements关键字即可以实现类没有的多继承的功能
public class Ant implements A, B {
	
	//继承接口的类必须实现接口中声名的方法
	public void showInfo() {
		System.out.println("This is interface A's function showInfo()");
	}
	
	public void eat() {
		System.out.println("This is interface A's function eat()");
	}
	
	
	//
	public static void main(String[] args) {
		Ant a = new Ant();
		a.showInfo();
		a.eat();
	}
}

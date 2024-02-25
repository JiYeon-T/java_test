package Demo;

//����
//���û��ʹ��extendsָ���̳еĸ��࣬��Ĭ�ϼ̳�java.lang.Object�࣬
//java.lang���������Ҫimport

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
	
	//����
	public static void main(String[] args) {
		Animal cat = new Animal("mimi", 1);
		cat.eat();
		cat.showInfo();
	}
}

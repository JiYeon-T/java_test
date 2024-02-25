
package Demo;

public abstract class AbstractClass {
	//如果一个类包含若干个抽象方法，那么该类必须声明为抽象类。抽象类可以不包含抽象方法。
	//抽象类可以包含抽象方法和非抽象方法。
	private String name;
	private int ID;
	
	//使用Eclipse自动生成的 getter  和 setter 方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public abstract void showInfo();
	public abstract void eat();
}

//继承抽象类的类
class SubClass extends AbstractClass{
	//必须实现抽象类中定义的方法
	public void showInfo() {
		;
	}
	public void eat() {
		;
	}
}


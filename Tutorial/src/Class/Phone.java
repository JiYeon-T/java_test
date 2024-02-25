package Class;

//定义一个类
public class Phone {
	public float getCpu() {
		return cpu;
	}
	public void setCpu(float cpu) {
		this.cpu = cpu;
	}
	public float getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(float screenSize) {
		this.screenSize = screenSize;
	}
	@Override
	public String toString() {
		return "Phone [cpu=" + cpu + ", screenSize=" + screenSize + ", name=" + name + ", ID=" + ID + ", getCpu()="
				+ getCpu() + ", getScreenSize()=" + getScreenSize() + ", getName()=" + getName() + ", getID()="
				+ getID() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public float getName() {
		return name;
	}
	public void setName(float name) {
		this.name = name;
	}
	//定义phone类的构造函数
	//构造函数与类同名，没有返回值，可以带参，也可以不带	
	public Phone(){
		System.out.println("Phone's constructor was called.");
	}
	//带参构造
	public Phone(float cpu_, float size_, float name_){
		System.out.println("Phone's parameter constructor was called.");
		cpu = cpu_;
		screenSize = size_;
		name = name_;
		System.out.println("cpu:" + cpu + "\nscreen_size:" + screenSize + "\nname:" + name);
	}
	
	//定义属性
	public float cpu;
	float screenSize;
	float name;
	
	//私有成员
	private int ID;
	
	//私有成员需要定义getter/setter
	public void setID(int val) {
		ID = val;
	}
	public int getID() {
		return ID;
	}
	
	
	//定义方法
	void call() {
		System.out.println("Call someone.");
	}
	void sendMessage() {
		System.out.println("send message to someone.");
	}
}


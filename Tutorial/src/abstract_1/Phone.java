package abstract_1;

//抽象类
public abstract class Phone {
	public float price;
	public int ID;
	
	//抽象类的方法，只关心需要有哪些方法，而不关心如何实现
	//具体由子类自己实现
	public abstract void call();
	public abstract void sendMessage();
}

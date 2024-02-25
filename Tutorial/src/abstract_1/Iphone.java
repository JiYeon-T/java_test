package abstract_1;

public class Iphone extends Phone {

	//继承抽象类，必须实现的方法
	public void call() {
		System.out.println("使用按键来打电话");
	}

	public void sendMessage() {
		System.out.println("使用按键来发信息");
	}
}

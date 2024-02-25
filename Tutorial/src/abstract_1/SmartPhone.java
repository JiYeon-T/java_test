package abstract_1;

//为某一个类实现一个接口
public class SmartPhone extends Phone implements CanPlayGame {
	//实现抽象类的方法
	public void call() {
		System.out.println("使用触摸屏来打电话");
	}
	public void sendMessage() {
		System.out.println("使用触摸屏来发信息");
	}
	
	//实现接口的方法
	public void playGame() {
		System.out.println("可以用来打游戏的接口.");
	}
	
}

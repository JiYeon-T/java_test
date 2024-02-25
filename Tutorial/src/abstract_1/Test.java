package abstract_1;

public class Test {
	public static void main( String[] args ) {
		Phone p1 = new Iphone();
		p1.call();
		
		Phone p2 = new SmartPhone();
		p2.call();
		
		SmartPhone p3 = new SmartPhone();
		p3.playGame();
		
		PSP p4 = new PSP();
		p4.playGame();	
		
		//通过接口可以描述两个类之间的共同特性
		//两个类都有的东西
		CanPlayGame p5 = new PSP();
		p5.playGame();
		CanPlayGame p6 = new SmartPhone();
		p6.playGame();
		
	}
}

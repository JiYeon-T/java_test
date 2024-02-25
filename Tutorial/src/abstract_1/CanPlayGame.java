
package abstract_1;

//实现一个接口
//系统会为接口自动添加abstract关键字
//public abstract interface CanPlayGame {
//	public abstract void playGame();
//}


//通过接口可以描述两个类之间的共同特性
//两个类都有的东西
public interface CanPlayGame {
	//只声明就可以，不用自己来实现
	//让类自己去实现这个接口
	public void playGame();
}

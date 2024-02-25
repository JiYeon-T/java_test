package Demo;

public class MultiThread {
	//为了实现一些其他的功能，Java 也提供了许多非访问修饰符。
	//synchronized 和 volatile 修饰符，主要用于线程的编程。
	
	//synchronized
	//synchronized 关键字声明的方法同一时间只能被一个线程访问。
	//synchronized 修饰符可以应用于四个访问修饰符。
	public synchronized void getMutex() {
		
	}
	
	//transient
	//序列化的对象包含被 transient 修饰的实例变量时，java 虚拟机(JVM)跳过该特定的变量。
	//该修饰符包含在定义变量的语句中，用来预处理类和变量的数据类型。
	public transient int a = 1;
	public int b = 2;
	
	//volatile
	//volatile 修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。
	//而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。
	public volatile boolean flag = false;
	public void run() {
		flag = true;
		while(flag) {
			//
		}
	}
	public void stop() {
		flag = false;
	}
	//通常情况下，在一个线程调用 run() 方法（在 Runnable 开启的线程），在另一个线程调用 stop() 方法。 
	//如果 第一行 中缓冲区的 active 值被使用，那么在 第二行 的 active 值为 false 时循环不会停止。
	//但是以上代码中我们使用了 volatile 修饰 active，所以该循环会停止。
	
}

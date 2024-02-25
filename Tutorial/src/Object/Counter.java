
package Object;

/** 静态变量测试 */
//使用静态变量：存储全局状态或配置信息

// 一个计数器类, 统计当前初始化了多少个该类的对象
// 可以用于实现单例模式
public class Counter {
	private static int count = 0;

	public Counter() {
		++count;
	}

	public static int getCount() {
		return count;
	}

	public static void main(String[] args) {
		System.out.println("count:" + Counter.count);
		Counter c1 = new Counter();
		System.out.println("count:" + Counter.count);
		Counter c2 = new Counter();
		System.out.println("count:" + Counter.count);
		Counter c3 = new Counter();
		System.out.println("count:" + Counter.count);
	}
}
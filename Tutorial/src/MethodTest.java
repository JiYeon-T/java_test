
public class MethodTest {

	// 无参构造函数 -> 默认构造函数失效
	public MethodTest() {
		
	}
	
	public static void main(String[] args) {
		print("Hello");
//		MethodTest m1 = new MethodTest();
//		m1.add(1, 2);
		
//		double[] arr = {1, 2, 3, 4, 5};
//		printMax(arr);
//		void function(String... args);
//		void function(String args1,String args2);
//		function("Wallen","John");
//		优先匹配固定参数的方法。

//		finalizeTest();
		
		//参数绑定:值传递与引用传递
		//值传递:基本类型参数的传递，是调用方值的复制，双方各自的后续修改，互不影响。
		//基本类型变量：“持有某个数值”，变量名指向具体的数值。
		
		//引用传递:双方任意一方对这个对象(数组)的修改，都会影响对方（因为指向同一个对象）
		//引用类型参数的传递，调用方的变量，和接收方的参数变量，指向的是同一个数组地址(内存地址)。
		//双方任意一方对这个对象(数组)的修改，都会影响对方（因为指向同一个对象）
		//引用类型变量：变量名指向某个对象的内存地址。
	}
	

	/**
	* 方法重载
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static int add(int a, int b) {
		return (a + b);
	}

	public static double add(double a, double b) {
		return (a + b);
	}
	
	/**
	* 换行打印字符串, System.out.println 缩写
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static void print(String str) {
		System.out.println(str);
	}
	
	/**
	* 可变参数
	* JDK 1.5 开始，Java支持传递同类型的可变参数给一个方法。
	* 一个方法中只能指定一个可变参数，它必须是方法的最后一个参数。任何普通的参数必须在它之前声明。
	* 对于可变参数，编译器会将其转型为一个数组，故在函数内部，可变参数名即可看作数组名。
	* 一个函数至多只能有一个可变参数，且可变参数为最后一个参数。
	* 对于可变参数，编译器会将其转型为一个数组，故在函数内部，可变参数名即可看作数组名。
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static void printMax(double... params) {
		//对于可变参数，编译器会将其转型为一个数组，故在函数内部，可变参数名即可看作数组名。
		if (params.length == 0) {
			print("parameter len:0");
			return;
		}
		double result = params[0];
		for (int i = 1; i < params.length; ++i) {
			if (params[i] > result) {
				result = params[i];
			}
		}
		print("result:" + result);
		
		return;
	}
	

	/**
	* Java 允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用，这个方法叫做 finalize( )，它用来清除回收对象。
	* 例如，你可以使用 finalize() 来确保一个对象打开的文件被关闭了。
	* 在 finalize() 方法里，你必须指定在对象销毁时候要执行的操作。
	* 不就是析构函数么? destructor
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static void finalizeTest() {
		Cake c1 = new Cake(1);
		Cake c2 = new Cake(2);
		c1 = c2 = null;
		
		System.gc(); //调用Java垃圾收集器
	}
}

// finalize test class
class Cake extends Object {
	private long id;
	public Cake(long id) {
		this.id = id;
		System.out.println("Cake" + id + " was created");
	}
	
	protected void finalize() throws java.lang.Throwable {
		super.finalize();
		System.out.println("Cake" + id + " was delete");
		// 关闭已打开文件之类的操作
	}
}

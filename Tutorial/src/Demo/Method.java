package Demo;

public class Method {
	//java会为每一个类自动初始化一个默认构造函数，修饰符(public, private, protected)与类的修饰符相同
	//一旦你定义了自己的构造方法，默认构造方法就会失效。
	String name;
	public Method() {
		name = "This is a Method class object.";
	}
	//讲解方法的使用
	//main 方法是被 JVM 调用的，除此之外，main 方法和其它方法没什么区别。
	
	//main方法
	//命令行参数在程序运行的时候紧跟在程序名字后面
	public static void main(String[] args) {
		//
	}
	
	
	//java的方法同样支持重载
	//
	public static int getMax(int a, int b) {
		return a > b ? a : b;
	}
	
	public static float getMax(float a, float b) {
		return a > b ? a : b;
	}
}

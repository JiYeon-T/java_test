package inner_class;

public class HelloWorldAnnoymousClass {
	/*
	 * @fun:包含两方法的helloworld接口
	 */
	interface HelloWorld{
		public void greet();
		public void greetSomeone(String name);
	}
	
	//定义类的成员函数
	public void sayHello() {
		//1.局部类EnglishGreeting实现了HelloWorld接口
		class EnglishGreeting implements HelloWorld{
			String name = "World";	//类的成员
			//interface's function1
			public void greet() {
				greetSomeone("world");
			}
			
			//interface's function2
			public void greetSomeone(String peopleName) {
				name = peopleName;
				System.out.println("Hello, " + name);
			}
		}
		
		//实例化内部类类成员
		EnglishGreeting englishGreeting = new EnglishGreeting();
		
		//2.匿名类实现HelloWorld接口
		//匿名实现的接口是一个表达式，因此结束需要加分号
		//匿名类在定义的时候就已经实例化了
		HelloWorld frenchGreeting = new HelloWorld() {
			String name = "tout le monde";
			//interface's function1
			public void greet() {
				greetSomeone(name);
			}
			
			//interface's function2
			public void greetSomeone(String peopleName) {
				name = peopleName;
				System.out.println("Salute, " + name);
			}
		};
		
		//直接使用内部类和匿名类调用方法
		englishGreeting.greet();
		frenchGreeting.greetSomeone("Bob");
	}
	
	//测试
	public static void main( String... args ) {
		HelloWorldAnnoymousClass hello = new HelloWorldAnnoymousClass();
		hello.sayHello();
		
	}
	//该例中用局部类来初始化变量englishGreeting，用匿类来初始化变量frenchGreeting和spanishGreeting，两种实现之间有明显的区别：
	//1）局部类EnglishGreetin继承HelloWorld接口，有自己的类名，定义完成之后需要再用new关键字实例化才可以使用；
	//2）frenchGreeting、spanishGreeting在定义的时候就实例化了，定义完了就可以直接使用；
	//3）匿名类是一个表达式，因此在定义的最后用分号";"结束。
}

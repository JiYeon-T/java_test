package inner_class;

//内部类的实现:
//将一个类的定义放在另一个类的定义内部，这就是内部类。
//如同一个人是由大脑、肢体、器官等身体结果组成，而内部类相当于其中的某个器官之一.
//例如心脏：它也有自己的属性和行为（血液、跳动), 但是其他身体之外的成员无法直接访问心脏, 使用某些特殊手段才可以访问心脏信息, 例如:听诊器
//内部类的作用：
//(1) 提供了更好的封装，将内部类隐藏在外部类之中，防止包中的其他类访问内部类中的成员；
//(2) 内部类的方法可以直接访问外部类的所有成员(包括私有成员);
//(3) 内部类实现的功能使用外部类同样可以实现，只是有时候使用内部类更为方便;


public class Animal {
	
	/** 外部类的公有成员 */
	private String name = "outer-class";
	/** 外部类的私有成员 */
	public int num = 1;
	/** 外部类的类变量 */
	public static String catagory = "Cat";
	
	//(1)成员内部类
	public class Inner {
		String name = "Inner-class";
		//内部类的方法
		//1.内部类可以直接访问外部类的成员(包括私有成员)
		public void show_info() {
			System.out.println("outer name:" + Animal.this.name);
			System.out.println("outer num:" + new Animal().num + 1);	//默认转换成字符串格式
		}
	}
	
	//(2)静态内部类
	//a.静态内部类不能直接访问外部类的非静态成员，要通过:new 外部类().成员 的方法访问
	//b.如果外部类的成员和内部类的成员相同，可通过: 外部类.成员的方法访问外部类的成员；
	//如果外部类名称不相同，则可以直接通过成员名访问
	//c.创建静态内部类对象时，不需要外部类对象，可以直接使用:内部类 对象名 = new 内部类() 的方法创建；
	public static class Age {
		public int year = 1;
		public int month = 1;
		public int day = 1;
		
		//方法
		void show_info() {
			System.out.println("year-month-day:" + this.year + "-" + this.month + "-" + this.day);
		}
		
		public void show_outer_info() {
			System.out.println("name:" + new Animal().name);	//name是外部类的非静态成成
			System.out.println("num = " + Animal.catagory);
		}
	}
	
	//(3)方法内部类
	//方法内部类只能在类的方法内部定义和使用
	//不能使用public, private, static修饰符修饰
	public void show_something() {
		//方法内部类
		class Show {
			public String name;
			int score = 1;
			public Show() {
				
			}
			public Show(String name) {
				this.name = name;
			}
			public int getScore() {
				return score + 100; 
			}
		};
		Show s = new Show();
		System.out.println("score:" + s.getScore());
	}
	
	//(4)匿名内部类
	//匿名内部类没有类名，作用是使得代码更加简洁
	//如果某一个类只需要使用一次，则可以定义成匿名内部类
	//匿名内部类的作用域与局部变量相同;
	//a.匿名内部类可以访问外部类中的所有成员;
	//b.匿名内部类不可以访问外部类中未加final修饰的变量;
	//c.属性屏蔽，与内嵌类相同，匿名内部类中定义的变量，成员函数等，会屏蔽掉其作用域内的其它同名...;
	//d.匿名内部类中不能定义静态属性，方法;
	//e.匿名内部类中可以有常量属性(final修饰);
	//f.匿名内部类中可以定义属性;
	//g.匿名内部类中有额外的方法，（父接口，类中没有的方法）;
	//h.匿名内部类中还可以定义匿名内部类;
	//i.匿名内部类中可以对其它类进行实例化;
	
	//测试成员内部类
	public static void main(String[] args) {
		//创建外部类的对象
		Animal outer = new Animal();
		
		//创建成成员内部类的对象
		//通过外部类的对象创建内部类的对象
		Inner in = outer.new Inner();	//这么创建内部类的对象的吗
		in.show_info();
		
		//创建静态内部类的对象
		Age age = new Age();	//静态内部类的初始化方法
		age.show_info();
		age.show_outer_info();
		
		//方法内部类
		outer.show_something();
	}
}

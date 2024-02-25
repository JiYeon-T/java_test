//package OOP;

public class InnerClass {
	
	//外部类的私有属性
	private String name = "James";
	
	//外部类的成员属性
	int age = 20;
	
	//成员内部类
	public class InnerCla{
		String name = "Inner";
		
		//
		public void show() {
			//可以访问外部类的私有成员
			System.out.println("外部类的名字: " + InnerClass.this.name);
			//
			System.out.println("内部类的名字: " + name);
			//外部类的其它成员
			System.out.println("外部类的age: " + age);

		}
	}
	
	//静态内部类(static,类变量)
	//不可以直接访问外部类的非static成员, 可以通过new 外部类().成员 访问
	public static class StaticClass{
		String name = "Inner";
		
		//
		public void show() {
			//可以访问外部类的私有成员
			//System.out.println("外部类的名字: " + InnerClass.name);	//报错
			//访问非static类成员
			System.out.println("外部类的age: " + new InnerClass().age);
			System.out.println("内部类的名字: " + name);

		}
	}
	
	//方法内部类
	public void show() {
		//无法使用public, private, static等关键字
		class SC{
			String name = "abc";
			String getInfo() {
				return name;
			}
		}
		SC sc = new SC();
		sc.getInfo();
	}
	
	//匿名内部类
	//需要加分号
	InnerClass ic = new InnerClass(){
		
	};
	
	
	public static void main( String[]  args) {
		//创建外部类对象
//		InnerClass ic = new InnerClass();
		
		//创建内部类对象
		//注意方法
//		InnerCla  ici = ic.new InnerCla();
//		ici.show();
		
		//静态内部类
		StaticClass sc = new StaticClass();
		sc.show();
	}
}

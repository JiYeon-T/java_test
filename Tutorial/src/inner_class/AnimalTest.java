package inner_class;

public class AnimalTest {
	private final String ANIMAL = "动物";
	
	public void accessTest() {
		System.out.println("匿名子类访问外部类的方法");
	}
	
	public class Animal{
		private String name;
		
		//定义构造函数
		public Animal(String name) {
			this.name = name;
		}
		
		public void showInfo() {
			System.out.println( "animal's name = " + name );
		}
	}
	
	//定义一个匿名子类，重写父类的一个方法
	//匿名子类
	Animal bird = new Animal("布谷鸟") {
		@Override
		public void showInfo() {
			accessTest();	//调用外部类的成员函数
			System.out.println(ANIMAL);		//调用外部类的final修饰的变量
			super.showInfo();	//调用父类的方法
		}
	};
	
	//外部类调用匿名类的方法
	void print() {
		bird.showInfo();	//匿名类，直接调用方法即可
	}
	
	//测试部分
	public static void main(String[] args) {
		AnimalTest at = new AnimalTest();
		at.print();
	}
}

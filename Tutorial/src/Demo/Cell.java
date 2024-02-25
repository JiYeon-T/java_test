package Demo;

//final
//- final 关键字声明类可以把类定义为不能继承的，即最终类；
//- 用于修饰方法，该方法不能被子类重写；
//- 实例变量（成员变量/属性）也可以被定义为 final，被定义为 final 的变量不能被修改。
//- 被声明为 final 类的方法自动地声明为 final，但是实例变量（成员变量/属性）并不是 final
public class Cell {
	final int id = 123465;
	String name = "xibao";
	
	final String getName() {
		return name;
	}
	
	//test
	public static void main() {
		Cell c1 = new Cell();
		//c1.id = 12;	//
		c1.getName();
	}
}

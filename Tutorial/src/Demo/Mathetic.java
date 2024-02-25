package Demo;

public class Mathetic {
	//在实际开发过程中，我们经常会遇到需要使用对象，而不是内置数据类型的情形
	//为了解决这个问题，Java 语言为每一个内置数据类型提供了对应的包装类。
	public static void main(String[] args) {
		//使用包装类来声明一个变量
		Integer a = 1;
		a += 1;
		System.out.println("a = " + a);
		
		
		//数学运算java.lang.Math
		System.out.println("PI = " + Math.PI);
		System.out.println("sin(90) = " + Math.sin(Math.PI / 2));
		System.out.println("degree = " + Math.toDegrees(Math.PI));
		
		//Math拥有的其它函数
		System.out.println("-----------------------------");
		Integer c = 1;
		System.out.println(c.byteValue());
		System.out.println(c.doubleValue());
		System.out.println(c.longValue());
		System.out.println(c.compareTo(5));
		System.out.println(c.toString());
		String s = "12346";
		//parseInt()是static方法，直接使用类名调用即可
		//System.out.println(Integer.parseInt(s));
		int result = Integer.parseInt(s);
		System.out.println(result);
		System.out.println(Math.random());
		
		//ceil, round, floor方法
		System.out.println("-----------------------------");
		double[] nums = {1.2, 2.4, 4.5, -1.2}; 
		for( double num : nums ) {
			test(num);	//这里传递的是引用，而不是简单的复制
		}
		
	}
	
	//必须要加static, 因为传过来的参数是static引用类型
	//ceil()返回大于等于给定参数的最小整数
	//floor()返回小于等于给定参数的最大整数
	//round()四舍五入
	//rint()返回与参数最接近的整数
	public static void test( double num ) {
		System.out.println(num + "'s ceil() = " + Math.ceil(num));
		System.out.println(num + "'s round() = " + Math.floor(num));
		System.out.println(num + "'s floor() = " + Math.round(num));
		System.out.println(num + "'s rint() = " + Math.rint(num));
	}
	
	//ctrl + / 批量注释 以及 批量取消注释的方法
}

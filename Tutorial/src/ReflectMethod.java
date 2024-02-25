//package OOP;

import java.lang.reflect.Method;
import java.lang.ReflectiveOperationException;

public class ReflectMethod {

	//
	
	
	//通过反射的方法来获得类的方法
	//step1:首先获得类类型的信息
	//
	
	//public getMethodFromClass()
	public static void main(String[] args) {
		A a = new A();
		//获得了对象的类类型
		Class c = a.getClass();
		
		try {
			//getMethod()
			Method m = c.getMethod("getSum", double.class, double.class);
			//Method m = c.getMethod(new String("getSum"), double.class, double.class);
			
			//A a.getSum(double, double)方法的反射操作是通过mthod m这个对象来实现的
			//效果与直接调用完全一致
			//有返回值的返回，没有的返回null
			//调用方法: m.invoke(对象, 参数:a, b)
			Object obj = m.invoke(a, 10.1, 20.2);
			System.out.println("反射方法结果: " + obj);
		}catch(Exception e) {
			System.out.println("Error occured.");
			e.printStackTrace();
		}
	
	}
	
	
}

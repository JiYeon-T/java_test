//package OOP;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectClass {

	String name;
	int id;
	
	//new 静态加载类(编译时)
	
	//动态加载类
	//动态加载类的使用方法(运行时)
	public void dynamicLoadTest() {
		try {
			//动态加载类，运行时加载
			Class c = Class.forName("args[0]");
			//通过类类型，创建该类对象
			InnerClass c2 = (InnerClass)c.newInstance();
			c2.getClass();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//成员变量,方法的反射
	/*
	 * 类是对象
	 * 类的成员变量是对象
	 * 类的方法也是对象
	 */
	//打印类的所有方法(类的方法实际上是Methods类)
	public static void printClassMethodList( Object obj ) {
		//先获取类类型
		Class c = obj.getClass();
		System.out.println("类名称: " + c.getName());
		
		//获取类的所有方法
		Method[] methods = c.getMethods();
		for( int ix = 0; ix < methods.length; ++ix ) {
			Class returnType = methods[ix].getReturnType();
			System.out.println("方法: " + methods[ix].getName() + "返回值: " + returnType.getName());
		}
		
		//成员变量
		//java.lang.reflect.Field封装了类的成员变量的类
		Field[] fields = c.getFields();
		for( Field f : fields ) {
			Class varType = f.getType();
			String varName = varType.getName();
			String fieldName  = f.getName();
			System.out.println("成员变量名: " + varName + "-----" + fieldName);
		}
	}
	
	//java中获取方法
	//(1)通过方法名称和参数就可以确定一个方法
	//(2)通过反射method.invoke(对象，参数列表)
	
	
	public static void main( String[]  args) {
		ReflectClass rf = new ReflectClass();
		
		//Class类
		//所有类都是Class类的子类，任何一个类都有一个class成员变量（隐含的静态成员变量）
		//方法1
		Class c1 = Demo.class;	
		//方法2
		Class c2 = rf.getClass();	//使用getClass()方法得到class成员
		//方法3
		Class c3 = null;
		try {
			c3 = Class.forName("OOP.Demo");
			//Demo d2 = (Demo)c1.newInstance();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
//		catch(InstantiationException e) {
//			e.printStackTrace();
//		}
//		catch(IllegalAccessExcepton e) {
//			e.printStackTrace();
//		}
		
		rf.printClassMethodList(rf);
	}
}


class Demo{
	
}
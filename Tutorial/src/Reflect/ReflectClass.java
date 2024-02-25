package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;




public class ReflectClass {
	public static void main(String[] args) {
		//1.基本反射技术
		//根据一个字符串得到一个类
		String s1 = "Hello, world.";
		Class c1 = s1.getClass();
		System.out.println( c1.getName() );
		
		//通过一个字符串得到一个类
		String s2 = "java.lang.String";
		Class c2 = null;
		try {
			c2 = Class.forName(s2);
			System.out.println(c2.getName());
		}
		catch(ClassNotFoundException e){
			
		}
		
		//每个基本类型都有TYPE属性
		Class c3 = Double.TYPE;
		Class c4 = Boolean.TYPE;
		Class c5 = Byte.TYPE;
		Class c6 = Float.TYPE;
		
	}
}

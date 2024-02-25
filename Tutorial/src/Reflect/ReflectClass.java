package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;




public class ReflectClass {
	public static void main(String[] args) {
		//1.�������似��
		//����һ���ַ����õ�һ����
		String s1 = "Hello, world.";
		Class c1 = s1.getClass();
		System.out.println( c1.getName() );
		
		//ͨ��һ���ַ����õ�һ����
		String s2 = "java.lang.String";
		Class c2 = null;
		try {
			c2 = Class.forName(s2);
			System.out.println(c2.getName());
		}
		catch(ClassNotFoundException e){
			
		}
		
		//ÿ���������Ͷ���TYPE����
		Class c3 = Double.TYPE;
		Class c4 = Boolean.TYPE;
		Class c5 = Byte.TYPE;
		Class c6 = Float.TYPE;
		
	}
}

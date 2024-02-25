//package OOP;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectClass {

	String name;
	int id;
	
	//new ��̬������(����ʱ)
	
	//��̬������
	//��̬�������ʹ�÷���(����ʱ)
	public void dynamicLoadTest() {
		try {
			//��̬�����࣬����ʱ����
			Class c = Class.forName("args[0]");
			//ͨ�������ͣ������������
			InnerClass c2 = (InnerClass)c.newInstance();
			c2.getClass();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//��Ա����,�����ķ���
	/*
	 * ���Ƕ���
	 * ��ĳ�Ա�����Ƕ���
	 * ��ķ���Ҳ�Ƕ���
	 */
	//��ӡ������з���(��ķ���ʵ������Methods��)
	public static void printClassMethodList( Object obj ) {
		//�Ȼ�ȡ������
		Class c = obj.getClass();
		System.out.println("������: " + c.getName());
		
		//��ȡ������з���
		Method[] methods = c.getMethods();
		for( int ix = 0; ix < methods.length; ++ix ) {
			Class returnType = methods[ix].getReturnType();
			System.out.println("����: " + methods[ix].getName() + "����ֵ: " + returnType.getName());
		}
		
		//��Ա����
		//java.lang.reflect.Field��װ����ĳ�Ա��������
		Field[] fields = c.getFields();
		for( Field f : fields ) {
			Class varType = f.getType();
			String varName = varType.getName();
			String fieldName  = f.getName();
			System.out.println("��Ա������: " + varName + "-----" + fieldName);
		}
	}
	
	//java�л�ȡ����
	//(1)ͨ���������ƺͲ����Ϳ���ȷ��һ������
	//(2)ͨ������method.invoke(���󣬲����б�)
	
	
	public static void main( String[]  args) {
		ReflectClass rf = new ReflectClass();
		
		//Class��
		//�����඼��Class������࣬�κ�һ���඼��һ��class��Ա�����������ľ�̬��Ա������
		//����1
		Class c1 = Demo.class;	
		//����2
		Class c2 = rf.getClass();	//ʹ��getClass()�����õ�class��Ա
		//����3
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
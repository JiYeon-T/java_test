//package OOP;

import java.lang.reflect.Method;
import java.lang.ReflectiveOperationException;

public class ReflectMethod {

	//
	
	
	//ͨ������ķ����������ķ���
	//step1:���Ȼ�������͵���Ϣ
	//
	
	//public getMethodFromClass()
	public static void main(String[] args) {
		A a = new A();
		//����˶����������
		Class c = a.getClass();
		
		try {
			//getMethod()
			Method m = c.getMethod("getSum", double.class, double.class);
			//Method m = c.getMethod(new String("getSum"), double.class, double.class);
			
			//A a.getSum(double, double)�����ķ��������ͨ��mthod m���������ʵ�ֵ�
			//Ч����ֱ�ӵ�����ȫһ��
			//�з���ֵ�ķ��أ�û�еķ���null
			//���÷���: m.invoke(����, ����:a, b)
			Object obj = m.invoke(a, 10.1, 20.2);
			System.out.println("���䷽�����: " + obj);
		}catch(Exception e) {
			System.out.println("Error occured.");
			e.printStackTrace();
		}
	
	}
	
	
}

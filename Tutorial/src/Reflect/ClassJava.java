package Reflect;



public class ClassJava {
	public static void main(String[] args) {
		Demo d = new Demo();
		//1.����Class��������ַ���
		Class c1 = Demo.class;
		Class c2 = d.getClass();
		Class c3 = null;
		c3 = Class.forName("Reflect.demo");
	}
}
//2. Class��
//a.�κ�һ���඼��Class�������;
//b.�κ�һ���඼��һ�������ľ�̬�ĳ�Ա����Class; b.getClass()����;
//c.Class.forName("���ȫ��");������ʾ��������ͣ�����ʾ�˶�̬������;
//d.�����ʱ����ص��඼�Ǿ�̬�����ࣻ����ʱ���ص��඼�Ƕ�̬������;
class Demo{
	
}


//3.��������Ա���������캯���ķ���
//java��������
//���������� �� �����Ĳ�������Ψһ��ȷ��һ��han'shu
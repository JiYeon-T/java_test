/**
* Copyright (C), 2006-2010, ChengDu Lovo info. Co., Ltd.
* FileName: Test.java
* �ļ�ע��
*
* @author �ഴ��������
* @Date    ��������
* @version 1.00
*/

//package OOP;
/*
 * ��̹淶:
 * �����淶:
 * 1. ��Ŀ(project)��ȫ��Сд
 * 2. ��(package)��ȫ��Сд, ���磺com.runoob��
 * 3. ��(class)/interface��:���շ�
 * 4. ��������������:С�շ�, ���������ֺͱ����������淶һ��
 * 5. ������ȫ����д
 * 
 * */

//package��䣬�ò�������ֻ��һ�䣬�������Դ����ĵ�һ�䡣
//import��䣬�ò��ֿ���������import������û�У�����������е��ඨ��֮ǰ��	
//public classDefinition�������ඨ�岿�֣�����ֻ��һ��������Ķ��壬Java���Թ涨��JavaԴ������ļ���������ù���������ȫһ�¡�
//classDefinition���ඨ�岿�֣�������0�����߶���ඨ�塣
//interfaceDefinition���ӿڶ��岿�֣�������0�����߶���ӿڶ��塣
//����:
/*�ѱ������ɵ����У�class�ļ��ŵ���javawork.helloworld��*/
//package javawork.helloworld;
/*���߱��������������õ�ϵͳ��AWT��*/
//import java awt.*;
/*���߱��������������õ��û��Զ���İ�javawork.newcentury*/
//import javawork.newcentury;
/*������HelloWorldApp�Ķ��壬�������ļ�����ͬ*/ 
// public class HelloWorldApp{...��
//��һ����ͨ��TheFirstClass�Ķ��� 
//class TheFirstClass��...��;
/*����һ���ӿ�TheFirstInterface*/
//interface TheFirstInterface{......}


//package���(C++ namespace)��
//����Java������Ϊÿ��������һ���ֽ����ļ������ļ�����������ͬ���ͬ�������п��ܷ�����ͻ��
//Ϊ�˽����һ���⣬Java�ṩ�������������ռ䣬��ʵ �ṩ��һ���������ƺͿɼ������ƻ��ơ�

// Դ�ļ���������:
//һ��Դ�ļ���ֻ����һ�� public ��(java��ǿ��Ҫ��������Ψһ��public�ࣩ���ļ���ͳһ�����������������ʱ������ʽ�������ڱ���ʱ�����������������ȥѰ��ͬ���ļ���) ֻ����һ�� public ����Ϊ�˸���װ�����ṩ����
//һ��Դ�ļ������ж���� public ��( ��Ȼһ�����뵥Ԫ��Ҳ����û�� public �ࡣ)
//Դ�ļ�������Ӧ�ú� public �����������һ�¡����磺Դ�ļ��� public ��������� Employee����ôԴ�ļ�Ӧ������ΪEmployee.java��
//���һ���ඨ����ĳ�����У���ô package ���Ӧ����Դ�ļ������С�
//���Դ�ļ����� import ��䣬��ôӦ�÷��� package �����ඨ��֮�䡣���û�� package ��䣬��ô import ���Ӧ����Դ�ļ�����ǰ��
//import ���� package ����Դ�ļ��ж���������඼��Ч����ͬһԴ�ļ��У����ܸ���ͬ���಻ͬ�İ�������
//���������ַ��ʼ��𣬲�����Ҳ�ֲ�ͬ�����ͣ�������� final ��ȡ���Щ���ڷ��ʿ����½ڽ��ܡ�
//���������ᵽ�ļ������ͣ�Java ����һЩ������࣬�磺�ڲ��ࡢ�����ࡣ

//�� Java �У��������һ���������޶�����������������������ô Java �������Ϳ��Ժ����׵ض�λ��Դ��������ࡣ
//import �����������ṩһ�������·����ʹ�ñ����������ҵ�ĳ���ࡣ

// ������������� java_installation/java/io ·���µ�������
import java.io.*;


public class A {
	/**
	* ���췽������ϸʹ��˵��
	*
	* @param ����1 ����1��ʹ��˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	
	
	/** ����ע��:��ʾ��Ϣ */
	String name;
	int id;
	double account;
	
	// ��ע�⣬main ��һ���������ڣ�һ�� java �������б���������ҽ���һ�� main ����
//	public static void main(String[] args) {
//		System.out.println("args:" + args);
//		printHello();
//	}

	// �ɱ������ʽ�� main() ����
// �������η� �ؼ��� �������� ������ ����
//	����������һ����Java����ʹ�����η����������з��������ԡ���Ҫ���������η���
//	���ʿ������η� : default, public , protected, private
//	�Ƿ��ʿ������η� : final, abstract, static, synchronized
	public static void main(String... args) {
		A a = new A();
		System.out.println("args:" + args);
//		printHello();
//		a.varTypeTest(3);
		a.paramTransTest();
	}
	//���弸������
	/**
	* ����ע��
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public static double getSum(double a, double b) {
		return a + b;
	}
	
	public static void printSome(String str) {
		System.out.println( "message: " + str );
	}
	
	public static void printHello() {
		System.out.println("Hello, world.");
	}
	
	// ����ö������
	// ö�ٿ��Ե����������������������档���������������캯��Ҳ������ö���ж���
	enum AlphSize {SMALL, MIDDLE, LARGE}
	AlphSize alphSize;
	// TODO:
//	AlphSize alphSize = A.AlphSize.SMALL;
	
//	public static void printAlphSize() {
//		System.out.println("alphebetic size" + alphSize);
//	}
	
	/** �������� */
	// �ֲ�����, ʵ������(��Ա����), ��̬����(�����)
	// NOTE:
	// �����ھ�̬�����е��÷Ǿ�̬��Ա, ��Ϊ��̬��Ա�����ʱ��û��ʵ������, �޷���ȡ�ö���ĳ�Ա
	// ��̬�������ڶ������ֻ��һ����̬����, ��Ҫ�����̰߳�ȫ����
	// ��̬����ͨ���������³�����
	//a.�洢ȫ��״̬��������Ϣ
	//b.��������ͳ����Ϣ
	//c.�������ݻ�����Դ
	//d.������ĳ����򷽷�
	//e.����ģʽ�е�ʵ������
	public int objVar1 = 1;
	public static int classVar1 = 2;
	public void varTypeTest(int localVar1) {
		System.out.println("objVar1: " + objVar1 + "  classVar1:" + classVar1 + "  localVar1:" + localVar1);
	}
	
	/** �������� */
	// ֵ����:Java �еĻ����������Ͷ�����ֵ���ݷ�ʽ���ݲ���������ֵ
	// ���ô���:	Java �е����顢�������Ͳ������ô��ݷ�ʽ���ݲ���������ֵ
	public void paramTransTest() {
		int a = 1, b = 2;
		System.out.println("a:" + a + "  b:" + b);
		swap(a, b);
		System.out.println("a:" + a + "  b:" + b);

		IntNum a2 = new IntNum(a), b2 = new IntNum(b);
		System.out.println("a2:" + a2.val + "  b2:" + b2.val);
		swapIntNum(a2, b2);
		System.out.println("a2:" + a2.val + "  b2:" + b2.val);
	}
	
	/**
	* ����ע��:����Ľ�����������д��
	*
	* @param a ֵ����
	* @param b ֵ����
	* @return None
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	// һ��������, ���ڶ�����Ϊ�������ݲ���
	class IntNum {
		int val;
		// ���캯��
		public IntNum(int val) {
			this.val = val;
		}
	}

	/**
	* �������� IntNum ���Ͷ���
	* TODO:
	* Ϊʲô���ﴫ�ݵĲ���������?
	*
	* @param a ���ô���
	* @param b ���ô���
	* @return None
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public void swapIntNum(IntNum a, IntNum b) {
		IntNum temp = new IntNum(a.val);
		a = b;
		b = temp;
	}
	
	/** Java ���η�:�������η� + �Ƿ������η� */
	// ���ʿ������η�,Java�У�����ʹ�÷��ʿ��Ʒ����������ࡢ�����������͹��췽���ķ��ʡ�Java ֧�� 4 �ֲ�ͬ�ķ���Ȩ�ޡ�
	//default (��Ĭ�ϣ�ʲôҲ��д��: ��ͬһ���ڿɼ�����ʹ���κ����η���ʹ�ö����ࡢ�ӿڡ�������������
	//private : ��ͬһ���ڿɼ���ʹ�ö��󣺱����������� ע�⣺���������ࣨ�ⲿ��
	//public : ��������ɼ���ʹ�ö����ࡢ�ӿڡ�����������
	//protected : ��ͬһ���ڵ������������ɼ���ʹ�ö��󣺱����������� ע�⣺���������ࣨ�ⲿ�ࣩ��
	
	//protected ��Ҫ������������������˵����
	//�����������ͬһ���У�������Ϊ protected �ı����������͹������ܱ�ͬһ�����е��κ���������ʣ�
	//��������಻��ͬһ���У���ô�������У�����ʵ�����Է�����ӻ���̳ж����� protected �����������ܷ��ʻ���ʵ����protected������
	// ��ʵ����protected�����ͨ�׵㽲���ǣ����������ֻ���������һ��ͬһ��������ʱ��Ÿ����ã��㲻������һ���ҾͲ��������ˡ�

	//�Ƿ������η�:
	//static����̬����/��̬����
	//final:����, final ���η�ͨ���� static ���η�һ��ʹ���������ೣ��
	//�����е� final �������Ա�����̳У����ǲ��ܱ�������д������ final ��������ҪĿ���Ƿ�ֹ�÷��������ݱ��޸ġ�
	//final �಻�ܱ��̳У�û�����ܹ��̳� final ����κ����ԡ�
	class FinalTest{
		final int FINAL_TEST_VAL = 1;
		
		public FinalTest() {
			
		}
		
		public final void cannotModifyFun() {
			// ���Ա�����̳�, �������Ա�������д
		}
	}
	
	// abstract:
	//������:
	//�����಻������ʵ�������������������ΨһĿ����Ϊ�˽����Ը���������䡣
	//һ���಻��ͬʱ�� abstract �� final ���Ρ����һ����������󷽷�����ô����һ��Ҫ����Ϊ�����࣬���򽫳��ֱ������
	//��������԰������󷽷��ͷǳ��󷽷���
	// ���󷽷���
	//���󷽷���һ��û���κ�ʵ�ֵķ������÷����ľ���ʵ���������ṩ��
	//���󷽷����ܱ������� final �� static��
	//�κμ̳г�������������ʵ�ָ�������г��󷽷������Ǹ�����Ҳ�ǳ����ࡣ
	//���һ����������ɸ����󷽷�����ô�����������Ϊ�����ࡣ��������Բ��������󷽷���
	abstract class AbstractClassTest{
	   private double price;
	   private String model;
	   private String year;
	   public abstract void goFast(); //���󷽷�
	   public abstract void changeColor();
//	   public void printClassInfo();
	}
	
	//synchronized ���η�
	//synchronized �ؼ��������ķ���ͬһʱ��ֻ�ܱ�һ���̷߳��ʡ�synchronized ���η�����Ӧ�����ĸ��������η���
	// ��Ҫ������Ҫ��֤�̰߳�ȫ�ĺ���???
	
	//transient ���η�
	//���л��Ķ�������� transient ���ε�ʵ������ʱ��java �����(JVM)�������ض��ı�����
	//�����η������ڶ������������У�����Ԥ������ͱ������������͡�
	//���������л�ʱ��д���ֽ����е�Ŀ���ļ���ʱ��transient��ֹʵ������Щ�ô˹ؼ��������ı����־û���
	//�����󱻷����л�ʱ����Դ�ļ���ȡ�ֽ����н����ع�����������ʵ������ֵ���ᱻ�־û��ͻָ���
	public transient int limit = 55;   // ����־û�
	public int not_limit; // �־û�
	
	//volatile ���η�
	//volatile ���εĳ�Ա������ÿ�α��̷߳���ʱ����ǿ�ƴӹ����ڴ������¶�ȡ�ó�Ա������ֵ��
	// ���ң�����Ա���������仯ʱ����ǿ���߳̽��仯ֵ��д�������ڴ档
	//�������κ�ʱ�̣�������ͬ���߳����ǿ���ĳ����Ա������ͬһ��ֵ��
	//һ�� volatile �������ÿ����� null��
	//����:
	public volatile boolean active = false;
	//ͨ������£���һ���̵߳��� run() �������� Runnable �������̣߳�������һ���̵߳��� stop() ������ 
	//��� ��һ�� �л������� active ֵ��ʹ�ã���ô�� �ڶ��� �� active ֵΪ false ʱѭ������ֹͣ��
	//�������ϴ���������ʹ���� volatile ���� active�����Ը�ѭ����ֹͣ��
	public void run() {
		active = true;
		while (active) {
			
		}
	}
	
	public void stop() {
		active = false;
	}
	
	
}

class B {
	public static void test() {
	}
}




/**
* Copyright (C), 2006-2010, ChengDu Lovo info. Co., Ltd.
* FileName: Test.java
* �ļ�ע��
*
* @author �ഴ��������
* @Date    ��������
* @version 1.00
*/

package Object;

/**
 * ��Ա�����������(static)������:
 * 1�������������������ڲ�ͬ:
 * ��Ա�������Ŷ���Ĵ��������ڣ����Ŷ���Ļ��ն��ͷš�
 * ��̬����������ļ��ض����ڣ����������ʧ����ʧ��
 * 2�����÷�ʽ��ͬ
 * ��Ա����ֻ�ܱ�������� d.size��
 * ��̬�������Ա�������� d.hasName�������Ա��������� Dog.hasName�� 
 * 4�����ݴ洢λ�ò�ͬ
 * ��Ա�����洢�ڶ��ڴ�Ķ����У�����Ҳ�ж�����������ݡ�
 * ��̬�������ݴ洢�ڷ��������������������ľ�̬��������Ҳ�ж���Ĺ������ݡ�
 * 
 * static �ؼ��֣���һ�����η����������γ�Ա(��Ա�����ͳ�Ա����)���ص㣺
 * 1����Ҫʵ�ֶ����еĹ������ݵĶ��������Խ�������ݽ��о�̬���Ρ�
 * 2������̬���εĳ�Ա������ֱ�ӱ����������á�Ҳ����˵����̬�ĳ�Ա����һ�ֵ��÷�ʽ������.��̬��ʽ��
 * 3����̬������ļ��ض����ء����������ڶ�����ڡ� 
 * �׶�:
 * 1����Щ�����Ƕ������е����ݣ��ǲ����Ա���̬���εġ�
 * ��Ϊ�����Ļ����������ݻ��ɶ���Ĺ������ݡ�����������������ͳ������⡣���ԣ��ڶ��徲̬ʱ������Ҫ��ȷ����������Ƿ��Ǳ�����������ġ�
 * 2����̬����ֻ�ܷ��ʾ�̬��Ա�������Է��ʷǾ�̬��Ա��
 * ��Ϊ��̬��������ʱ�������ڶ�����ڣ�����û�а취���ʶ����еĳ�Ա(�������)��
 * 3����̬�����в���ʹ��this��super�ؼ��֡�
 * ��Ϊthis������󣬶���̬����ʱ���п���û�ж�������this�޷�ʹ�á�
 * 
 * */

/**
 * new�ؼ��ֵ�����:
 * 1��Ϊ��������ڴ�ռ䡣
 * 2����������췽���ĵ��á�
 * 3��Ϊ���󷵻�һ�����á�
 * */

public class Dog {
	/** �����, ����Ҫʵ��������Ҳ���Է��� */
	static boolean hasName;
	/** ��Ա����, ����Ҫʵ��������ſ��Է��� */
	int size;
	String color;
	int age;
	String name;
	
	public static void main(String[] args) {
//		eat();
//		run(); // ERROR
//		setAge(); // ERROR
	}
	
	/**
	* ÿ���඼�й��췽�������û����ʽ��Ϊ�ඨ�幹�췽����Java ����������Ϊ�����ṩһ��Ĭ�Ϲ��췽����
	* �ڴ���һ�������ʱ������Ҫ����һ�����췽����
	* ���췽�������Ʊ�������ͬ����һ��������ж�����췽��(���캯��Ҳ��������)��
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public Dog() {	
	}
	
	/** 3.��һ�����У��ֲ������������Ա����ͬ�������Ǿֲ���������,�����Ҫ���ʳ�Ա���������ԣ������ʹ�� this.color 
	 * this ����ǰ�������Ҳ���ǵ�ǰ˭�����������������������˭
	 * 1.( this ָ��������ָ�룬�β����Ա������������ this �����֡�)
	 * 2. super ��������������һ��ָ��
	 * ���������õ�����:
	 * �����Ǿ����һ��ʵ�����磺new Student(); new ��ʾ����һ�����󣬲��ڶ��ڴ��п���һ��ռ䡣
	 * ���������Ǵ�ŵĶ���ĵ�ַ��
	 * */
	public Dog(String name) {
		System.out.println("dog:" + name + " constructor");
		this.name = name; // this ָ��?
	}
	
	public Dog(int size, String color, int age) {
		this.size = size;
		this.color = color;
		this.age = age;
	}
	
	/**
	* ����ע��:Getter ����
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public void setAge(int iAge) {
		
	}

	/**
	* ����ע��:Getter ����
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public int getAge() {
		return age;
	}

	/**
	* ����ע��:Getter ����, ��ȡ�����
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public boolean getHasName() {
		/**���뱨��:The static field Dog.breed should be accessed int a static way*/
		// return this.breed;
		System.out.println(this.name + " get has name:" + hasName);
		return hasName;
	}

	/**
	* ����ע��:Setter ����, ���������
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public void setHasName(boolean dogHasName) {
		hasName = dogHasName;
		System.out.println(this.name + " set has name:" + hasName);
	}

	/**
	* ����ע��
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public static void eat() {
		// ��̬����ֻ�ܷ��ʾ�̬��Ա�������Է��ʷǾ�̬��Ա��
		// ��Ϊ��̬��������ʱ�������ڶ�����ڣ�����û�а취���ʶ����еĳ�Ա��
		/** ���뱨��:Can not use this in a static method */
		// System.out.println("eat" + this.name);
		System.out.println("eat");
	}
	
	void run() {
		System.out.println("run");
	}
	
	void sleep() {
		System.out.println("sleep");
	}
	
	void name() {
		System.out.println("name");
	}
	
	/**
	* ����ע��
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public void printDogInfo() {
		System.out.println("name:" + this.name);
		System.out.println("age:" + this.age);
		System.out.println("color:" + this.color);
		System.out.println("size:" + this.size);
		System.out.println();
	}
}


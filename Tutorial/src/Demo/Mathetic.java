package Demo;

public class Mathetic {
	//��ʵ�ʿ��������У����Ǿ�����������Ҫʹ�ö��󣬶����������������͵�����
	//Ϊ�˽��������⣬Java ����Ϊÿһ���������������ṩ�˶�Ӧ�İ�װ�ࡣ
	public static void main(String[] args) {
		//ʹ�ð�װ��������һ������
		Integer a = 1;
		a += 1;
		System.out.println("a = " + a);
		
		
		//��ѧ����java.lang.Math
		System.out.println("PI = " + Math.PI);
		System.out.println("sin(90) = " + Math.sin(Math.PI / 2));
		System.out.println("degree = " + Math.toDegrees(Math.PI));
		
		//Mathӵ�е���������
		System.out.println("-----------------------------");
		Integer c = 1;
		System.out.println(c.byteValue());
		System.out.println(c.doubleValue());
		System.out.println(c.longValue());
		System.out.println(c.compareTo(5));
		System.out.println(c.toString());
		String s = "12346";
		//parseInt()��static������ֱ��ʹ���������ü���
		//System.out.println(Integer.parseInt(s));
		int result = Integer.parseInt(s);
		System.out.println(result);
		System.out.println(Math.random());
		
		//ceil, round, floor����
		System.out.println("-----------------------------");
		double[] nums = {1.2, 2.4, 4.5, -1.2}; 
		for( double num : nums ) {
			test(num);	//���ﴫ�ݵ������ã������Ǽ򵥵ĸ���
		}
		
	}
	
	//����Ҫ��static, ��Ϊ�������Ĳ�����static��������
	//ceil()���ش��ڵ��ڸ�����������С����
	//floor()����С�ڵ��ڸ����������������
	//round()��������
	//rint()�����������ӽ�������
	public static void test( double num ) {
		System.out.println(num + "'s ceil() = " + Math.ceil(num));
		System.out.println(num + "'s round() = " + Math.floor(num));
		System.out.println(num + "'s floor() = " + Math.round(num));
		System.out.println(num + "'s rint() = " + Math.rint(num));
	}
	
	//ctrl + / ����ע�� �Լ� ����ȡ��ע�͵ķ���
}

package Object;

/**
 * 1.( this ָ��������ָ�룬�β����Ա������������ this �����֡�)
 * 2. super ��������������һ��ָ��
 */

public class People {
	public static void prt(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		System.out.println("People class test");
	}

	public People() {
		prt("People �޲ι��캯��");
	}
	
	public People(String name) {
		prt("People һ�������캯��, name:" + name);
	}
}


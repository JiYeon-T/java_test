package Demo;

//ͨ���ӿڣ�implements�ؼ��ּ�����ʵ����û�еĶ�̳еĹ���
public class Ant implements A, B {
	
	//�̳нӿڵ������ʵ�ֽӿ��������ķ���
	public void showInfo() {
		System.out.println("This is interface A's function showInfo()");
	}
	
	public void eat() {
		System.out.println("This is interface A's function eat()");
	}
	
	
	//
	public static void main(String[] args) {
		Ant a = new Ant();
		a.showInfo();
		a.eat();
	}
}

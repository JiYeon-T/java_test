package Demo;

public class AbstractTest {
	//����
	public static void main(String[] args) {
		SubClass sb = new SubClass();
		sb.setID(1000);
		sb.setName("����");
		System.out.println("name:" + sb.getName());
		System.out.println("ID:" + sb.getID());
	}
}

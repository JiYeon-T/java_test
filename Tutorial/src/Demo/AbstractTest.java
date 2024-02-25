package Demo;

public class AbstractTest {
	//²âÊÔ
	public static void main(String[] args) {
		SubClass sb = new SubClass();
		sb.setID(1000);
		sb.setName("Íõ¶ş");
		System.out.println("name:" + sb.getName());
		System.out.println("ID:" + sb.getID());
	}
}

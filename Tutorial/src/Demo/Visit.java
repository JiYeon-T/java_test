package Demo;

public class Visit {
	//���ʿ������η�default, public, private, protected 
	private String name = "default";
	
	//constructor
	public Visit(String name) {
		this.name = name;
	}
	
	//˽�г�Աͨ��getter() �� setter()����������
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Visit v = new Visit("С��");
		v.name = "abc";
		System.out.println("name:" + v.name);
	}
}

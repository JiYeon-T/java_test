package Demo;

public class Visit {
	//访问控制修饰符default, public, private, protected 
	private String name = "default";
	
	//constructor
	public Visit(String name) {
		this.name = name;
	}
	
	//私有成员通过getter() 和 setter()犯法来访问
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Visit v = new Visit("小明");
		v.name = "abc";
		System.out.println("name:" + v.name);
	}
}

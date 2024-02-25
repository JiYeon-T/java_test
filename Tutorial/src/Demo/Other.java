package Demo;

public class Other {

	//用来判断私有类成员，包中的其它类不可以访问
	//子类也不可以访问
	public static void main(String[] args) {
		Visit v2 = new Visit("abc");
		//v2.name = "def";		//无法访问
		v2.setName("xiaolizi");
		System.out.println("name:" + v2.getName());
	}
}

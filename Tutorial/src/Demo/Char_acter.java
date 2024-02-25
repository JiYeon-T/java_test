package Demo;

public class Char_acter {
	//char的包装类Character
	//装箱 <->拆箱
	
	public static void main(String[] args) {
		//这方法不行了
		Character a = new Character('a');
		System.out.println(a);
	}
	
	public Character test() {
		Character a = new Character('a');
		return a;
	}
}

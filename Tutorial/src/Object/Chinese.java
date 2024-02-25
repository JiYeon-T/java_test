package Object;

class Chinese extends People {
	public static void main(String[] args) {
		Chinese ch = new Chinese();
		ch = new Chinese("LiBai");
		ch = new Chinese("WangAnShi", 111);
	}
	
	public Chinese() {
		super(); // 调用父类的构造方法
		prt("Chinese 调用父类的无参构造函数");
	}
	
	public Chinese(String name) {
		super(name);
		prt("Chinese 调用父类的带参构造函数 name:" + name);
	}
	
	public Chinese(String name, int age) {
		this(name); // 调用具有相同形参的构造函数
		prt("Chinese 调用具有相同形参的构造函数, age:" + age);
	}
}
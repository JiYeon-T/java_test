package Object;

class Chinese extends People {
	public static void main(String[] args) {
		Chinese ch = new Chinese();
		ch = new Chinese("LiBai");
		ch = new Chinese("WangAnShi", 111);
	}
	
	public Chinese() {
		super(); // ���ø���Ĺ��췽��
		prt("Chinese ���ø�����޲ι��캯��");
	}
	
	public Chinese(String name) {
		super(name);
		prt("Chinese ���ø���Ĵ��ι��캯�� name:" + name);
	}
	
	public Chinese(String name, int age) {
		this(name); // ���þ�����ͬ�βεĹ��캯��
		prt("Chinese ���þ�����ͬ�βεĹ��캯��, age:" + age);
	}
}
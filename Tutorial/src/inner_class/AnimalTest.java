package inner_class;

public class AnimalTest {
	private final String ANIMAL = "����";
	
	public void accessTest() {
		System.out.println("������������ⲿ��ķ���");
	}
	
	public class Animal{
		private String name;
		
		//���幹�캯��
		public Animal(String name) {
			this.name = name;
		}
		
		public void showInfo() {
			System.out.println( "animal's name = " + name );
		}
	}
	
	//����һ���������࣬��д�����һ������
	//��������
	Animal bird = new Animal("������") {
		@Override
		public void showInfo() {
			accessTest();	//�����ⲿ��ĳ�Ա����
			System.out.println(ANIMAL);		//�����ⲿ���final���εı���
			super.showInfo();	//���ø���ķ���
		}
	};
	
	//�ⲿ�����������ķ���
	void print() {
		bird.showInfo();	//�����ֱ࣬�ӵ��÷�������
	}
	
	//���Բ���
	public static void main(String[] args) {
		AnimalTest at = new AnimalTest();
		at.print();
	}
}

//package OOP;

public class InnerClass {
	
	//�ⲿ���˽������
	private String name = "James";
	
	//�ⲿ��ĳ�Ա����
	int age = 20;
	
	//��Ա�ڲ���
	public class InnerCla{
		String name = "Inner";
		
		//
		public void show() {
			//���Է����ⲿ���˽�г�Ա
			System.out.println("�ⲿ�������: " + InnerClass.this.name);
			//
			System.out.println("�ڲ��������: " + name);
			//�ⲿ���������Ա
			System.out.println("�ⲿ���age: " + age);

		}
	}
	
	//��̬�ڲ���(static,�����)
	//������ֱ�ӷ����ⲿ��ķ�static��Ա, ����ͨ��new �ⲿ��().��Ա ����
	public static class StaticClass{
		String name = "Inner";
		
		//
		public void show() {
			//���Է����ⲿ���˽�г�Ա
			//System.out.println("�ⲿ�������: " + InnerClass.name);	//����
			//���ʷ�static���Ա
			System.out.println("�ⲿ���age: " + new InnerClass().age);
			System.out.println("�ڲ��������: " + name);

		}
	}
	
	//�����ڲ���
	public void show() {
		//�޷�ʹ��public, private, static�ȹؼ���
		class SC{
			String name = "abc";
			String getInfo() {
				return name;
			}
		}
		SC sc = new SC();
		sc.getInfo();
	}
	
	//�����ڲ���
	//��Ҫ�ӷֺ�
	InnerClass ic = new InnerClass(){
		
	};
	
	
	public static void main( String[]  args) {
		//�����ⲿ�����
//		InnerClass ic = new InnerClass();
		
		//�����ڲ������
		//ע�ⷽ��
//		InnerCla  ici = ic.new InnerCla();
//		ici.show();
		
		//��̬�ڲ���
		StaticClass sc = new StaticClass();
		sc.show();
	}
}

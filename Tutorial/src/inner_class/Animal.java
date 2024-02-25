package inner_class;

//�ڲ����ʵ��:
//��һ����Ķ��������һ����Ķ����ڲ���������ڲ��ࡣ
//��ͬһ�������ɴ��ԡ�֫�塢���ٵ���������ɣ����ڲ����൱�����е�ĳ������֮һ.
//�������ࣺ��Ҳ���Լ������Ժ���Ϊ��ѪҺ������), ������������֮��ĳ�Ա�޷�ֱ�ӷ�������, ʹ��ĳЩ�����ֶβſ��Է���������Ϣ, ����:������
//�ڲ�������ã�
//(1) �ṩ�˸��õķ�װ�����ڲ����������ⲿ��֮�У���ֹ���е�����������ڲ����еĳ�Ա��
//(2) �ڲ���ķ�������ֱ�ӷ����ⲿ������г�Ա(����˽�г�Ա);
//(3) �ڲ���ʵ�ֵĹ���ʹ���ⲿ��ͬ������ʵ�֣�ֻ����ʱ��ʹ���ڲ����Ϊ����;


public class Animal {
	
	/** �ⲿ��Ĺ��г�Ա */
	private String name = "outer-class";
	/** �ⲿ���˽�г�Ա */
	public int num = 1;
	/** �ⲿ�������� */
	public static String catagory = "Cat";
	
	//(1)��Ա�ڲ���
	public class Inner {
		String name = "Inner-class";
		//�ڲ���ķ���
		//1.�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա(����˽�г�Ա)
		public void show_info() {
			System.out.println("outer name:" + Animal.this.name);
			System.out.println("outer num:" + new Animal().num + 1);	//Ĭ��ת�����ַ�����ʽ
		}
	}
	
	//(2)��̬�ڲ���
	//a.��̬�ڲ��಻��ֱ�ӷ����ⲿ��ķǾ�̬��Ա��Ҫͨ��:new �ⲿ��().��Ա �ķ�������
	//b.����ⲿ��ĳ�Ա���ڲ���ĳ�Ա��ͬ����ͨ��: �ⲿ��.��Ա�ķ��������ⲿ��ĳ�Ա��
	//����ⲿ�����Ʋ���ͬ�������ֱ��ͨ����Ա������
	//c.������̬�ڲ������ʱ������Ҫ�ⲿ����󣬿���ֱ��ʹ��:�ڲ��� ������ = new �ڲ���() �ķ���������
	public static class Age {
		public int year = 1;
		public int month = 1;
		public int day = 1;
		
		//����
		void show_info() {
			System.out.println("year-month-day:" + this.year + "-" + this.month + "-" + this.day);
		}
		
		public void show_outer_info() {
			System.out.println("name:" + new Animal().name);	//name���ⲿ��ķǾ�̬�ɳ�
			System.out.println("num = " + Animal.catagory);
		}
	}
	
	//(3)�����ڲ���
	//�����ڲ���ֻ������ķ����ڲ������ʹ��
	//����ʹ��public, private, static���η�����
	public void show_something() {
		//�����ڲ���
		class Show {
			public String name;
			int score = 1;
			public Show() {
				
			}
			public Show(String name) {
				this.name = name;
			}
			public int getScore() {
				return score + 100; 
			}
		};
		Show s = new Show();
		System.out.println("score:" + s.getScore());
	}
	
	//(4)�����ڲ���
	//�����ڲ���û��������������ʹ�ô�����Ӽ��
	//���ĳһ����ֻ��Ҫʹ��һ�Σ�����Զ���������ڲ���
	//�����ڲ������������ֲ�������ͬ;
	//a.�����ڲ�����Է����ⲿ���е����г�Ա;
	//b.�����ڲ��಻���Է����ⲿ����δ��final���εı���;
	//c.�������Σ�����Ƕ����ͬ�������ڲ����ж���ı�������Ա�����ȣ������ε����������ڵ�����ͬ��...;
	//d.�����ڲ����в��ܶ��徲̬���ԣ�����;
	//e.�����ڲ����п����г�������(final����);
	//f.�����ڲ����п��Զ�������;
	//g.�����ڲ������ж���ķ����������ӿڣ�����û�еķ�����;
	//h.�����ڲ����л����Զ��������ڲ���;
	//i.�����ڲ����п��Զ����������ʵ����;
	
	//���Գ�Ա�ڲ���
	public static void main(String[] args) {
		//�����ⲿ��Ķ���
		Animal outer = new Animal();
		
		//�����ɳ�Ա�ڲ���Ķ���
		//ͨ���ⲿ��Ķ��󴴽��ڲ���Ķ���
		Inner in = outer.new Inner();	//��ô�����ڲ���Ķ������
		in.show_info();
		
		//������̬�ڲ���Ķ���
		Age age = new Age();	//��̬�ڲ���ĳ�ʼ������
		age.show_info();
		age.show_outer_info();
		
		//�����ڲ���
		outer.show_something();
	}
}

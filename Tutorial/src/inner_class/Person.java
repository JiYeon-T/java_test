package inner_class;

//�ڲ����ŵ��ȱ�㣺
//�ŵ㣺�ɷ����ⲿ��˽�����ԣ�����ɷ��������ѪҺ���������ⲿ��Ѫ����
//ȱ�㣺�ƻ�ԭ����ĳ���ṹ�����ԡ����췽������ͨ�������ڲ��ࣩ��


/** ��ʹ���ڲ���ʱ��ʵ�� */
//public class Person {
//	private int heart_beat;
//	private Heart heart;
//}
//
//public class Heart {
//	private int blood;
//	public void test() {
//		System.out.println(blood);
//	}
//}

/** ʹ���ڲ���ʱ��ʵ�� */
public class Person {
	private int blood;
	
	public static void main(String[] args) {
		// Out �ڲ���ʹ�þ���, �ڲ������Ҫ���ⲿ������ſ���ʹ��
		//����������Ӳ��ѿ������ڲ�����ʵ�����ƻ������õĴ���ṹ����Ϊʲô��Ҫʹ���ڲ����أ�
		//��Ϊ�ڲ����������ʹ���ⲿ��ĳ�Ա����������˽�У������������ⲿ��Ķ�����Ҳ���ڲ����Ψһ�ŵ㡣
		//��ͬ�������ֱ�ӷ��������ѪҺ��������ͨ��ҽ������Ѫ��
		// ���������ⲿ��Ķ�����������ڲ���Ķ�����Ϊ�ڲ�������þ���Ϊ�˷����ⲿ���еĳ�Ա������
		// ����1:
//		Out.In in = new Out().new In();
//		in.print();
		// ����2:
		Out	out = new Out();
		Out.In in = out.new In();
		in.print();
		
	}

	public class Heart {
		public void test() {
			System.out.println("blood:"+blood);
		}
	}
	
	public class Brain {
		/** �����ⲿ���˽�г�Ա */
		public void test() {
			System.out.println(blood);
		}
	}
}

// Ӧ�þ���:
class Out {
    private int age = 12;
     
    //�ڲ���
    class In {
        public void print() {
            System.out.println(age);
        }
    }
}


package Object;

/** ��̬�������� */
//ʹ�þ�̬�������洢ȫ��״̬��������Ϣ

// һ����������, ͳ�Ƶ�ǰ��ʼ���˶��ٸ�����Ķ���
// ��������ʵ�ֵ���ģʽ
public class Counter {
	private static int count = 0;

	public Counter() {
		++count;
	}

	public static int getCount() {
		return count;
	}

	public static void main(String[] args) {
		System.out.println("count:" + Counter.count);
		Counter c1 = new Counter();
		System.out.println("count:" + Counter.count);
		Counter c2 = new Counter();
		System.out.println("count:" + Counter.count);
		Counter c3 = new Counter();
		System.out.println("count:" + Counter.count);
	}
}
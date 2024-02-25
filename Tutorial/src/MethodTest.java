
public class MethodTest {

	// �޲ι��캯�� -> Ĭ�Ϲ��캯��ʧЧ
	public MethodTest() {
		
	}
	
	public static void main(String[] args) {
		print("Hello");
//		MethodTest m1 = new MethodTest();
//		m1.add(1, 2);
		
//		double[] arr = {1, 2, 3, 4, 5};
//		printMax(arr);
//		void function(String... args);
//		void function(String args1,String args2);
//		function("Wallen","John");
//		����ƥ��̶������ķ�����

//		finalizeTest();
		
		//������:ֵ���������ô���
		//ֵ����:�������Ͳ����Ĵ��ݣ��ǵ��÷�ֵ�ĸ��ƣ�˫�����Եĺ����޸ģ�����Ӱ�졣
		//�������ͱ�����������ĳ����ֵ����������ָ��������ֵ��
		
		//���ô���:˫������һ�����������(����)���޸ģ�����Ӱ��Է�����Ϊָ��ͬһ������
		//�������Ͳ����Ĵ��ݣ����÷��ı������ͽ��շ��Ĳ���������ָ�����ͬһ�������ַ(�ڴ��ַ)��
		//˫������һ�����������(����)���޸ģ�����Ӱ��Է�����Ϊָ��ͬһ������
		//�������ͱ�����������ָ��ĳ��������ڴ��ַ��
	}
	

	/**
	* ��������
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public static int add(int a, int b) {
		return (a + b);
	}

	public static double add(double a, double b) {
		return (a + b);
	}
	
	/**
	* ���д�ӡ�ַ���, System.out.println ��д
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public static void print(String str) {
		System.out.println(str);
	}
	
	/**
	* �ɱ����
	* JDK 1.5 ��ʼ��Java֧�ִ���ͬ���͵Ŀɱ������һ��������
	* һ��������ֻ��ָ��һ���ɱ�������������Ƿ��������һ���������κ���ͨ�Ĳ�����������֮ǰ������
	* ���ڿɱ�������������Ὣ��ת��Ϊһ�����飬���ں����ڲ����ɱ���������ɿ�����������
	* һ����������ֻ����һ���ɱ�������ҿɱ����Ϊ���һ��������
	* ���ڿɱ�������������Ὣ��ת��Ϊһ�����飬���ں����ڲ����ɱ���������ɿ�����������
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public static void printMax(double... params) {
		//���ڿɱ�������������Ὣ��ת��Ϊһ�����飬���ں����ڲ����ɱ���������ɿ�����������
		if (params.length == 0) {
			print("parameter len:0");
			return;
		}
		double result = params[0];
		for (int i = 1; i < params.length; ++i) {
			if (params[i] > result) {
				result = params[i];
			}
		}
		print("result:" + result);
		
		return;
	}
	

	/**
	* Java �����������ķ��������ڶ��������ռ�������(����)֮ǰ���ã������������ finalize( )��������������ն���
	* ���磬�����ʹ�� finalize() ��ȷ��һ������򿪵��ļ����ر��ˡ�
	* �� finalize() ����������ָ���ڶ�������ʱ��Ҫִ�еĲ�����
	* ��������������ô? destructor
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public static void finalizeTest() {
		Cake c1 = new Cake(1);
		Cake c2 = new Cake(2);
		c1 = c2 = null;
		
		System.gc(); //����Java�����ռ���
	}
}

// finalize test class
class Cake extends Object {
	private long id;
	public Cake(long id) {
		this.id = id;
		System.out.println("Cake" + id + " was created");
	}
	
	protected void finalize() throws java.lang.Throwable {
		super.finalize();
		System.out.println("Cake" + id + " was delete");
		// �ر��Ѵ��ļ�֮��Ĳ���
	}
}

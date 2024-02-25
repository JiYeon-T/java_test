package Demo;

public class Str {

	
	
	//����
	public static void main(String[] args) {
		//ʹ��String�����Ķ��󱣴��ڹ������У�ʹ��new����Ķ��󱣴��ڶ��ڴ���
		String s1 = "a";
		String s2 = "a";
		System.out.println("s1:" + s1 + "\ts2:" + s2);
		s1 = "b";
		System.out.println("s1:" + s1 + "\ts2:" + s2);
		String s3 = new String("abc");
		System.out.println("s3:" + s3 + ", �ַ����ĳ���:" + s3.length());
		s3 = "abcd";
		System.out.println("s3:" + s3 + ", �ַ����ĳ���:" + s3.length());
		System.out.println(s3.charAt(0));
		System.out.println(s3.hashCode());
		System.out.println("--------------------------");
		stringBuilderTest();
		
		System.out.println("--------------------------");
		stringBufferTest();
	}
	
	
	//String����һ���������ǲ��ɸı�ģ������Ҫһ�����Ըı���ַ��������Ƽ�StringBuffer��StringBuilder��
	//���Զ���޸ģ��Ҳ������µĶ���
	//StringBuilder��stringBuffer�����ٶȸ��죬����StringBuilder�̲߳���ȫ����֧��ͬ������
	//ͨ������ʹ��StringBuilder
	public static void stringBuilderTest() {
		StringBuilder sb = new StringBuilder(10);
		System.out.println(sb + ", capacity:" + sb.capacity());
		sb.append("hello.");
		System.out.println(sb + ", capacity:" + sb.capacity());
		sb.insert(3, "how are you");	//�Զ��������������
		System.out.println(sb + ", capacity:" + sb.capacity());
		sb.delete(0, 3);
		System.out.println(sb + ", capacity:" + sb.capacity());
	}
	
	//Ϊʲô��������Ϊstatic???????????????
	public static void stringBufferTest() {
		StringBuffer sb = new StringBuffer(100);
		System.out.println(sb + ", capacity:" + sb.capacity());
		sb.append("hello.");
		System.out.println(sb + ", capacity:" + sb.capacity());
		sb.insert(3, "how are you");	//�Զ��������������
		System.out.println(sb + ", capacity:" + sb.capacity());
		sb.delete(0, 3);
		System.out.println(sb + ", capacity:" + sb.capacity());
	}
	
}

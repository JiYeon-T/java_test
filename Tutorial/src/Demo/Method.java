package Demo;

public class Method {
	//java��Ϊÿһ�����Զ���ʼ��һ��Ĭ�Ϲ��캯�������η�(public, private, protected)��������η���ͬ
	//һ���㶨�����Լ��Ĺ��췽����Ĭ�Ϲ��췽���ͻ�ʧЧ��
	String name;
	public Method() {
		name = "This is a Method class object.";
	}
	//���ⷽ����ʹ��
	//main �����Ǳ� JVM ���õģ�����֮�⣬main ��������������ûʲô����
	
	//main����
	//�����в����ڳ������е�ʱ������ڳ������ֺ���
	public static void main(String[] args) {
		//
	}
	
	
	//java�ķ���ͬ��֧������
	//
	public static int getMax(int a, int b) {
		return a > b ? a : b;
	}
	
	public static float getMax(float a, float b) {
		return a > b ? a : b;
	}
}

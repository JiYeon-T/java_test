//package example;

//��̬������Ҳ��Ϊ��������������淶ͨ����ѭ�շ�������
//��̬������ͨ��ʹ��ȫ��д��ĸ������֮�����»��߷ָ����ⱻ��Ϊ"��д����������"��Upper Snake Case����
//���磺MY_STATIC_VARIABLE��

// Java ����:���շ�
public class VarNameExample {
	public final static int MAX_OBJ_NUM = 256; // ���� ��д������������ȫ��д��ĸ������֮�����»��߷ָ���
	public static int currObjNum = 0; // ��̬����/��Ա���� С�շ�
	
	public VarNameExample() {
		currObjNum += 1;
	}
	public static void main(String[] args) {
		System.out.println("Hello world");
		printSomethind(1.2);
	}
	
	// java ����/��ʽ������:С�շ�
	public static void printSomethind( double prtInfo ) {
		System.out.println( "double value is:" + prtInfo + "  MAX_OBJ_NUM:" + MAX_OBJ_NUM + "  currObjNum:" + currObjNum);
		VarNameExample example = new VarNameExample();
		System.out.println( "double value is:" + prtInfo + "  MAX_OBJ_NUM:" + MAX_OBJ_NUM + "  currObjNum:" + currObjNum);
	}

}

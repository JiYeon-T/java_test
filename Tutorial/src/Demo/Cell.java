package Demo;

//final
//- final �ؼ�����������԰��ඨ��Ϊ���ܼ̳еģ��������ࣻ
//- �������η������÷������ܱ�������д��
//- ʵ����������Ա����/���ԣ�Ҳ���Ա�����Ϊ final��������Ϊ final �ı������ܱ��޸ġ�
//- ������Ϊ final ��ķ����Զ�������Ϊ final������ʵ����������Ա����/���ԣ������� final
public class Cell {
	final int id = 123465;
	String name = "xibao";
	
	final String getName() {
		return name;
	}
	
	//test
	public static void main() {
		Cell c1 = new Cell();
		//c1.id = 12;	//
		c1.getName();
	}
}


package Demo;

public abstract class AbstractClass {
	//���һ����������ɸ����󷽷�����ô�����������Ϊ�����ࡣ��������Բ��������󷽷���
	//��������԰������󷽷��ͷǳ��󷽷���
	private String name;
	private int ID;
	
	//ʹ��Eclipse�Զ����ɵ� getter  �� setter ����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public abstract void showInfo();
	public abstract void eat();
}

//�̳г��������
class SubClass extends AbstractClass{
	//����ʵ�ֳ������ж���ķ���
	public void showInfo() {
		;
	}
	public void eat() {
		;
	}
}


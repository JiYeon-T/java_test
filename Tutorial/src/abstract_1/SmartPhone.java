package abstract_1;

//Ϊĳһ����ʵ��һ���ӿ�
public class SmartPhone extends Phone implements CanPlayGame {
	//ʵ�ֳ�����ķ���
	public void call() {
		System.out.println("ʹ�ô���������绰");
	}
	public void sendMessage() {
		System.out.println("ʹ�ô�����������Ϣ");
	}
	
	//ʵ�ֽӿڵķ���
	public void playGame() {
		System.out.println("������������Ϸ�Ľӿ�.");
	}
	
}

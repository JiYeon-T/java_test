package Demo;

public class MultiThread {
	//Ϊ��ʵ��һЩ�����Ĺ��ܣ�Java Ҳ�ṩ�����Ƿ������η���
	//synchronized �� volatile ���η�����Ҫ�����̵߳ı�̡�
	
	//synchronized
	//synchronized �ؼ��������ķ���ͬһʱ��ֻ�ܱ�һ���̷߳��ʡ�
	//synchronized ���η�����Ӧ�����ĸ��������η���
	public synchronized void getMutex() {
		
	}
	
	//transient
	//���л��Ķ�������� transient ���ε�ʵ������ʱ��java �����(JVM)�������ض��ı�����
	//�����η������ڶ������������У�����Ԥ������ͱ������������͡�
	public transient int a = 1;
	public int b = 2;
	
	//volatile
	//volatile ���εĳ�Ա������ÿ�α��̷߳���ʱ����ǿ�ƴӹ����ڴ������¶�ȡ�ó�Ա������ֵ��
	//���ң�����Ա���������仯ʱ����ǿ���߳̽��仯ֵ��д�������ڴ档�������κ�ʱ�̣�������ͬ���߳����ǿ���ĳ����Ա������ͬһ��ֵ��
	public volatile boolean flag = false;
	public void run() {
		flag = true;
		while(flag) {
			//
		}
	}
	public void stop() {
		flag = false;
	}
	//ͨ������£���һ���̵߳��� run() �������� Runnable �������̣߳�������һ���̵߳��� stop() ������ 
	//��� ��һ�� �л������� active ֵ��ʹ�ã���ô�� �ڶ��� �� active ֵΪ false ʱѭ������ֹͣ��
	//�������ϴ���������ʹ���� volatile ���� active�����Ը�ѭ����ֹͣ��
	
}

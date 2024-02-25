package Class;

//����һ����
public class Phone {
	public float getCpu() {
		return cpu;
	}
	public void setCpu(float cpu) {
		this.cpu = cpu;
	}
	public float getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(float screenSize) {
		this.screenSize = screenSize;
	}
	@Override
	public String toString() {
		return "Phone [cpu=" + cpu + ", screenSize=" + screenSize + ", name=" + name + ", ID=" + ID + ", getCpu()="
				+ getCpu() + ", getScreenSize()=" + getScreenSize() + ", getName()=" + getName() + ", getID()="
				+ getID() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public float getName() {
		return name;
	}
	public void setName(float name) {
		this.name = name;
	}
	//����phone��Ĺ��캯��
	//���캯������ͬ����û�з���ֵ�����Դ��Σ�Ҳ���Բ���	
	public Phone(){
		System.out.println("Phone's constructor was called.");
	}
	//���ι���
	public Phone(float cpu_, float size_, float name_){
		System.out.println("Phone's parameter constructor was called.");
		cpu = cpu_;
		screenSize = size_;
		name = name_;
		System.out.println("cpu:" + cpu + "\nscreen_size:" + screenSize + "\nname:" + name);
	}
	
	//��������
	public float cpu;
	float screenSize;
	float name;
	
	//˽�г�Ա
	private int ID;
	
	//˽�г�Ա��Ҫ����getter/setter
	public void setID(int val) {
		ID = val;
	}
	public int getID() {
		return ID;
	}
	
	
	//���巽��
	void call() {
		System.out.println("Call someone.");
	}
	void sendMessage() {
		System.out.println("send message to someone.");
	}
}


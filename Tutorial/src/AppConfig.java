

/** ��̬�������� */
//ʹ�þ�̬�������洢ȫ��״̬��������Ϣ
//��Щ��̬�����洢��ȫ��������Ϣ����������������ʹ�ã����Ҳ��ᱻ�޸ġ�
//�������չʾ�˾�̬��������һ������Ӧ�ã�ͨ�������ǿ��Ժܷ���ش洢ȫ��������Ϣ������ʵ��������Ҫȫ�ֹ�������ݡ�
public class AppConfig {
	public static final String APP_NAME = "MyApp";
	public static final String APP_VERSION = "1.0.0";
	public static final String DATABASE_URL = "jdbc:mysql://localhost:3306/mydb";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAppConfigInfo();
	}

	public static void printAppConfigInfo() {
		System.out.println("APP_NAME:" + APP_NAME);
		System.out.println("APP_VERSION:" + APP_VERSION);
		System.out.println("DATABASE_URL:" + DATABASE_URL);
	}
}

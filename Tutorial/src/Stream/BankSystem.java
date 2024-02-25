package Stream;

public class BankSystem {

	//ʹ�ð����Լ�������쳣��:InsufficientFundsException
	//ģ�������˻�ȡǮ����ǰ������
	
	private double balance = 100;
	private int ID;
	
	//����һ���û�
	public BankSystem( int number, double balance ) {
		this.ID = number;
		this.balance = balance;
	}
	
	//��Ǯ
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	//ȡǮ
	//�׳��쳣�ķ�����ʹ�õ�ʱ��Ҫ�����쳣����
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount <= balance) {
			System.out.println("-500");
			balance -= amount;
		}
		else {
			//������Ҫ��Ǯ
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);	//�׳��쳣�����ô��ι��캯��
		}
	}
	
	//�������
	public double getBalance() {
		return balance;
	}
	
	//�����˺�
	public int getID() {
		return ID;
	}
	
	//��ӡ����˻�����Ϣ
	public void ShowAccountInfo() {
		System.out.println("----------Account Information---------");
		System.out.println( "Account Number:" + ID + "\nBalance:" + balance );
		System.out.println("--------------------------------------");
	}
	
	public static void main(String[] args) {
		//���������в���
		BankSystem BillGates = new BankSystem(100001, 1000.2);
		BillGates.deposit(1000.2);		//��Ǯ
		BillGates.ShowAccountInfo();
		try {
			BillGates.withdraw(5000);
		}catch(InsufficientFundsException e) {	//�������쳣���������
			System.out.println("Insufficient balance, you nedd deposit : " + e.getAmount());
			e.printStackTrace();
		}finally {
			BillGates.ShowAccountInfo();
		}
	}
}

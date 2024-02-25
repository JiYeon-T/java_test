package Stream;

public class BankSystem {

	//使用包中自己定义的异常类:InsufficientFundsException
	//模拟银行账户取钱，存前等流程
	
	private double balance = 100;
	private int ID;
	
	//创建一个用户
	public BankSystem( int number, double balance ) {
		this.ID = number;
		this.balance = balance;
	}
	
	//存钱
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	//取钱
	//抛出异常的方法，使用的时候要进行异常处理
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount <= balance) {
			System.out.println("-500");
			balance -= amount;
		}
		else {
			//额外需要的钱
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);	//抛出异常，调用带参构造函数
		}
	}
	
	//返回余额
	public double getBalance() {
		return balance;
	}
	
	//返回账号
	public int getID() {
		return ID;
	}
	
	//打印这个账户的信息
	public void ShowAccountInfo() {
		System.out.println("----------Account Information---------");
		System.out.println( "Account Number:" + ID + "\nBalance:" + balance );
		System.out.println("--------------------------------------");
	}
	
	public static void main(String[] args) {
		//对这个类进行测试
		BankSystem BillGates = new BankSystem(100001, 1000.2);
		BillGates.deposit(1000.2);		//存钱
		BillGates.ShowAccountInfo();
		try {
			BillGates.withdraw(5000);
		}catch(InsufficientFundsException e) {	//传过来异常对象的引用
			System.out.println("Insufficient balance, you nedd deposit : " + e.getAmount());
			e.printStackTrace();
		}finally {
			BillGates.ShowAccountInfo();
		}
	}
}

package Stream;

//import java.io.*;


//�Լ�������쳣�� ��Ҫ�̳� Exception���쳣��
public class InsufficientFundsException extends Exception {
	private double amount;
	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}
	
	//getter and setter
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
	
package Stream;

//import java.io.*;


//自己定义的异常类 需要继承 Exception等异常类
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
	
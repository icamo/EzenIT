
public class Account {
	
	String accNum;
	String accName;
	int balance;
	
	public Account(String accNum, String accName, int balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	
	public void setDeposit(int money) {
		this.balance = this.balance + money;
	}
	
	public void setWithdraw(int money) {
		this.balance = this.balance - money;
	}
	
	public void print() {
		System.out.println(accNum + "\t" + accName + "\t" + balance);
	}
	
	
	
}

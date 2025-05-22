package homework_mine.accountbank;

public class Account {
	private String accountNumber;
	private int balance;
	
	public Account() {
		
	}
	
	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
		System.out.println(accountNumber + " 계좌에서 " + amount + "원 입금");
		System.out.println("잔액 : " +balance);
	}
	
	public void withdraw(int amount) {
		this.balance -= amount;
		System.out.println(accountNumber + " 계좌에서 " + amount + "원 출금");
		System.out.println("잔액 : " +balance);
	}
}

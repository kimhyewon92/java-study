package homework.object.accountBank;

public class Main {
	
	public static void main(String[] args) {
		Account acc1 = new Account("123-456-789", 100000);
		Account acc2 = new Account("987-654-321", 50000);
		
		Bank bank = new Bank();
		bank.transfer(acc1, acc2, 50000);

//		System.out.println(acc1.getAccountNumber());
//		System.out.println(acc2.getAccountNumber());
		
		System.out.println("계좌: " + acc1.getAccountNumber() + ", 잔액: " + acc1.getBalance());
		System.out.println("계좌: " + acc2.getAccountNumber() + ", 잔액: " + acc2.getBalance());
	}
	
}

package homework.accountbank;

public class Main {
	
	public static void main(String[] args) {
		Account acc1 = new Account("123-456-789", 100000);
		Account acc2 = new Account("987-654-321", 50000);
		
		acc1.deposit(30000);
		acc2.withdraw(100000);
		
		Bank bank1 = new Bank();
//		bank1.transfer(acc1.getAccountNumber(), acc2.getAccountNumber(), 50000);
	}
	
}

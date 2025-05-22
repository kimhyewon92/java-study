package homework_mine.accountbank;

public class Bank {

	void transfer(Account sender, Account receiver, int amount) {
		sender.withdraw(amount);
		receiver.deposit(amount);
		System.out.println(sender.getAccountNumber() + " 에서 " + receiver.getAccountNumber() + " 으로 " + amount + "원 송금");
	}
}

package homework.accountbank;

public class Bank {

	void transfer(Account sender, Account receiver, int amount) {
		System.out.println(sender + "에서" + receiver + "으로" + amount + "원 송금");
	}
}

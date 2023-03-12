package Baitapchuyentien;

public class Main {
	public static void main(String[] args) {
		Account account1 = new Account("1", "User A", 3000);
		Account account2 = new Account("2", "User B", 5000);
		account1.credit(2000);
		System.out.println(account1.getBalance());
		account1.debit(1000);
		System.out.println(account1.getBalance());
		account1.transferTo(account2, 2000);
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
	}
}
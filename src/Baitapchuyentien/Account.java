package Baitapchuyentien;

import java.util.Scanner;

public class Account {
	private String id;
	private String name;
	private int balance = 0;

	public Account(String id, String name, int balace) {
		this.id = id;
		this.name = name;
		this.balance = balace;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void credit(int amount) {
		if (amount < 0) {
			System.out.println("Số tiền nhập không chính xác");
		} else {
			this.balance = balance + amount;
			System.out.println("Nạp tiền thành công,số tiền tài khoản là:" + balance);
		}
	}

	public void debit(int amount) {
		if (amount <= 0) {
			System.out.println("Số tiền nhập không chính xác");
		} else {
			if (balance >= amount) {
				this.balance = balance - amount;
				System.out.println("Thanh toán thành công, số tiền còn lại là:" + balance);
			} else {
				System.out.println("Số tiền trong tài khoản không đủ" + balance);
			}
		}
	}
	public void transferTo(Account account, int amount) {
        if(amount > balance) {
            System.out.println("Chuyển tiền không thành công. Số dư tài khoản không đủ.");
        } else {
            balance -= amount;
            account.credit(amount);
            System.out.println("Chuyển tiền thành công.");
        }
    }
}

package homework9;

public class constructIsToPassMessage {

	public static void main(String[] args) {

		Account2 account = new Account2();
		Mom2 mom = new Mom2(account,"mom");
		Bear2 bear = new Bear2(account, mom.t);
		bear.start();
	}
}

class Mom2 implements Runnable {
	Account2 account;
	Thread t;
	String name;

	public Mom2(Account2 account, String name) {
		this.account = account;
		this.name = name;
		t = new Thread(this, name);
		t.start();
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			account.deposit(3000, t);
		}
	}
}

class Bear2 extends Thread {
	Account2 account;
	Thread t;
	public Bear2(Account2 account, Thread t) {
		this.account = account;
		this.t = t;
	}

	@SuppressWarnings("deprecation")
	public void run() {
		
//		Account account = new Account();
//		Mom mom = new Mom(account, "mom");
		
		for (int i = 1; i <= 10; i++) {
			account.withdraw(1000,"Bear");
			if (i == 10) {
				t.stop();
			}
		}
	}
}
class Account2{
	private int balance = 0;
	String name;
	
	synchronized public void withdraw(int amount ,String name){
		while(balance < amount){
			System.out.println("帳戶餘額低於熊大要提款的金額,暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.printf("%s提款的金額%d, 帳戶餘額%d %n", name, amount, balance);
		if(balance < 1000){
			System.out.println("帳戶餘額在1000元以下,熊大要求媽媽匯款給他");
			notify();
		}
	}
	synchronized public void deposit(int amount, Thread t){
		
		while(balance > 3000){
			System.out.println("熊大帳戶的餘額在3000元以上");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += amount;
		
		System.out.printf("%s匯款的金額%d, 帳戶餘額%d %n", t.getName(), amount, balance);
		notify();
	}
}
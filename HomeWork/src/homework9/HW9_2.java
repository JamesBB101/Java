package homework9;

public class HW9_2 {

	public static void main(String[] args) {
//		熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額在2000元以上,
//		就會停止匯款給熊大;但要是帳戶餘額在1000元以下,熊大就會要求媽媽匯款給他。
//		如果帳戶餘額低於熊大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢已經入帳戶。假設媽媽一次匯款2000 元,
//		熊大一次提款1000元,寫一個Java程式模擬匯款10次與提款10次的情形。• 
//		參考範例：TestWaitNotify.java

		Account account = new Account();
//		Mom mom = new Mom(account,"mom");
		Bear bear = new Bear(account);
		bear.start();
	}
}

class Mom implements Runnable {
	Account account;
	Thread t;
	String name;

	public Mom(Account account, String name) {
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

class Bear extends Thread {
	Account account;

	public Bear(Account account) {
		this.account = account;
	}

	@SuppressWarnings("deprecation")
	public void run() {
		
		Account account = new Account();
		Mom mom = new Mom(account, "mom");
		
		for (int i = 1; i <= 10; i++) {
			account.withdraw(1000,"Bear");
			if (i == 10) {
				mom.t.stop();
			}
		}
	}
}
class Account{
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
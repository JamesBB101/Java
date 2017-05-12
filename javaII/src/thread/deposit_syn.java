package thread;

import java.io.PrintWriter;

public class deposit_syn {

	public static void main(String[] args) {
		
		PrintWriter out = new PrintWriter(System.out,true);
		//System類別已經定義out變數是PrintStream的型態
		
		Account account = new Account(out);//所以建構子傳入=接好OutputStream的水管
		DepositThread first, second;
		first = new DepositThread(account, 1000, "No1");
		second = new DepositThread(account, 1000, "\t\t\tNo2");
		first.start();
		second.start();
		try {
			first.join();
			second.join();
		} catch (InterruptedException e) {
		}
		// print the final balance  為了讓main()最後執行總餘額所以加join()
		out.println("*** Final balance is " + balance);
	}
	static int balance = 1000;
}
class Account{
	
	PrintWriter out;
	
	Account(PrintWriter out){//所以建構子傳入=接好OutputStream的水管
		this.out = out;
	}
//	synchronized 
	void deposit(int depositAmount , String name){  
		out.println(name + " . want to deposit : " + depositAmount);
		synchronized(this){
		out.println(name + " . getting balance : " + getBalance());
		out.println(name + " . setting balance... " );
		setBalance(depositAmount);
		}
		out.println(name + " . new balance set to " +deposit_syn.balance);
	}
	int getBalance(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return deposit_syn.balance;
	}
	void setBalance(int depositAmount){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		deposit_syn.balance += depositAmount;
	}
}
class DepositThread extends Thread{
	Account account;  //同一個 package 可以呼叫
	int depositAmount;
	String name;
	DepositThread(Account account,int depositAmount,String name){
		this.account = account;
		this.depositAmount = depositAmount;
		this.name = name;
	}						//建構子只是用來設定參數   真正執行在run()
	public void run(){		//建構子傳入3個參數   用物件呼叫方法在傳入2個參數
//		synchronized(account){
		account.deposit(depositAmount, name);
//		}
	}
}



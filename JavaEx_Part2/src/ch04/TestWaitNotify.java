package ch04;

class Depot {
	private int stock = 0; // 庫存量

	synchronized public void produce(int qty) { // 每次生產4個
		while (stock > 20) {
			System.out.println("庫存量超過20，暫停生產");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stock += qty;
		System.out.println("產量：" + qty + "；庫存量：" + stock);
		notify();   //通知在poll的執行緒去read
	}

	synchronized public void consume(int qty) { // 每次消費3個
		while (stock < qty) {	  //庫存<消費 3
			System.out.println("庫存量不足，暫停消費");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stock -= qty;
		System.out.println("消費量：" + qty + "；庫存量" + stock);
		if (stock < 5) {
			System.out.println("庫存量低，催促生產");
			notify();  
		}
	}
}

class Producer extends Thread {
	Depot depot;

	public Producer(Depot depot) {  //depot傳到Producer   Producer就可以使用depot的方法
		this.depot = depot;		//建構子用來設定參數
	}

	public void run() {		//實際執行由run()
		for (int i = 1; i <= 10; i++)
			depot.produce(4); // 每次生產4個
	}
}

class Consumer extends Thread {
	Depot depot;

	public Consumer(Depot depot) {	//建構子用來設定參數
		this.depot = depot;
	}

	public void run() {			//實際執行由run()
		for (int i = 1; i <= 10; i++)
			depot.consume(3); // 每次消費3個
	}
}

public class TestWaitNotify {
	public static void main(String[] args) {
		Depot depot = new Depot();  //倉庫
		Producer producer = new Producer(depot);
		Consumer consumer = new Consumer(depot);
		producer.start();
		consumer.start();
	}
}

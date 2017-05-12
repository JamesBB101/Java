package ch04;

public class PoliteRunner extends Thread {

	private int tick = 1;
	private int num;

	public PoliteRunner(int num) {
		this.num = num;
	}

	public void run() {
		while (tick < 4000000) { // 原來為400000
			tick++;
			if ((tick % 50000) == 0) {
				System.out.println("Thread #" + num + ", tick = " + tick);
				yield();   //自願移出執行(Running)狀態至預備(Ready)狀態
							//對Priority相等的數個執行緒有效
			}
		}
	}
}

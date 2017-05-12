package thread;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

	public static void main(String[] args) {
		Timer timer = new Timer();
		MyTask1 mt1 = new MyTask1();
		timer.schedule(mt1, 500, 1000);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timer.cancel();
	}
	
	private static class MyTask1 extends TimerTask{
		int i=0;
		@Override
		public void run() {
			System.out.println("OK " + i++);
		}
	}

}

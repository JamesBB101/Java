package ch05_schedule;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;


public class Scheduler {
	public static void main(String[] args) {

		Timer timer = new Timer();

		Calendar cal = new GregorianCalendar(2017, Calendar.FEBRUARY, 1, 0, 0, 0);
							//建立GregorianCalendar指定時間 (年,月,日,時,分,秒)
		timer.scheduleAtFixedRate(new MyAnotherTask(), cal.getTime(), 1 * 60 * 1000);
		
				//schedule依照MyAnotherTask作        現在開始        一分鐘一次
		
//		timer.schedule(new MyAnotherTask(), cal.getTime(), 1 * 60 * 1000);
	}		//schedule()只會從現在開始計算     
	
}
class MyAnotherTask extends TimerTask {
	int count = 0;
	@Override
	public void run() {
		System.out.println("This is Task" + count);
		System.out.println("工作排定的時間 = " + new Date(scheduledExecutionTime()));
		System.out.println("工作執行的時間 = " + new Date() + "\n");
		count++;
	}

}
package ch05_schedule;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("執行時間為： " + new Date());
		
	}//建立一條執行緒  時間到執行
}

package ch05_schedule;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class TestSchedule {
	
	public static void main(String[] args) {
		TestSchedule ts = new TestSchedule();  //自己類別建立自己物件
//		ts.testDelayTask();
//		ts.testDelayAndPeriod();
		ts.testDateAndPeriod();
	}
	
	private void testDelayTask() {
		
		Timer timer = new Timer();
		
		System.out.println("Delay 1 seconds.");
		System.out.println("Start Time: " + new Date());
		
		timer.schedule(new MyTask(), 2000); //(要作什麼,開始到現在隔多久)
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
			
		}
		timer.cancel();
		System.out.println("End Time: " + new Date());  //sleep(2000)同時結束  整支程式2秒結束
	}
	
	private void testDelayAndPeriod() {
		Timer timer = new Timer();
		
		System.out.println("Delay 5 seconds. Period 2 seconds.");
		System.out.println("Start Time: " + new Date());
		
		timer.schedule(new MyTask(), 5000, 2000);
		
		try {
			Thread.sleep(10000);		//  整支程式10秒結束
		} catch (InterruptedException ie) {
			
		}
		timer.cancel();
		System.out.println("End Time: " + new Date());
	}
	
	private void testDateAndPeriod() {
		Timer timer = new Timer();
		
		Calendar calendar = Calendar.getInstance();  //取得Calendar物件
		calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) + 15);	//set(int field, int value)
			//修改時間的格式				//取得Calendar的秒數+15秒
		Date firstTime = calendar.getTime();		
		
		System.out.println("Start Time: " + new Date());
		System.out.println("設定執行Date為15秒後：" + firstTime + ", Period：10 seconds.");
		
		timer.schedule(new MyTask(), firstTime, 10000);  //(印出執行時間, 開始為Start Time+15秒, 10秒作一次)
		
		try {
			Thread.sleep(30000);  //30秒後成是結束
		} catch (InterruptedException ie) {
			
		}
		timer.cancel();
		System.out.println("End Time: " + new Date());
		
	}
	
}

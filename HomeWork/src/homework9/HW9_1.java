package homework9;

public class HW9_1 {

	public static void main(String[] args) {
//		練習作業
//		•開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
//		•每個動作都以Thread.sleep()暫停一下,以達到顯示效果。Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
//		•參考範例：CounterRunnable.java
//		•需留意主執行緒執行順序
		
//		eater e1 = new eater("james");
//		eater e2 = new eater("pon");
//		Thread t1 = new Thread(e1);
//		Thread t2 = new Thread(e2);

		eater[] et = new eater[NUMContestant];
		et[0] = new eater("james");
		et[1] = new eater("pon"); 
		System.out.println(" Eating Contest Start");
		
		eater.read = true;
		
		for(int i=0;i<NUMContestant;i++){
			try {
				et[i].t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(" Eating Contest End ");
	}
	static int NUMContestant =2;
}
class eater implements Runnable{
	String name;
	Thread t;
	static boolean read = false;
	public eater(String name){
		this.name=name;
		t = new Thread(this,name);
		t.start();
	}
	public void run(){
		while(!read){
			
		}
		for(int i=1;i<11;i++){
			System.out.println(name +" eat : " + i);
			int millis = (int)((Math.random()*2500)+500);
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println( t +" Winner ");
	}
}

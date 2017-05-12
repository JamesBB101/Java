package thread;

public class yield {
	
	public static void main(String[] args) {
		PoliteRunner[] runners = new PoliteRunner[NUMRUNNERS];
		for(int i=0;i<NUMRUNNERS;i++){
			runners[i] = new PoliteRunner(i);
			runners[i].setPriority(NUMRUNNERS);
		}
		for(int i=0;i<NUMRUNNERS;i++){
			runners[i].start();
		}
	}
	static int NUMRUNNERS = 2;
}
class PoliteRunner extends Thread{
	int tick = 1;
	int num;
	public PoliteRunner(int num){
		this.num=num;
	}
	@Override
	public void run() {
		while(tick<400000000){
			tick++;
			if((tick%50000)==0){
				System.out.println(num+" : "+tick);
				yield();  //自願移出執行(Running)狀態至預備(Ready)狀態
			}			//對Priority相等的數個執行緒有效
		}			//繼承Thread 直接用父類別方法
	}
}

//1.自私的執行緒擁有"密實迴圈(tight loop)" . 如上面所示之 while loop. 
//2.該迴圈會佔住CPU不放, (尤其, 如果系統不支援Time-Slice則易完全獨佔 ) 除非: yield() 或式更高的priorityThread進入


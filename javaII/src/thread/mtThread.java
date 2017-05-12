package thread;

public class mtThread {

	public static void main(String[] args) {
//		myThread[] mt = new myThread[3];
//		mt[0] = new myThread();
//		mt[1] = new myThread("mt2",3,true);
//		mt[2] = new myThread("mt3",9,false);
//		for(int i=0;i<mt.length;i++){
//			mt[i].start();		//Thread呼叫run()
//		}
//		myThread.read=true;
		
		myThread2 nt1 = new myThread2("NT1");
		myThread2 nt2 = new myThread2("NT2");  //new出3條thread
		myThread2 nt3 = new myThread2("NT3");
								       //nt1,2,3只是Runnable的物件,呼叫Thread中的方法
		System.out.println("開始 Thread NT1 is alive: " + nt1.t.isAlive());
		System.out.println("開始 Thread NT2 is alive: " + nt2.t.isAlive());  //驗證3條thread是否活著
		System.out.println("開始 Thread NT3 is alive: " + nt3.t.isAlive());
		
		String name = Thread.currentThread().getName();	 //在main()內的Thread
		try {
			System.out.println(" [主執行緒: " + name + "]開始等候以上執行緒結束.....");
			nt1.t.join();   	//等待當前執行緒執行完main{}才執行
			nt2.t.join();		//mainThread 等待3把鑰匙才能結束
			nt3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");  //main中斷
		}
		
		System.out.println("後來 Thread NT1 is alive: " + nt1.t.isAlive());
		System.out.println("後來 Thread NT2 is alive: " + nt2.t.isAlive());
		System.out.println("後來 Thread NT3 is alive: " + nt3.t.isAlive());
		
		// 等以上執行緒結束後,最後才執行此段程式碼
		System.out.println(" 最後" + " [主執行緒: " + name + "]結束exiting !");

	}
}
class myThread extends Thread{	//繼承Thread就是要改寫run()
	static boolean read =false;	//要使用Thread就是要改寫run()
	public myThread() {
		super("mt1");
	}
	public myThread(String name,int priority,boolean isDaemon){
		super(name);
		setPriority(priority);
		setDaemon(isDaemon);		//背景執行緒
	}
	public void run(){	//執行緒執行的地方
		while(!read){
		}
//		String nameofcurrentThread = Thread.currentThread().getName();
//		System.out.println("ThreadName"+nameofcurrentThread);
		System.out.println(
				"My name is: " + getName()
				+"| My priority is: "+getPriority()
				+"| Am I alive: "+isAlive()
				+"| Am I daemon: "+isDaemon());
	}
}
class myThread2 implements Runnable{  //現在實作Runnable改寫run()  
	String name;
	Thread t;
	myThread2(String name){
		this.name=name;					//(Runnable,threadName)
		t = new Thread(this,name);  //建構子內即同時建構執行緒,沒有Thread就沒有辦法使用run()
		System.out.println("myThread: "+t);  //Thread物件名稱
		t.start();		//建構子內即同時執行run()
	}
	@Override
	public void run() {
		for(int i=2;i>0;i--){
			System.out.println(name+":"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+" exiting");
	}
}

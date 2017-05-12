package ch04;

public class TestMyThread {

	public static void main(String[] args) {
		 MyThread nt[] = new MyThread[] {
		                 new MyThread(),                //預設Priority:5
		                 new MyThread("NT2", 2),		
		                 new MyThread("NT3", 3),		
		                 new MyThread("NT6", 6, true),	
		                 new MyThread("NT9", 9, true)	
		                 };

		        for (int i = 0; i < nt.length; i++)
		            nt[i].start();    		//都在while{}裡執行

		        //將執行緒物件中的ready變數設為true時， 才會離開永久迴圈而執行下去		       
		        MyThread.ready = true;
	}

}

package exception_CH1;

public class tryCatchFinally {

	public static void main(String[] args) {
		int a=0,b=10;
		try{
			System.out.println(b/a);
			System.out.println("Game Over");
		}catch(ArithmeticException c){
			System.out.println("Test A");
		}finally{
			System.out.println("OK");
		}

	}

}
//第8列拋出例外  跳過第9列   被catch捕捉到   處理例外
//int a=0,b=10
//System.out.println(b/a);
//將console發生的例外訊息複製貼在catch
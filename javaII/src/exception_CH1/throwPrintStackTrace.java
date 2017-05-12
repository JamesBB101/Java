package exception_CH1;

public class throwPrintStackTrace {

	public static void main(String[] args) {
		try{
			method(1,0);
		}catch(ArithmeticException a){
			a.printStackTrace();            //逐步尋找拋出錯誤訊息的程式
//			System.out.println(a.getMessage());   //印出例外物件的訊息
		}
		
	}

	public static double method(double i,double j) throws ArithmeticException{
		double result;
		if(j == 0){
			throw new ArithmeticException("j=0");
		}
		result =i/j;
		return result;
	}
}
package exception_CH1;

public class Multi_InnerClass {
	
	public static class ExceptionA extends Exception{	}
	public static void methodA(String exceptionName) throws ExceptionA{
		if(exceptionName.equals("A")){
			throw new ExceptionA();
		}
	}
	public static class ExceptionB extends Exception{  	}
	public static void methodB(String exceptionName) throws ExceptionB{
		if(exceptionName.equals("B")){
			throw new ExceptionB();
		}
	}
	public static class ExceptionC extends ExceptionB{	}
	public static void methodC(String exceptionName) throws ExceptionC {
		if (exceptionName.equals("C")) {
			throw new ExceptionC();
		}
	}
	
//	static class ExceptionD extends Exception {
//	}
	
	public static void methodD(String exceptionName) 
			throws ExceptionA, ExceptionB {
//		try {
//			if (exceptionName.equals("D")) {
//				throw new ExceptionA();
//			} else {
//				throw new ExceptionB();
//			}
//		} catch (Exception A) {     //可放共同父類別
//			throw A;        //Exception
//		}
		if (exceptionName.equals("D")) {
			throw new ExceptionA();
		} else {
			throw new ExceptionB();
		}
	}
	
	public static void main(String[] args) {
		try {
			methodA("A");
			methodB("B");
		} catch (ExceptionA  | ExceptionB   e) {   //A,B獨立關係//catch括號內的例外類型不可有繼承關係
			e.printStackTrace();
		}
		
		try {
			methodD("D");
		} catch (ExceptionA | ExceptionB e) {
			e.printStackTrace();
			System.out.println();
		}
	}
}

//子類別覆寫父類別 throws的方法時，子類別所 throws的 Exception 必須與父類別被覆寫方法的 Exception 一樣或是更低階
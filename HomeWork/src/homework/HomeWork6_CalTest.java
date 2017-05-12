package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork6_CalTest {

	public static void main(String[] args) {
//		請設計兩個類別CalException.java與CalTest.java，在CalTest.java裡有個自訂方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。使用者可以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
//		1. x與y同時為0，(產生CalException的例外物件)
//		2. y為負值，而導致x的y次方結果不為整數
//		3. x與y皆正確情況下，會顯示運算後結果	
		
//		Scanner sc = new Scanner(System.in);
		boolean temp=true;
		while(temp){
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入X值");
				int a = sc.nextInt();
				System.out.println("請輸入Y值");
				int b = sc.nextInt();
				powerXY(a, b); // 使用這個方法諾發生下列情形將被丟出自定例外
				temp = false; // 沒有執行到這一步驟 while迴圈將一直持續
			} catch (InputMismatchException im) {
				System.out.println("NOT NUMBER");
			} catch (CalException ce) {
				System.out.println(ce.getMessage()); // 例外處理 物件呼叫getMessage()	// 繼承父類別變數&方法											
			}
		}
	}
	static void powerXY(int x, int y) throws CalException {

		if (x == 0 && y == 0) {
			throw new CalException("x與y同時為0");  //諾丟出例外 new(運算子)同時藉由建構子傳入String
		} else if (y < 0) {
			throw new CalException("y<0");
		} else {
			System.out.println("X的Y次方:"+(int)(Math.pow(x, y)));
		}
	}
}
class CalException extends Exception{
	public CalException(){
		
	}
	public CalException(String message){
		super(message);  //借用父類別建構子  同時傳入Message 字串
	}
}



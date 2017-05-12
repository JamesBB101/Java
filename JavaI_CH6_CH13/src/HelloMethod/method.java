package HelloMethod;

import java.util.Scanner;

public class method {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		System.out.println(square(A));
		
		print("HELLO");//String something="Hello";print(something);
		
	}
	public static int square(int B){
		return B*B;
	}
	public static void print(String C){
		System.out.println(C);
	}
}
/*public宣告    型態  方法  型態  名稱   //修飾子+回傳型態+方法名稱+(型態 變數)
 *型態 名稱 =方法   (參數)     
 *int a=square(X)
 *void不用回傳
 */

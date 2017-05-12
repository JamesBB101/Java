package HelloMethod;

import java.util.Scanner;

public class usemethod {

	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		int input = A.nextInt();
		System.out.println(areaMeasure(input));  //輸入一個值進去後會回傳一個面積
	}
	public static double areaMeasure(double radius){
		return radius*radius*3.14;
	}
}
//宣告一個方法
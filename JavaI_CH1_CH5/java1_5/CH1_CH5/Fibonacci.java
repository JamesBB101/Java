package CH1_CH5;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int sum=0;
		int a=1;
		int b=0;
		Scanner S=new Scanner(System.in);
		System.out.println("請輸入數字 ");
		int input=S.nextInt();
		switch(input){
		case(0):
			System.out.println("0 ");
		    break;
		default:
			System.out.print("0 1 ");
			for(int i=2;i<=input;i++){
				sum=a+b;
				System.out.print(sum+" ");
				b=a;
				a=sum;
			}
		}
	}
}

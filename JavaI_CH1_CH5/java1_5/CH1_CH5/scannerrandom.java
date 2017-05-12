package CH1_CH5;

import java.util.Scanner;

public class scannerrandom {

	public static void main(String[] args) {
		float number = (float)Math.random();
		number *=1000.0f;
		int number2 = (int) number;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<=1000 ; i++){
		int guess = scanner.nextInt();
		
		if(guess>number2){
			System.out.println("too large");
		}
		else if(guess<number2){
			System.out.println("too small");
		}
		else
			System.out.println("BINGO");
		}
	}
}
//Scanner scanner = new Scanner(System.in);
//for整個迴圈
//int input = scanner.nextInt();

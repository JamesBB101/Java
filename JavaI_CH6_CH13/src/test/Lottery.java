package test;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		ConsoleLottery bet = new ConsoleLottery(49); // Largest Lottery number (
														// 1 to number)
		bet.becomePoorer();
	}
}

// Implement Lottery by Console
class ConsoleLottery extends LotteryBet {
	private Scanner s = new Scanner(System.in);

	public ConsoleLottery(int last) {
		super(last);
		System.out.println("Lottery Game start");
	}

	// Enter numbers that you dislike by Console
	@Override
	protected int shooseNumber() {
		return s.nextInt();
	}

	@Override
	protected void showSomething(String message) {
		System.out.println(message);
	}

	// show 6 lucky numbers
	@Override
	protected void showBalls(int[] ser) {
		System.out.println("Lucky number is ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d\t", ser[i]);
		}
	}
}

// Template Method Pattern : Lottery Core
abstract class LotteryBet{
			
			private int[] ser;
			private int[] ballsPicked;
			protected int last;
			protected int disLike;

			// Constructor
			// input 49(length) -> product array(0 to 48) -> for real number 1 to 49
			public LotteryBet(int last){
				this.last = last;
				ser = new int[last];		// Lottery number from     1 ~ last 
				
				// for array(0) = 1, array(1) = 2, ... , array(48) = 49   ...... >> total number 49
				for (int i = 0; i < ser.length ; i++){
					ser[i] = i + 1;
				}
			}
			
			private int[] randomBalls(int disLike){
				
				ser[disLike - 1] = ser[0];			// the disLike will no longer picked 	ex: number 4

				int rnd;
				ballsPicked = new int[6];
				
				for (int x = 0 ; x < 6 ; x++){
					rnd = (int)(Math.random() * (last - 2 - x)) + x + 1;			// random Array[x](ex: 1~48)	ex: 2
					ballsPicked[x] = ser[rnd];									// lastArrayNumber = 40
					ser[rnd] = ser[x + 1];										// Set x round lucky number
				}
				
				Arrays.sort(ballsPicked);
				
				return ballsPicked;
			}
			
			public void becomePoorer(){
				showSomething("Enter a number that you dislike (it will not picked)");
				int disLike = shooseNumber();
				randomBalls(disLike);
				showBalls(ballsPicked);
			}
			
			// Enter number that you dislike (by any possible interface)
			abstract protected  int shooseNumber();
			abstract protected void showSomething(String message);
			abstract protected void showBalls(int[] ser);				// show 6 lucky numbers
		

}
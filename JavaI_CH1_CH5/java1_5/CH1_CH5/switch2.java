package CH1_CH5;

import java.util.Scanner;

public class switch2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int day=scanner.nextInt();
		switch(day){
		case 1 :
			System.out.println("wear new clothes");
			break;
		case 2 :
			System.out.println("hungry");
			break;
		case 3 :
			System.out.println("climb mountains");
			break;
			default:
				System.out.println(" ");
				
		}
	}
}

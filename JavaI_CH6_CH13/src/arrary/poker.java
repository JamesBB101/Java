package arrary;

import java.util.ArrayList;

public class poker {

	public static void main(String[] args) {
		String[] shapes = { "桃", "心", "梅", "磚" };
		String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        
		int shape;
		int number;
		int cardNum;
		int[] cards = new int[52];
	    int i=0;
			tag:while (i < cards.length) {
				   shape = 1 + (int) (Math.random() * 4);
				   number = 1 + (int) (Math.random() * 13);
				   cardNum = shape * 100 + number;

				   for (int j = 0; j < i; j++) {
				    if (cardNum == cards[j]) {
				     continue tag;
				    }
				   }
				   cards[i] = cardNum;
				   i++;
				  }
		
		int count=0;
		for(int card : cards){
			System.out.print(shapes[card/100-1]+"  "+numbers[card%100-1]+"  ");
			count++;
			if(count%13==0){
				System.out.println();
			}
		}
	}
}

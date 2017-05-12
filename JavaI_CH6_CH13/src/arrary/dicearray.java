package arrary;

public class dicearray {

	public static void main(String[] args) {
		int[] diceCounter = new int[6];
		int NUM_ROLLS=100000000;
		for(int i=0 ; i<=NUM_ROLLS ; i++){
			int number = (int)(Math.random()*5.99999999f);
			diceCounter[number]++;
		}
		float average=(float)NUM_ROLLS/6.0f;
		System.out.println("1 : "+diceCounter[0]+" "+(((float)diceCounter[0] - average)/average)*100.0f + "%");
        System.out.println("2 : "+diceCounter[1]+" "+(((float)diceCounter[1] - average)/average)*100.0f + "%");
        System.out.println("3 : "+diceCounter[2]+" "+(((float)diceCounter[2] - average)/average)*100.0f + "%");
        System.out.println("4 : "+diceCounter[3]+" "+(((float)diceCounter[3] - average)/average)*100.0f + "%");
        System.out.println("5 : "+diceCounter[4]+" "+(((float)diceCounter[4] - average)/average)*100.0f + "%");
        System.out.println("6 : "+diceCounter[5]+" "+(((float)diceCounter[5] - average)/average)*100.0f + "%");
        for(int x=0;x<diceCounter.length;x++){
        	System.out.println( (x+1) + " : "  +diceCounter[x]+" "+(((float)diceCounter[x] - average)/average)*100.0f + "%");
        }
        for(int value : diceCounter){
			System.out.println(value);
		}
	}
}
/*Math.random=0~1
* (int) (0~1)*5.9999=0~5   強制變成整數
*int[6]=0.1.2.3.4.5
*/
package homework;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		
		
//		請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形，如圖示結果：
//		(提示：Scanner，三角形成立條件，判斷式if else)
//		(進階挑戰：加入直角三角形的判斷)
		
//		System.out.println("請輸入三個整數");
//		Scanner A1 = new Scanner(System.in);
//		int A = A1.nextInt();
//		int B = A1.nextInt();
//		int C = A1.nextInt();
//		if (A == B && B == C) {
//			System.out.println("正三角形");
//		} else if (A == B || B == C || C == A) {
//			System.out.println("等腰三角形");
//		} else if (A * A + B * B == C * C || B * B + C * C == A * A || A * A + C * C == B * B) {
//			System.out.println("直角三角形");
//		} else if (A == B && B == C && C == 0) {
//			System.out.println("不是三角形");
//		} else if (A != B && B != C && C != A) {
//			System.out.println("其他三角形");
//		}
		
//		請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果：
//		(提示：Scanner，亂數方法，無窮迴圈)

//		float number = (float) (Math.random());
//		number *= 10.0f;
//		int number2 = (int) (number);
//
//		Scanner object = new Scanner(System.in);
//		System.out.println("開始猜數字吧!!!");
//		for (int i = 1; i < 100; i++) {
//			int input = object.nextInt();
//			if (input == number2) {
//				System.out.println("答對了!答案就是" + input);
//				break;
//			} else
//				System.out.println("猜錯囉");
//		}
		
//		(進階挑戰：產生0～100亂數，每次猜就會提示你是大於
//		還是小於正確答案)	
		
//		int num = (int) (Math.random() * 101);
//		Scanner object2 = new Scanner(System.in);
//		System.out.println("開始猜數字吧!!!");
//		for (int x = 0; x <= 100; x++) {
//			int input2 = object2.nextInt();
//			if (input2 > num) {
//				System.out.println("too large");
//			} else if (input2 < num) {
//				System.out.println("too small");
//			} else {
//				System.out.println("BINGO!!!!");
//				break;
//			}
//		}
		
//		阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字，畫面會顯示他可以選擇的號碼與總數，如圖：
//		(提示：Scanner)
//		System.out.println("請輸入0~9一個數");
//		Scanner object3 = new Scanner(System.in);
//
//		outer: for (int i = 1; i < 100; i++) {
//			int input3 = object3.nextInt();
//			if (input3 < 10) {
//				int count = 0;
//				for (int y = 1; y < 50; y++) {
//					if (y % 10 == input3 || y / 10 == input3) {
//					} else {
//						System.out.print(y + " ");
//						count++;
//						if (count % 6 == 0) //
//						{
//							System.out.println();
//						}
//					}
//				}
//				System.out.print("總共有" + count + "個數字可選");
//			} else {
//				System.out.println("重新輸入");
//				continue outer;
//			}
//		}
		
		//第二種寫法
		
//		System.out.println("請輸入0~9一個數");
//		Scanner object3 = new Scanner(System.in);
//		int input3 = object3.nextInt();
//		int count = 0;
//		System.out.println();
//		for (int y = 0; y <= 4; y++) {
//			if (y == input3) {
//				continue;
//			}
//			for (int z = 0; z < 10; z++) {
//				if (z == input3) {
//					continue;
//				}
//				if ((y * 10 + z) != 0) //
//				{
//					System.out.print(y * 10 + z + " ");
//					count++;
//				}
//			}
//			System.out.println();
//		}
//		System.out.print("總共有"+count+"個數字可選");
		
//		(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重覆)
//		System.out.println("請輸入0~9一個數");
//		Scanner object3 = new Scanner(System.in);
//		int input3 = object3.nextInt();
//		int[] ary = new int[45];
//
//		int count = 0;
//		int i = 0;
//
//		for (int y = 1; y < 50; y++) {
//			if (y % 10 == input3 || y / 10 == input3) {
//			} else {
//				System.out.print(y + " ");
//				ary[i] = y;
//				i++;
//				count++;
//				if (count % 6 == 0) {
//					System.out.println();
//				}
//			}
//		}
//		System.out.print("總共有" + count + "個數字可選");
//		System.out.println();
//		int[] ary2 = new int[6];
//		int j = 0;
//		int x = 0;
//		tag: while (j < 6) {
//			x = (int) (Math.random() * i);
//			for (int y = 0; y <= j; y++) {
//				if (ary[x] == ary2[y]) {
//					continue tag;
//				}
//
//			}
//
//			ary2[j] = ary[x];
//			j++;
//		}
//		System.out.println("亂數印出6個號碼");
//		for (int v : ary2) {
//			System.out.print(v + " ");
//		}
		
	}
}

package homework;

public class homework2plus {

	public static void main(String[] args) {

		// 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
		// 請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int count = 0;
		for (int i = 0; i <= 4; i++) {
			if (i == 4) {
				continue;
			}
			for (int j = 0; j < 10; j++) {
				if (j == 4) {
					continue;
				}
				if ((i * 10 + j) != 0) // 篩掉等於0的值
				{
					System.out.print(i * 10 + j + " ");
					count++;
				}
			}
			System.out.println();
		}
		System.out.println("總共有" + count + "個數");

		// 請設計一隻Java程式,輸出結果為以下:
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7 8
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1
		// 2
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// 請設計一隻Java程式,輸出結果為以下:
		// A
		// BB
		// CCC
		// DDDD
		// EEEEE
		// FFFFFF
		char abc = 'A';
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(abc);

			}
			System.out.println();
			abc++;
		}
	}
}

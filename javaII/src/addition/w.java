package addition;

public class w {
	public static void main(String[] args) {

		int[] num = new int[5];
		for (int i = 0; i < num.length; i++)
			num[i] = (int) (Math.random() * 100 + 1);

		boolean isPrime = true;
		for (int i = 0; i < num.length; i++) {
			// 使用sqrt方法，減少了迴圈執行次數
			for (int j = 2; j <= Math.sqrt(num[i]); j++) {
				if (num[i] % j == 0) {
					isPrime = false;
					break;
				} else
					isPrime = true;
			}
			if (isPrime)
				System.out.println(num[i] + "是質數");
			else
				System.out.println(num[i] + "不是質數");
		}
	}
}

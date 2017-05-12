package CH1_CH5;


public class switchcasebreakdefault {

	public static void main(String[] args) {
		int n = 10; // 10 20 30

		switch (n) {
		case 10:
			System.out.println("n 的值是 10");
			break;
		case 20:
			System.out.println("n 的值是 20");
			break;
		default:
			System.out.println("n 的值不是 10 也不是 20");
		}

		System.out.println("我仍有執行到!");
	}

}

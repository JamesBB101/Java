package homework;

public class homework {
	public static void main(String[] args) {

		int num1 = 12, num2 = 6, num3 = 200, num4 = 12, num5 = 256559, num6 = 60, num7 = 24;
		int sum = num1 + num2;
		int multiply = num1 * num2;
		int aa = num3 / num4;
		int aaa = num3 % num4;
		int day = num5 / (num6 * num6 * num7);
		int hr = (num5 % (num6 * num6 * num7)) / (num6 * num6);
		int min = (num5 % (num6 * num6 * num7)) % (num6 * num6) / num6;
		int sec = (num5 % (num6 * num6 * num7 * num6 * num6)) % (num6 * num6) % num6;
		final float PI = 3.1415f;
		float circle = PI * 5 * 5;
		float circle2 = PI * 10;
		double money = 150 * Math.pow(1.02, 10);

		System.out.println("12,6兩個數值的和=" + sum + "&積=" + multiply);
		System.out.println("200顆雞蛋是" + aa + "打又" + aaa + "顆");
		System.out.println(day + "天" + hr + "小時" + min + "分" + sec + "秒");
		System.out.println("圓面積是" + circle + "圓周長是" + circle2);
		System.out.println("本利和" + money);
		System.out.println(5 + 5);
		System.out.println(5 + '5');
		System.out.println(5 + "5");
		/*
		 * 5+5=10 宣告char ch1='5' 得到ch1=5 在Unicode中表示0035 再透過int宣告i1='5'
		 * 0035用int十進位法表示後是3*16^(2-1)+5=53 5+"5"=5與5
		 */
		int a = 60, b = 24, c = 256559;
		int day1, hr1, min1, sec1;
		String ch1 = "Ru\noob";
		day1 = c / (a * a * b);
		hr1 = c % (a * a * b) / (a * a);
		min1 = c % (a * a * b) % (a * a) / a;
		// 天的餘數,小時的餘數
		sec = c % a;
		System.out.println(day + "d" + hr + "h" + min + "m" + sec + "s");
		System.out.println(ch1);
	}

}

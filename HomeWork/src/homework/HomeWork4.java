package homework;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
//		有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		
//		int sum = 0;
//		double avg = 0;
//		int[] a = new int[] { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
//		for (int i = 0; i < a.length; i++) {
//			sum += a[i];
//		}
//
//		avg = (double) (sum / (a.length));
//		System.out.println("平均=" + avg);
//		System.out.print("比平均數大的有:");
//
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] > avg) {
//				System.out.print(a[i] + "\t");
//			}
//		}

		
//		請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroWolleH
		
//		String s = "Hello World";
//		char[] c = s.toCharArray();
//		String st = "";
//		for (int i = 0; i < c.length; i++) {
//			st += c[c.length - i - 1];
//		}
//		System.out.println(st);
		
//		StringBuffer sb = new StringBuffer();
//		sb.append("Hello World");
//		System.out.println(sb.reverse());
		
//		有個字串陣列如下(八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”,“saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		
//		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
//		int count = 0;
//		for (int i = 0; i < planets.length; i++) {
//			for (int j = 0; j < planets[i].length(); j++) {
//				switch (planets[i].charAt(j)) {
//				case 'a':
//					count++;
//					continue;
//				case 'e':
//					count++;
//					continue;
//				case 'i':
//					count++;
//					continue;
//				case 'o':
//					count++;
//					continue;
//				case 'u':
//					count++;
//					continue;
//				default:
//					continue;
//				}
//			}
//		}
//		System.out.println("共有" + count + "個母音");
		
//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列表如下：
//		員工編號     25  32    8    19    27
//		身上現金 2500 800  500  1000  1200
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共3 人!」
		
//		int[][] emp = { { 25, 2500 }, { 32, 800 }, { 19, 1000 }, { 27, 1200 } };
//		Scanner sc = new Scanner(System.in);
//		int money = sc.nextInt();
//		int count = 0;
//		for (int i = 0; i < emp.length; i++) {
//			if (money <= emp[i][1]) {
//				System.out.print("員工編號 : " + emp[i][0] + "\t");
//				count++;
//			}
//		}
//		System.out.print("共" + count + "人");


//請設計一隻程式由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，它會顯示是該年的第幾天
//例：輸入1984 9 8 三個號碼後，程式會顯示「西元1984年，第250天」
//(提示1：Scanner，陣列)
//(提示2：需將閏年條件加入)
//(提示3：輸入月份如為2月，則日期不該超過29天)

//		System.out.println("請輸入三個整數，分別代表西元yyyy年，mm月，dd日");
//		Scanner sc = new Scanner(System.in);
//		int year = sc.nextInt();
//		int month = sc.nextInt();
//		int day = sc.nextInt();
//
//		int[] dayArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//		int sum = 0;
//		if (month < 0 || month > 12) {
//			System.out.println("'月'請重新輸入");
//			month = sc.nextInt();
//		}
//		if (day < 0 || day > dayArray[month - 1]) {
//			System.out.println("'日'請重新輸入");
//			day = sc.nextInt();
//		}
//		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			dayArray[1] = 29;
//		}
//		for (int i = 0; i < month - 1; i++) {
//			sum += dayArray[i];
//		}
//		sum += day;
//		System.out.println("西元" + year + "年  " + "第" + sum + "天");

//•班上有8位同學，他們進行了6次考試結果如下：
//請算出每位同學考最高分的次數	
		
//		int[][] gradeArray = {
//				{10, 35, 40, 100, 90, 85, 75, 70},
//				{37, 75, 77, 89, 64, 75, 70, 95},
//				{100, 70, 79, 90, 75, 70, 79, 90},
//				{77, 95, 70, 89, 60, 75, 85, 79},
//				{98, 70, 89, 90, 75, 90, 89, 90},
//				{90, 80, 100, 75, 50, 20, 99, 75}};
//		int[] number = new int[8];
//		int a=0;
//		for (int i = 0; i < gradeArray.length; i++) {
//			int maxGrade = 0;
//			for (int j = 0; j < gradeArray[i].length; j++) {
//				if (maxGrade < gradeArray[i][j]) {
//					maxGrade = gradeArray[i][j];
//					a=j;
//				}
//				
//			}
//			number[a]++;
//		}
//		int i=0;
//		for(int v:number){
//			i++;
//			System.out.println("第"+i+"號  : "+v+"次");
//		}

	}
}








package homework10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HW10 {

	public static void main(String[] args) throws IOException, ParseException {
		
//		請設計一隻程式，用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否為質數 (提示：Math類別)

		
		
		
		
		
//		請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示
//		(1)千分位(2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖
//		(提示：TestFormatter.java, Java API文件, 判斷數字可用正規表示法)
		
		DecimalFormat df1 = new DecimalFormat("###,###.##"); // 千分位
		DecimalFormat df2 = new DecimalFormat("#.##%"); // 百分比
		DecimalFormat df3 = new DecimalFormat("#.##E00"); // 科學記號
		String intFormat = "\\-?\\d+"; // 整數格式
		String doubleFormat = "\\-?\\d+\\.\\d+"; // 小數格式
		String optionFormat = "[1-3]"; // 選項格式
		int option;
		double num;

		while (true) {
			System.out.print("請輸入數字: ");
			//也可以使用Scanner類別
			String input = new BufferedReader(new InputStreamReader(System.in))
					.readLine();
			//String的matches方法可用來比對正規表示法的要求格式是否正確
			//參考java.lang.String API文件
			if (input.matches(intFormat) || input.matches(doubleFormat)) {
				num = Double.parseDouble(input);
				break;
			} else
				System.out.println("數字格式不正確，請再輸入一次!");
		}

		while (true) {
			System.out.print("欲格式化成(1)千分位(2)百分比(3)科學記號: ");
			String input = new BufferedReader(new InputStreamReader(System.in))
					.readLine();
			if (input.matches(optionFormat)) {
				option = Integer.parseInt(input);
				break;
			} else
				System.out.println("選項格式不正確，請再輸入一次!");
		}

		switch (option) {
		case 1:
			System.out.println("千分位數字: " + df1.format(num));
			break;
		case 2:
			System.out.println("百分比數字: " + df2.format(num));
			break;
		case 3:
			System.out.println("科學記號數字: " + df3.format(num));
			break;
		}
	
		
//		請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，可以轉成想要的輸出格式化成
//		(1)年/月/日(2)月/日/年(3)日/月/年三選一，而輸入非指定日期數字格式會顯示出提示訊息如圖
//		(提示：TestFormatter.java, Java API文件，判斷格式可用正規表示法)
		
//		SimpleDateFormat sdf0 = new SimpleDateFormat("yyyyMMdd");
//		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
//		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
//		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
//		String dateFormat = "(19|20)\\d\\d(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"; // 日期格式
//		String optionFormat = "[1-3]"; // 選項格式
//		Date date;
//		int option;
//
//		while (true) {
//			System.out.print("請輸入日期(年月日，例如:20110131): ");
//			// 也可以使用Scanner類別
//			String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
//			// String的matches方法可用來比對正規表示法的要求格式是否正確
//			// 參考java.lang.String API文件
//			if (input.matches(dateFormat)) {
//				date = sdf0.parse(input);
//				break;
//			} else
//				System.out.println("日期格式不正確，請再輸入一次!");
//		}
//
//		while (true) {
//			System.out.print("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年: ");
//			String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
//			if (input.matches(optionFormat)) {
//				option = Integer.parseInt(input);
//				break;
//			} else
//				System.out.println("選項格式不正確，請再輸入一次!");
//		}
//		switch (option) {
//		case 1:
//			System.out.println("年/月/日: " + sdf1.format(date));
//			break;
//		case 2:
//			System.out.println("月/日/年: " + sdf2.format(date));
//			break;
//		case 3:
//			System.out.println("日/月/年: " + sdf3.format(date));
//			break;
//		}
	}

}

package addition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class u {
	public static void main(String args[]) throws IOException, ParseException {

		SimpleDateFormat sdf0 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormat = "(19|20)\\d\\d(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"; // 日期格式
		String optionFormat = "[1-3]"; // 選項格式
		Date date;
		int option;

		while (true) {
			System.out.print("請輸入日期(年月日，例如:20110131): ");
			// 也可以使用Scanner類別
			String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
			// String的matches方法可用來比對正規表示法的要求格式是否正確
			// 參考java.lang.String API文件
			if (input.matches(dateFormat)) {
				date = sdf0.parse(input);
				break;
			} else
				System.out.println("日期格式不正確，請再輸入一次!");
		}

		while (true) {
			System.out.print("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年: ");
			String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
			if (input.matches(optionFormat)) {
				option = Integer.parseInt(input);
				break;
			} else
				System.out.println("選項格式不正確，請再輸入一次!");
		}
		switch (option) {
		case 1:
			System.out.println("年/月/日: " + sdf1.format(date));
			break;
		case 2:
			System.out.println("月/日/年: " + sdf2.format(date));
			break;
		case 3:
			System.out.println("日/月/年: " + sdf3.format(date));
			break;
		}
	}
}

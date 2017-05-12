package addition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class v {
	public static void main(String args[]) throws IOException {
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
			// 也可以使用Scanner類別
			String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
			// String的matches方法可用來比對正規表示法的要求格式是否正確
			// 參考java.lang.String API文件
			if (input.matches(intFormat) || input.matches(doubleFormat)) {
				num = Double.parseDouble(input);
				break;
			} else
				System.out.println("數字格式不正確，請再輸入一次!");
		}

		while (true) {
			System.out.print("欲格式化成(1)千分位(2)百分比(3)科學記號: ");
			String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
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
	}
}

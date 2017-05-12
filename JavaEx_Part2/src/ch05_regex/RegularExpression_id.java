package ch05_regex;

import java.util.Scanner;

public class RegularExpression_id {

	public static void main(String[] args) {
		String reg = "[A-Z][12]\\d{8}";
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入身分證字號");
		String input = sc.nextLine();
		
		if(input.toUpperCase().matches(reg)){
			System.out.println("正確");
		}else{
			System.out.println("錯誤");
		}
	}
}

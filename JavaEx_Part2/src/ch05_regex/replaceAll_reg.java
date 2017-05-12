package ch05_regex;

public class replaceAll_reg {

	public static void main(String[] args) {
		String str = "abcdefbc";
		String regStr = str.replaceAll(".bc", "33");
		System.out.println(regStr);
	}
}
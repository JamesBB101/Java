package arrary;

public class arraystringbuilder {
	public static void main(String[] args) {

		String str = "Hello World";
		char[] sArray = str.toCharArray();

		StringBuilder sb = new StringBuilder(sArray.length);
		
		// sb.reverse();
		for (int i = 0; i < sArray.length; i++) {     
			sb.append(sArray[sArray.length - i - 1]);
		}
		System.out.println(sb);

		String reverStr = "";
		for (int i = 0; i < sArray.length; i++) {
			reverStr = reverStr + sArray[sArray.length - i - 1];
		}
		System.out.println(reverStr);
	}
}

package idv.david.additional.enumevo;

public class PrivateShirtTest {

	public static void main(String args[]) {

		PrivateShirt privShirt = new PrivateShirt();
		char colorCode;

		// 1.設定合法的顏色碼'R'
		privShirt.setColorCode('R');
		colorCode = privShirt.getColorCode();

		// 2.設進去了
		System.out.println("Color Code: " + colorCode);

		// 3.設定不合法的顏色碼'W'
		privShirt.setColorCode('W');
		colorCode = privShirt.getColorCode();

		
		System.out.println("Color Code: " + colorCode);// 4.設不進去, 仍是 R  被11行設定過
	}
}

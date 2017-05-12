package addition;

public class ClonableTest implements Cloneable {

	private char colorCode = 'U';

	public char getColorCode() {
		return colorCode;
	}

	public void setColorCode(char newCode) {
		switch (newCode) {
		case 'R':
		case 'G':
		case 'B':
			colorCode = newCode;
			break;
		default:
			System.out.println("不正確的顏色碼. 請使用 R, G, or B");
		}
	}

	public static void main(String[] args) {
		ClonableTest myShirt = new ClonableTest();
		ClonableTest yourShirt = new ClonableTest();
		myShirt.setColorCode('R');
		yourShirt.setColorCode('G');

		System.out.println(myShirt.getColorCode()); // R
		try { // 使用.clone()要implements Cloneable
			myShirt = (ClonableTest) yourShirt.clone(); // 創造一個新位置的值
		} catch (CloneNotSupportedException e) { // 沒有implements
													// Cloneable=>CloneNotSupportedException
			System.out.println("不允許複製此物件!");
			e.printStackTrace();
		}
		System.out.println(myShirt.getColorCode()); // G
		System.out.println(myShirt == yourShirt);
		System.out.println(myShirt.equals(yourShirt)); // 因為equals沒有override所以比較位置是false
		int y = yourShirt.getColorCode();
		int m = myShirt.getColorCode();
		System.out.println(y == m);
		char y1 = yourShirt.getColorCode();
		char m1 = myShirt.getColorCode();
		System.out.println(y1 == m1);
	}

}

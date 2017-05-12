package idv.david.additional.enumevo;

public class PrivateShirtTest2 {

	public static void main(String args[]) {

		PrivateShirt2 privShirt = new PrivateShirt2();
		ColorCode colorCode;  //列舉變數
		
		// 1. 設定合法的顏色碼'R'
		// 2. 設定不合法的顏色碼時, 即compile error , 因已由 enum 決定範圍了
		// 3. 已達成在編譯階段就可檢查所設定的列舉式資料是否合法的目的!
		privShirt.setColorCode(ColorCode.R);	//只有列舉型態的列舉子才能呼叫
		System.out.println("Color Code: " + privShirt.getColorCode());

	}
}
class PrivateShirt2 {

	private int shirtID = 0;
	private String description = "-description required-";
	private double price = 0.0;
	private int quantityInStock = 0;
	
	
	// ● 顏色碼 R=紅色, B=藍色, G=綠色, U=未定
	private ColorCode colorCode = ColorCode.U;
	// ●getXxx
	public ColorCode getColorCode() {
		return colorCode;
	}

	// ●setXxx
	public void setColorCode(ColorCode newCode) {
		colorCode = newCode;
		// ※不再需要此錯誤處理了, 已由 enum 決定範圍了
	}
	// ※ 其它對 shirtID, description,
	// ※ price, and quantityInStock 的 get set方法, 請仿照上述的作法
}


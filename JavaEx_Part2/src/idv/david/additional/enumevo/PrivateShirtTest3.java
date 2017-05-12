package idv.david.additional.enumevo;

public class PrivateShirtTest3 {
	public static void main(String args[]) {

		PrivateShirt3 privShirt = new PrivateShirt3();

		// 1. 設定合法的顏色碼'R'	   //compile error  編譯錯誤
		// 2. 設定不合法的顏色碼時, 即compile error , 因已由 enum 決定範圍了
		// 3. 已達成在編譯階段就可檢查所設定的列舉式資料是否合法的目的!
		privShirt.setColorCode2(ColorCode2.R);
		System.out.println("Color Code: " + privShirt.getColorCode2().getName2());
												//列舉子呼叫方法  回傳屬性
		//參考EnumeratedTypes2_1
	}
}

class PrivateShirt3 {
	private int shirtID = 0;
	private String description = "-description required-";
	// ● 顏色碼 R=紅色, B=藍色, G=綠色, U=未定
	private ColorCode2 colorCode = ColorCode2.U;
	private double price = 0.0;
	private int quantityInStock = 0;

	// ●getXxx
	public ColorCode2 getColorCode2() {
		return colorCode;
	}

	// ●setXxx
	public void setColorCode2(ColorCode2 newCode) {
		colorCode = newCode;
		// ※不再需要此錯誤處理了, 已由 enum 決定範圍了
	}
	// ※ 其它對 shirtID, description,
	// ※ price, and quantityInStock 的 get set方法, 請仿照上述的作法
}

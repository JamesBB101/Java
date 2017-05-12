package ch05_innerClass;

class OuterDemo2_Test {
	private int outerNumber = 0;

	public void printOuterNumber() {
		System.out.println("3-再由OuterClass自行列印出外層類別的數值");
		System.out.println("outerNumber=" + outerNumber);
	}

	public class InnerClass {
		public void changeOuterNumber() {
			System.out.println("2-由InnerClass驅動變更外層OuterClass的數值");
			outerNumber++;
		}
	}
}
public class OuterDemo2 {
	public static void main(String[] args) {
		OuterDemo2_Test oc = new OuterDemo2_Test();
//		OuterDemo2_Test.InnerClass ic = oc.new InnerClass();  //外部物件呼叫內部類別建構子  儲存在內的類別的型態
		OuterDemo2_Test.InnerClass ic = new OuterDemo2_Test().new InnerClass();
		ic.changeOuterNumber();		//如果是第22行執行的話  outerNumber = 0  因為inner(自己++)跟outter是不同物件
		oc.printOuterNumber();		//幫 outerNumber  +  static就會改善
	}
}
//外部類別呼叫內部類別當作型態   變數  = 外部物件呼叫內部物件
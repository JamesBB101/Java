package ch05_innerClass;

class Outer1 {
	static int x = 1;
	int y = 2;
	
	public static class Inner {
		public int z = 3;
		public void show() {
			System.out.println("Outer1.x = " + Outer1.x);
	//static內部類別無法存取外部類別的實體成員，會編譯失敗
	//如果要的話就不能使用static
//			System.out.println("Outer1.this.y = " + Outer1.this.y);
			System.out.println("this.z = " + this.z);
		}
	}
}
public class StaticInner {
	public static void main(String[] args) {
		Outer1.Inner inner = new Outer1.Inner();
		//static內部類別   可以用類別呼叫
		
		inner.show();
	}
}
//好處是初始化的時候可以用外部類別名稱去呼叫
//壞處是靜態類別沒辦法去呼叫實體變數
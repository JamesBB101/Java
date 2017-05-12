package OOP;

public class penVII {
	public static void main(String[] args) {
		Pen1 myPen = new Pen1();
		myPen.brand = "SKB"; //使用運算子.來操作物件的值
		myPen.price = 10;
		
		Pen1 yourPen = new Pen1();
		yourPen.brand = "MontBlanc";
		yourPen.price = 12000;
		
		myPen.showInfo();
		yourPen.showInfo();
	}
}

class Pen1 {
	
	    String brand;
	    double price;
		//方法成員，需透過物件參考變數進行呼叫
		public void showInfo() {
			System.out.println("牌子為：" + brand);
			System.out.println("價格為：" + price);
		}
}

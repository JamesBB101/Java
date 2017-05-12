package OOP;

public class AOPP {

	public static void main(String[] args) {
		Pen mypen = new Pen();
		mypen.brand="SKB";          //定義物件屬性值
		mypen.price=1000;
		mypen.show();               //使用方法(將值引入,打印;運算) 不回傳&回傳
		
		System.out.println(mypen.sum(3, 5));
		
		mypen.total("SS",2000);
		System.out.println(mypen.brand+mypen.price);
	}
}
class Pen{
	String brand;
	double price;
	void show(){
		System.out.println(brand);
		System.out.println(price);
	}
	
	int sum(int x,int y){
		return x+y;
	}
	
	void total(String i, int j){
		this.brand=i;             //用方法將值引入
		this.price=j;	
	}
	
}
//class是定義物件的地方
//可以用物件創造多個實體
//實體可以使用物件裡的型態&方法
//靜態變數屬於物件本身  直接用物件呼叫class.variable  給予實體初始化
//建構子在new實體時就會讀取
//
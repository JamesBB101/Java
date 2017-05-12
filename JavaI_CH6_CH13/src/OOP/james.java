package OOP;

public class james {

	public static void main(String[] args) {
		james1 J = new james1();
		james1 G = new james1();
		james1 H = new james1();
		J.height = 100.0f;
		J.weight = 50.0f;
		G.height = 120.0f;
		G.weight = 60.0f;
		H.height = 140.0f;
		H.weight = 70.0f;
		
		System.out.println(J.height);
		System.out.println(G.height);
		System.out.println(H.height);
		james1.X=10;
		
		james2.NUM_MONSTERS=386;
		james2 pikatu = new james2();
		pikatu.HP=100;
		pikatu.DAMAGE=10;
		james2 fire = new james2();
		fire.ID=11;
	}
}
//創造J物件
//呼叫james1()物件裡面的建構子
//創造G物件  把james1物件給G
//3個物件互相獨立  6個變數
//創造pikatu物件  用物件去呼叫monster  class物件裡的變數
//用物件去創造新物件  用心物件去呼叫舊物件

//static可以直接被呼叫使用  不用創造  因為static是屬於monster的變數
//創造new出來的物件變數是屬於新的物件的變數
//屬於共同的寫在舊物件
//屬於新的可以用創造出來

//物件考包含 靜態變數 非靜態變數 建構子
//靜態變數屬於物件本身  //可以使用calss名稱(大寫)去呼叫static變數
//非靜態變數 需要創造一個物件 去呼叫舊物件裡面的變數
//建構子是不論如何都會被執行到  建構子要大寫
//方法要用創造新物件去呼要執行


package OOP;

public class HelloOOP {

public static void main (String[] args){//用妹方法印出
		     //class呼叫class名稱      
	Test ts=new Test();//new class=new一個實體
	ts.show(); //呼叫成員 方法
	}
}
class Test{ //成員
		public int var=5;   //變數=成員屬性
		public void show(){  //列印變數=成員方法 成員函數
		   System.out.println(var);  //輸出語句
		 }
}

package test;

public class bikeTest {

	public static void main(String[] args) {
		bike myBike = new bike(); // 類別名稱 型態   類別變數
		System.out.println(myBike.speed); //呼叫變數
//		myBike.speed=10;
		myBike.addspeed();                 //使用方法
		myBike.addspeed();
		System.out.println(myBike.speed);
		bike urBike = new bike();
		System.out.println(bike.count);   //建立兩台腳踏車 用類別呼叫靜態變數
		System.out.println(myBike.getcount());  //用實體呼叫方法
		
		String Amy=new String("girl");      //傳出物件實體
		System.out.println(Amy);
		byte[] b1={97,98,99,100};
		String st=new String(b1,0,b1.length);  //byte陣列  0起用  長度
		System.out.println(st);
		
	}

}

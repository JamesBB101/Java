package homework;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
//		請設計一個方法為starSquare(int width, int height)，
//		當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如圖：
		
//		System.out.println("請輸入寬與高");
//		Scanner sc = new Scanner(System.in);
//		int width = sc.nextInt();
//		int height = sc.nextInt();
//		startSquare(width, height);
//
//	}
//
//	public static void startSquare(int width, int height) {
//		for (int i = 0; i < height; i++) {
//			for (int j = 0; j < width; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
		
//		int[] array=new int[10];
//		int sum=0;
//		for(int i=0;i<10;i++){
//		int a=(int)(Math.random()*101);
//		array[i]=a;
//		}
//		System.out.print("本次亂數結果"+"\n");
//		for(int v:array){
//			
//			System.out.print(v+"  ");
//			sum+=v;
//		}
//		System.out.println("\n"+sum/array.length);

		
//利用Overloading，設計兩個方法
//double maxElement(int x[][])與double maxElement(double x[][])，
//可以找出二維陣列的最大值並回傳，如圖：
		
//		int[][] intArray = { {1, 6, 3}, {9, 5, 2} };
//		double[][] doubleArray={ {1.2, 3.5, 2.2}, {7.4, 2.1, 8.2} };		
//		System.out.println(maxElement(intArray));
//		System.out.println(maxElement(doubleArray));
//		
//
//	}
//	public static double maxElement(int x[][]){
//		int max=0;
//		for(int i=0;i<x.length;i++){
//			for(int j=0;j<x[i].length;j++){
//				if(max<x[i][j]){
//					max=x[i][j];
//				}
//			}
//		}
//		
//		return max;
//	}
//	public static double maxElement(double x[][]){
//		double max=0;
//		for(int i=0;i<x.length;i++){
//			for(int j=0;j<x[i].length;j++){
//				if(max<x[i][j]){
//					max=x[i][j];
//				}
//			}
//		}
//		return max;

		
//		請設計一個類別MyRectangle：
//		(1) 有兩個double型態的屬性為width, depth
//		(2) 有三個方法：
//		void setWidth(double width):將收到的引數指派給width屬性
//		void setDepth(double depth):將收到的引數指派給depth屬性
//		double getArea():能計算該長方形的面積
//		(3) 有兩個建構子：
//		public MyRectangle(): 不帶參數也無內容的建構子
//		public MyRectangle(double width, double depth): 傳入的兩個引數會存到對應的屬性
//		•請另外編寫一個MyRectangleMain類別，此類別只有main方法
//		(1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
//		(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果

//		MyRectangle mr = new MyRectangle();
//		mr.width=10;
//		mr.depth=20;
//		System.out.println(mr.getArea());
//		MyRectangle mr1 = new MyRectangle(10,20);
//		System.out.println(mr1.getArea());
//	}
//}
//class MyRectangle{
//	double width;
//	double depth;
//	void setWidth(double width){
//		this.width=width;
//	}
//	void setDepth(double depth){
//		this.depth=depth;
//	}
//	public MyRectangle(){
//		
//	}
//	public MyRectangle(double width, double depth){
//		this.width=width;
//		this.depth=depth;
//	}
//	double getArea(){
//		return width*depth;

//身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，
//請設計一個方法void genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，
//此驗證碼內容包含了英文大小寫與數字的亂數組合，如圖：

//		genAuthCode();
//	}
//
//	public static void genAuthCode() {
//		String stringCode = "";
//		StringBuffer sb = new StringBuffer();
//		for (int i = 0; i < 8; i++) {
//			int Choose = (int) (Math.random() * 62);
//			if (Choose <= 26) {
//				char a = (char) (Math.random() * 26 + 97);
//				stringCode += a;
//				sb.append(a);
//			} else if (Choose > 36) {
//				char b = (char) (Math.random() * 26 + 65);
//				stringCode += b;
//				sb.append(b);
//			} else {
//				int c = (int) (Math.random() * 10);
//				stringCode += c;
//				sb.append(c);
//			}
//		}
//		System.out.println(stringCode);
//		System.out.println(sb.toString());

	}
}





package File_CH2_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjOutputStream_FileOutputStream_Serializable {

	public static void main(String[] args) {
		Product p = new Product(10,20,30);
		System.out.println(p.avgPrice());
		try {
			ObjectOutputStream oout = 
					new ObjectOutputStream(new FileOutputStream("./directory/product.dat"));
			oout.writeObject(p);
			oout.flush();
			oout.close();
			System.out.println("oout OK");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		try {
			ObjectInputStream oin =
					new ObjectInputStream(new FileInputStream("./directory/product.dat"));
			Product p1 = (Product)oin.readObject();//強制轉型
			System.out.println(p1.avgPrice());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Product implements Serializable{
	int a,c;
	transient int b;//沒有參與序列化
	Product(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	int getPrice(){
		return a+b+c;
	}
	double avgPrice(){
		return getPrice()/3.0;
	}
}
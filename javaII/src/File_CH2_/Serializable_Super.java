package File_CH2_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializable_Super {

	public static void main(String[] args) {
		TestC a = new TestC();
		System.out.println(a);//物件位置
		try {
			ObjectOutputStream oout =
					new ObjectOutputStream(new FileOutputStream("./directory/Serializable"));
			oout.writeObject(a);
			oout.flush();
			oout.close();
			System.out.println("oout OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			ObjectInputStream oin = 
					new ObjectInputStream(new FileInputStream("./directory/Serializable"));
			TestC c= (TestC) oin.readObject();
			oin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
class TestA implements Serializable{
	TestA(){
		System.out.println("TestA");
	}
}
class TestB extends TestA{
	TestB(){
		System.out.println("TestB");
	}
}
class TestC extends TestB{
	TestC(){
		System.out.println("TestC");
	}
}
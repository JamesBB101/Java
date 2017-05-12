package file_CH2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializable_Super {

	public static void main(String[] args)  {
	TestC c = new TestC();
	try {
		ObjectOutputStream oout = 
				new ObjectOutputStream(new FileOutputStream("./testdir/test.dat"));
		oout.writeObject(c);
		oout.flush();
		oout.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	try {
		ObjectInputStream oin =
				new ObjectInputStream(new FileInputStream("./testdir/test.dat"));
		TestC c2 = (TestC)oin.readObject();//解序列化
		oin.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}
}
class TestA implements Serializable{
	TestA(){
		super();
		System.out.println("TestA");
	}
}
class TestB extends TestA{
	TestB(){
		super();
		System.out.println("TestB");
	}
}
class TestC extends TestB{
	Brad b = new Brad();  //物件沒有實作序列化就會發生例外
	TestC(){
		super();
		System.out.println("TestC");
	}
}
class Brad implements Serializable{
}
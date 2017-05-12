package file_CH2;

import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjOutputStream_ObjInputSream {

	public static void main(String[] args) {
		Student11111 s1 = new Student11111(90,80,70);
		System.out.println(s1.getAvg());
		try {
			ObjectOutputStream oout =
					new ObjectOutputStream(new FileOutputStream("./testdir/student.dat"));
//public ObjectOutputStream(OutputStream in)throws IOException	//放OutputStream
			oout.writeObject(s1);
			
			oout.flush();
			oout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			ObjectInputStream oin =
					new ObjectInputStream(new FileInputStream("./testdir/student.dat"));
			Student11111 s2 = (Student11111)oin.readObject();  //強制轉型  大型別放入小型別                 //Manager a=(Manager) new Emp(1,"A");
//public final Object readObject()throws IOException,ClassNotFoundException
//Return : the object read from the stream
			System.out.println(s2.getAvg());
//			Student11111 s2 =oin.readObject();
			oin.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
class Student11111 implements Serializable{  //實作序列化
	int Chiness,English,Math;
	Student11111(int c,int e,int m){
		Chiness=c;
		English=e;
		Math=m;
	}
	int getScore(){
		return Chiness+English+Math;
	}
	double getAvg(){
		return getScore()/3.0;
	}
}
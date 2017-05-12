package file_CH2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjSerializable_transient {

	public static void main(String[] args) {
		Student s1 = new Student(90,80,70);
		System.out.println(s1.getAvg());
		try {
			ObjectOutputStream oout =
					new ObjectOutputStream(new FileOutputStream("./testdir/student.dat"));
//public ObjectInputStream(InputStream in)throws IOException	//放InputStream
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
			Student s2 = (Student)oin.readObject();  //強制轉型  大型別放入小型別
//public final Object readObject()throws IOException,ClassNotFoundException
//Return : the object read from the stream    return Obj已經是一個實體
			System.out.println(s2.getAvg());
//			Student s2 =oin.readObject();
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
class Student implements Serializable{  //實作序列化
	int Chiness;
	transient int English;   //沒有參與序列化
	int Math;
	Student(int c,int e,int m){
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
package File_CH2_;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C_dataOptputStream_FilOutputStream {
	
	public static void main(String[] args) {
		int a=10;
		byte b=3;
		boolean c=true;
		try {
			DataOutputStream dout = 
					new DataOutputStream(new FileOutputStream("./directory/data_type"));//透過建構子建立
			dout.writeInt(a);
			dout.write(b);
			dout.writeBoolean(c);
			dout.flush();
			dout.close();
			System.out.println("dout OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			DataInputStream din = 
					new DataInputStream(new FileInputStream("./directory/data_type"));
			System.out.println(din.readInt());
			System.out.println(din.readByte());
			System.out.println(din.readBoolean());
			din.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

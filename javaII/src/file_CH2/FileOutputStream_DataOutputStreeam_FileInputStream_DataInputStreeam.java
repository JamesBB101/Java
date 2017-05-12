package file_CH2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_DataOutputStreeam_FileInputStream_DataInputStreeam {

	public static void main(String[] args) {
		int a=10;
		byte b=3;
		boolean c=true;
		try {
			FileOutputStream fout = new FileOutputStream("./testdir/file3");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(a);
			dout.write(b);
			dout.writeBoolean(c);
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fin = new FileInputStream("./testdir/file3");
			DataInputStream din = new DataInputStream(fin);
			
			int d=din.readInt();
			boolean e=din.readBoolean();
			byte f = din.readByte();
//			System.out.println(e);  false  順序性
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			System.out.println("OK");
			din.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//public FileInputStream(String name)throws FileNotFoundException
//public DataInputStream(InputStream in)

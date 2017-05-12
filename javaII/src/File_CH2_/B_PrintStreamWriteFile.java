package File_CH2_;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class B_PrintStreamWriteFile {
	public static void main(String args[]) {
		try {
			FileOutputStream fos = new FileOutputStream("c:\\javawork\\hello.txt");
//			FileOutputStream fos = new FileOutputStream("c:\\javawork\\hello.txt",true);

			BufferedOutputStream bos = new BufferedOutputStream(fos);

			PrintStream ps = new PrintStream(bos);

			ps.println("Hello World 世界你好 !");

			ps.close();
			bos.close();
			fos.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}

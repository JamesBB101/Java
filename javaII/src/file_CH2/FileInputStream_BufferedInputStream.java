package file_CH2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStream_BufferedInputStream {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("./testdir/file1");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int temp;
			while ((temp = bin.read()) != -1) {
				System.out.print((char) temp);
			}
			bin.close();
			fin.close();
		} catch (FileNotFoundException a) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}
		System.out.println("\n============================");
		try {
			FileReader fin = new FileReader("./testdir/file1");
			// 一次可以讀2個byte
			int temp;
			while ((temp = fin.read()) != -1) {
				System.out.print((char) temp);
			}
			fin.close();
		} catch (FileNotFoundException a) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
}
//public FileInputStream(String name)throws FileNotFoundException
//public BufferedInputStream(InputStream in)   //參數=inputStream

//public FileReader(String fileName)throws FileNotFoundException
//public int read()throws IOException

//public String readLine()throws IOException   



package file_CH2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_InputStream_OutputStream {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("./testdir/file1");
// FileInputStream(String name)throws FileNotFoundException
			int temp;
			while ((temp = fin.read()) != -1) {
// public int read()throws IOException
// the next byte of data, or -1 if the end of the file is reached.
//				System.out.println(temp);data的byte
				System.out.print((char) temp);
			}
			fin.close();
// public void close() throws IOException
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound Exception");
		} catch (IOException e) {
			System.out.println("File I/O Exception");
		}	
		
		byte[] b = "Hello, World\r\n123456\r\n".getBytes();
		try {
			FileOutputStream fout = new FileOutputStream("./testdir/file2");
// public FileOutputStream(File file,boolean append)throwsFileNotFoundException
// boolean傳true後面加上新的write
			fout.write(b); // write()寫檔byte陣列
			// public void write(byte[] b)throws IOException
			fout.flush(); // buffer緩衝
			fout.close(); // 節點關閉
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound Exception");
		} catch (IOException e) {
			System.out.println("File I/O Exception");
		}
		
	}
}
//read,write都是節點
//input,output





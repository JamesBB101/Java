package file_CH2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_BufferedReader {

	public static void main(String[] args) {
		try {
//			FileReader fin = new FileReader("./testdir/file1");
			BufferedReader bin = new BufferedReader(new FileReader("./testdir/file1"));
			
			String line="";
			while((line=bin.readLine()) != null){
				System.out.println(line);
			}
			bin.close();
		}catch(FileNotFoundException a){
			System.out.println("FileNotFoundException");
		}catch (IOException e) {
				System.out.println("IOException");
		}
	}
}

//public FileInputStream(String name)throws FileNotFoundException
//public BufferedInputStream(InputStream in)   //參數=inputStream


//public FileReader(String fileName)throws FileNotFoundException
//public BufferedReader(Reader in)

//public int read()throws IOException

//public String readLine()throws IOException   //一次讀一列list用String表示



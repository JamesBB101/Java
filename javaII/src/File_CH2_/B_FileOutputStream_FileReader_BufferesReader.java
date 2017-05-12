package File_CH2_;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

public class B_FileOutputStream_FileReader_BufferesReader {

	public static void main(String[] args) {
		byte[] b = "FileOutputStream\r\nwrite\r\nflush\r\n節點關閉".getBytes();
		try {
			FileOutputStream fout = new FileOutputStream("./directory/String",true);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			PrintStream ps = new PrintStream(bout);
//			ps.println("PrintStream");
//			ps.close();
			fout.write(b);
			fout.flush();
			fout.close();
			System.out.println("Output OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			BufferedReader bin = new BufferedReader(new FileReader("./directory/String"));
			String line="";
			while((line=bin.readLine()) != null){
				System.out.println(line);
			}
				
			bin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//output=write
//input=read
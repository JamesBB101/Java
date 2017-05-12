package File_CH2_;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class byteReader_delete_renameTo {

	public static void main(String[] args) throws IOException {
		File sample = new File("C:/data_java_hw/Sample.txt");
		FileInputStream fin = new FileInputStream(sample);
		long s_length = sample.length();
		byte[] b = new byte[(int) s_length];
		int temp=0;
		int i=0;
		while((temp=fin.read())!=-1){
			b[i++]=(byte) temp;
		}
		System.out.println(s_length+" bytes");
		System.out.println(new String(b)); //public String(byte[] bytes)
		
//		File file = new File("E:/java.txt");
//		if (file.delete()) {
//			System.out.println("File deleted.");
//		} else {
//			System.out.println("Failed...");
//		}
		
//		File dir = new File("E:/javawork/");
//		if (dir.mkdirs()) {
//			System.out.println("Success!");
//		} else {
//			System.out.println("Failed...");
//		}
		
//		File oldFile = new File("E:/java.txt");
//		if(oldFile.exists()){
//			System.out.println("OK");
//		}
//		File newFile = new File("E:/javawork/hello.txt/");
//		if(newFile.exists()){
//			System.out.println("OK");
//		}
//		oldFile.renameTo(newFile);  //建立新路徑同時"移動"檔案過去
	}
}

//FileInputStream fis = new FileInputStream("C:\\javawork\\Classmates.csv");
//InputStreamReader isr = new InputStreamReader(fis, "MS950");    //轉檔
//BufferedReader br = new BufferedReader(isr);
//String str;
//while ((str = br.readLine()) != null) {
//	System.out.println(str);
//}
//
//br.close();
//isr.close();
//fis.close();




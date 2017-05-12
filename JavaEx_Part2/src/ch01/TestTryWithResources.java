package ch01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestTryWithResources {

	public static void main(String[] args) {
		File file = new File("files/books.csv");  //filePath Erroe
//		BufferedReader br = null;  //br變數放在main方法內以便finally使用
//
//		// before, finally內自行處理資源的關閉
//		try {
//			br = new BufferedReader(new FileReader(file));
//			String bookInfo = "";
//			while ((bookInfo = br.readLine()) != null) {
//				System.out.println(bookInfo);
//			}
//		} catch (IOException ex) {
//			ex.printStackTrace();
//		} finally {
//			try {
//				br.close();
//			} catch (IOException ex) {
//				ex.printStackTrace();
//			}
//		}

		// Java 7, try-with-resources可確保物件（資源）在最後都會被關閉
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String bookInfo = "";
			while ((bookInfo = in.readLine()) != null) {
				System.out.println(bookInfo);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}//實作java.lang.AutoCloseable與java.io.Closeable介面的物件皆可視為資源
	}
}

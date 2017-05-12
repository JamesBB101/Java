package File_CH2_;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class A_directory_file_mkdir_available_length {

	public static void main(String[] args) throws IOException {
		File directory = new File("./directory");
//public File(String pathname)
		if(!directory.exists()){
			directory.mkdirs();
		}
		File file = new File(directory,"file1");
//public File(String parent,String child)
//可在new fileOutputStream()時建立  透過建構子建立
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		File[] multiFile = directory.listFiles();
		for(File files:multiFile){
			System.out.println(files.getAbsolutePath());
		}
		String[] fileName = directory.list();
		for(String files:fileName){
			System.out.println(files);
		}
		
		FileInputStream fin = new FileInputStream("./directory/file1");
		System.out.println(fin.available());    //fileInputStream使用available
		
		System.out.println(file.length());  //有file就可以使用
	}
}

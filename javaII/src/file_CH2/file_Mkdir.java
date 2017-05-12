package file_CH2;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class file_Mkdir {

	public static void main(String[] args) {
//		File[] roots = File.listRoots();   //傳回root的list 回傳型態是file[]
//		for(File root:roots){           //物件陣列放物件    File[]裡面放File
//		System.out.println(root.getAbsolutePath());
//		System.out.println(root);
//		}
//		System.out.println(File.pathSeparator); //路徑與路徑 C:\;C:\
//		System.out.println(File.separator);
		
		File testdir = new File("./testdir");//.本目錄  字串方式
//public File(String pathname)
		if(!testdir.exists())testdir.mkdirs();//主副目錄皆不存  一併建立      mkdir主副有不存  不建立
//File 可以是目錄也可以是檔案
		File testfile1 = new File(testdir,"file2");  //副目錄裡面的檔案
//public File(String parent,String child)        
		if(!testfile1.exists()){
			try {
				testfile1.createNewFile();  
//public boolean createNewFile()throws IOException//例外捕捉
				System.out.println("Create Ok");
			} catch (IOException e) {   
				e.printStackTrace();
				System.out.println("Exception");
			}                 
		}
		File[] files = testdir.listFiles();
//public File[] listFiles()  回傳型態式陣列
		for(File file:files){
			System.out.println(file.getName());
		}
		System.out.println(new Date(testdir.lastModified()));
		System.out.println(testdir.listFiles());
	} 
}

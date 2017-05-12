package homework7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HW7 {

	public static void main(String[] args) throws IOException {
//請寫一個程式，可以在讀入一個檔案後，顯示有多少個位元組
		
//		System.out.println("請輸入檔案路徑");
//		String path = "";
//		try {
//			FileInputStream fin = new FileInputStream(path);
//			int sum = 0;
//			while (fin.read(new byte[1]) != -1) {
//				sum++;
//			}
//			System.out.println(sum);
//			fin.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//•請自行建立一個文字檔Sample.txt，內容如下：
//Java是一種電腦程式設計語言，擁有跨平台、物件導向、泛型程式設計的特性，廣泛應用於企業級Web應用開發和行動應用開發。
//任職於昇陽電腦的詹姆斯·高斯林等人於1990年代初開發Java語言的雛形，最初被命名為Oak，目標設定在家用電器等小型系統的程式語言，應用在電視機、電話、鬧鐘、烤麵包機等家用電器的控制和通訊。由於這些智慧型家電的市場需求沒有預期的高，Sun公司放棄了該項計劃。隨著1990年代網際網路的發展，Sun公司看見Oak在網際網路上應用的前景，於是改造了Oak，於1995年5月以Java的名稱正式釋出。Java伴隨著網際網路的迅猛發展而發展，逐漸成為重要的網路程式語言。
//Java程式語言的風格十分接近C++語言。繼承了C++語言物件導向技術的核心，Java捨棄了C++語言中容易引起錯誤的指標，改以參照取代，同時移除原C++與原來運算子多载，也移除多重繼承特性，改用介面取代，增加垃圾回收器功能。在Java SE 1.5版本中引入了泛型程式設計、類型安全的列舉、不定長參數和自動裝/拆箱特性。昇陽電腦對Java語言的解釋是：「Java程式語言是個簡單、物件導向、分布式、解釋性、健壯、安全與系統無關、可移植、高效能、多執行緒和動態的語言」
		
//		File hw = new File("./HW/Sample.txt");
//		if (!hw.exists()) {
//			hw.mkdirs();
//		}
//		byte[] byteOfData = "Java是一種電腦程式設計語言，擁有跨平台、物件導向、泛型程式設計的特性，廣泛應用於企業級Web應用開發和行動應用開發。\r\n任職於昇陽電腦的詹姆斯·高斯林等人於1990年代初開發Java語言的雛形，最初被命名為Oak，目標設定在家用電器等小型系統的程式語言，應用在電視機、電話、鬧鐘、烤麵包機等家用電器的控制和通訊。由於這些智慧型家電的市場需求沒有預期的高，Sun公司放棄了該項計劃。隨著1990年代網際網路的發展，Sun公司看見Oak在網際網路上應用的前景，於是改造了Oak，於1995年5月以Java的名稱正式釋出。Java伴隨著網際網路的迅猛發展而發展，逐漸成為重要的網路程式語言。\r\nJava程式語言的風格十分接近C++語言。繼承了C++語言物件導向技術的核心，Java捨棄了C++語言中容易引起錯誤的指標，改以參照取代，同時移除原C++與原來運算子多载，也移除多重繼承特性，改用介面取代，增加垃圾回收器功能。在JavaSE 1.5版本中引入了泛型程式設計、類型安全的列舉、不定長參數和自動裝/拆箱特性。昇陽電腦對Java語言的解釋是：「Java程式語言是個簡單、物件導向、分布式、解釋性、健壯、安全與系統無關、可移植、高效能、多執行緒和動態的語言」"
//				.getBytes();
//		try {
//			FileOutputStream fout = new FileOutputStream(hw);
//			fout.write(byteOfData);
//			fout.flush();
//			fout.close();
//			System.out.println("FileOutputStream OK");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
//(分別使用FileInputStream, FileReader, BufferedReader處理)
		
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		try {
//			DataInputStream din = new DataInputStream(new FileInputStream("./HW/Sample.txt"));
//			int temp;
//			int sum = 0;
//			while ((temp = din.read()) != -1) {
//				sum++;
//			}
//			a = sum;
//			din.close();
//			System.out.println(sum);
//			System.out.println("DataInputStream OK");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		try {
//			FileReader din = new FileReader("./HW/Sample.txt");
//			int temp;
//			int sum = 0;
//			while ((temp = din.read()) != -1) {
//				sum++;
//			}
//			b = sum;
//			System.out.println(sum);
//			din.close();
//			System.out.println("FileReader OK");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		try {
//			BufferedReader din = new BufferedReader(new FileReader("./HW/Sample.txt"));
//			int sum = 0;
//			while (din.readLine() != null) {
//				sum++;
//			}
//			c = sum;
//			System.out.println(sum);
//			din.close();
//			System.out.println("BufferedReader OK");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("Sample.txt檔案共有" + a + "個位元組，" + b + "個字元，" + c + "列資料");
		
//上面path: "./HW/Sample.txt"    下面path: "E:/Sample.txt"		
//		(分別使用FileInputStream, FileReader, BufferedReader處理)
		
//		String path = "C:/data_java_hw/Sample.txt";
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		try {
//			FileInputStream fin = new FileInputStream(path);
//			int temp;
//			while ((temp = fin.read()) != -1) {
//				a++;
//			}
//			fin.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		try {
//			FileReader din = new FileReader(path);
//			int temp;
//			while ((temp = din.read()) != -1) {
//				b++;
//			}
//			din.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		try {
//			BufferedReader din = new BufferedReader(new FileReader(path));
//			while (din.readLine() != null) {
//				c++;
//			}
//			din.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("Sample.txt檔案共有" + a + "個位元組，" + b + "個字元，" + c + "列資料");

//請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt
//的檔案裡 (請參考本章講義第23頁，使用append方式觀察效果)
		
//		File data = new File("C:/data_java_hw/Data.txt");
//		StringBuffer sb = new StringBuffer();
//		for(int i=0;i<10;i++){
//			sb.append((int)(Math.random()*1000+1)+"\r\n");
//		}
////		String s =sb.toString();
////		byte[] b=sb.toString().getBytes();
//		try {
//			FileOutputStream fout = new FileOutputStream(data);
//			fout.write(sb.toString().getBytes());
//			fout.flush();
//			fout.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//• 請設計一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案
		
//		String first = "C:/javawork/java.txt";
//		String second = "C:/data_java_hw/java.txt";
//		File from = new File(first);
//		File to = new File(second);
////		if(from.exists()){     //移動檔案
////			copyFile(from,to);
////			System.out.println("use copyFile()");
////		}
//		if(from.exists()&&to.exists()){
//			copyFile(from,to);
//			System.out.println("use copyFile()");
//		}
		
//• 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到
//C:\data_java_hw\Object.dat裡。注意物件寫入需注意的事項，若C:\內沒有data_java_hw資料夾，請用程式新增這個資料夾
		
		File hw = new File("C:/data_java_hw");
		if (!hw.exists()) {
			hw.mkdirs();
		}
		ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("C:/data_java_hw/Object.dat"));
//		Animal[] animal = new Animal[4];
//		animal[0] = new Cat("Amy");
//		animal[1] = new Cat("Ely");
//		animal[2] = new Dog("James");
//		animal[3] = new Dog("Anko");
//		for (int i = 0; i < 4; i++) {
//			oout.writeObject(animal[i]);
//		}
		oout.writeObject(new Cat("Amy"));
		oout.writeObject(new Cat("Ely"));
		oout.writeObject(new Dog("James"));
		oout.writeObject(new Dog("Anko"));
		oout.flush();
		oout.close();
		System.out.println("Oout OK");
		
//• 承上題，請寫一個程式，能讀出Object.dat這四個物件，並執行speak()方法觀察結果如何 (請利用多型簡化本題的程式設計)	

		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("C:/data_java_hw/Object.dat"));
		try {
			while (true) {
				((Animal) oin.readObject()).speak();
			}

		} catch (EOFException eofe) {
			System.out.println("Oin OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		oin.close();
	}

	static void copyFile(File file1, File file2) throws IOException {
		FileInputStream fin = new FileInputStream(file1);
		FileOutputStream fout = new FileOutputStream(file2);
		int temp;
		while ((temp = fin.read()) != -1) {
			fout.write(temp);
		}
		fout.close();
		fin.close();
	}
}

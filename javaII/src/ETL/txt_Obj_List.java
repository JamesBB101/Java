package ETL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;


public class txt_Obj_List {
	
//想要像是讀物件的方式將資料讀取出來
	
	public static void main(String[] args) {
		String path = "C:/Workspace/JavaEx_Part2/files/leagues.txt";
		InitializeLeagues iniLea =new InitializeLeagues();
		List<League> listLeague = iniLea.LeaguesInitialized(path);
   //物件呼叫方法傳入檔案位置  經過方法處理後會回傳一個List的collection裡面放的物件是League
//		PrintWriter out = new PrintWriter(System.out,true);
		for(League ll:listLeague){  //listLeague取出的是一個League的細項
			System.out.print(ll.getYear() + ",\t");
			System.out.print(ll.getSeason() + ",\t");
			System.out.print(ll.getTitle() + ",\t");
			System.out.println();
		}
	}
}
//此類別是將.txt檔的資料  用物件的方式存入list裡
class InitializeLeagues{
	public List<League> LeaguesInitialized(String fileName){
		
		List<League> listLeague = new LinkedList<League>();
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(fileName));
			String records;
			while((records = reader.readLine()) != null){
				String[] record = records.split("-");
				
				int year = /**Integer.parseInt(record[0])*/Integer.valueOf(record[0]);
				String season = record[1];
				String title = record[2];
				
				League item = new League(year, season, title);
				listLeague.add(item);	//List裡面放的物件是League細項
			}
			
		} catch (Exception e) {
			System.err.println("Exception occured while processing the leagues file:" + e);
		} finally{
			if ( reader != null){  //如果是不正常關閉最後還是會close()
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return listLeague;
	}
}
class League{
	int year;
	String season;
	String title;
	League(int year, String season, String title){
		this.year = year;
		this.season = season;
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public String getSeason() {
		return season;
	}
	public String getTitle() {
		return title;
	}
}

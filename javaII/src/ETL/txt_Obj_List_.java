package ETL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class txt_Obj_List_ {
	
	public static void main(String[] args) throws IOException {
		String path = "C:/Workspace/JavaEx_Part2/files/leagues.txt";
		BufferedReader br =
				new BufferedReader(new FileReader(path));
		String records;
		List<League2> listLeague = new LinkedList<League2>();
		while((records = br.readLine()) != null){
			
			System.out.println(records);
			
			String[] record = records.split("-");
			int year = Integer.parseInt(record[0]);
			String season = record[1];
			String title = record[2];
			League2 lg = new League2(year,season,title);
			listLeague.add(lg);
		}
		for(League2 l : listLeague){
			System.out.println(l);
		}
	}
}
class League2{
	int year;
	String season;
	String title;
	public League2(int year, String season, String title){
		this.year = year;
		this.season = season;
		this.title = title;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append( year + ",\t" + season + ",\t" + title + ",\t");
		return sb.toString();
	}
}




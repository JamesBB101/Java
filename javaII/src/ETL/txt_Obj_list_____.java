package ETL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class txt_Obj_list_____ {

	public static void main(String[] args) throws IOException {

		String path = "C:/Workspace/JavaEx_Part2/files/leagues.txt";
		InitializeLeagues_ iniLea =new InitializeLeagues_();
		List<League_> listLeague = iniLea.LeaguesInitialized(path);
		for(League_ l : listLeague){
			System.out.println(l);
		}
	}
}
class InitializeLeagues_{
	public List<League_> LeaguesInitialized(String fileName) throws IOException{
		List<League_> listLeague = new LinkedList<League_>();
		BufferedReader br = 
				new BufferedReader(new FileReader(fileName));
		String row;
		while((row = br.readLine()) != null){
			String[] str = row.split("-");
			League_ lg = new League_(Integer.parseInt(str[0]), str[1], str[2]);
			listLeague.add(lg);
		
		}
		br.close();
		return listLeague;
	}
}
class League_{
	int year;
	String season;
	String title;
	League_ (int year, String season, String title){
		this.year = year;
		this.season = season;
		this.title = title;
	}
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append( year + ", \t" + season + ", \t" + title +",");
		return sb.toString();
	}
}
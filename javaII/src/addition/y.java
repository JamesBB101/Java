package addition;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class y {

	public static void main(String[] args) throws IOException{

		String path = "C:/Workspace/JavaEx_Part2/files/leagues.txt";
		InitializeLeague il = new InitializeLeague();
		List<League> listLeague = il.InitilizeLeague(path);
		for(League l : listLeague){
			System.out.println(l);
		}
	}
}

class InitializeLeague {
	public List<League> InitilizeLeague(String fileName) throws IOException {
		List<League> listLeague = new LinkedList<League>();
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String str;
		while ((str = br.readLine()) != null) {
			String[] row = str.split("-");
			League lg = new League(Integer.parseInt(row[0]), row[1], row[2]);
			listLeague.add(lg);
		}
		return listLeague;
	}
}

class League {
	int year;
	String season;
	String title;

	public League(int year, String season, String title) {
		this.year = year;
		this.season = season;
		this.title = title;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(year + ",\t" + season + ",\t" + title + ",\t");
		return sb.toString();
	}
}

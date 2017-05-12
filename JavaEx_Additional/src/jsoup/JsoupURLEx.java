package jsoup;
/*
 * http://jsoup.org/  官方網站 (含jar檔下載)
 * http://www.open-open.com/jsoup/ (中文教學網站，簡體字請慎入...)
 */

import java.io.IOException;
import java.net.HttpURLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupURLEx {
	
	private static final String URL = "http://www.appledaily.com.tw";

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect(URL).get();	//Jsoup類別connect連接(URL).get() = 回傳Document型態
		
//new BufferedReader(new InputStreamReader((HttpURLConnection)url.openConnection().getInputStream()))
//有第三方套件就省略接水管
		
		if (doc != null) {								
			Elements urls = doc.select(".mrt > li > a");  //網頁選擇器class="mrt"裡面的li裡面的a
//<ul class="mrt">
//<li class="hsv"><time>12:28</time>
//<a href="/realtimenews/article/life/20170420/1101714/懷孕被當胖　賣消脂膏的氣死準媽媽" 
//  title="懷孕被當胖　賣消脂膏的氣死準媽媽" target="_blank">懷孕被當胖　賣消脂膏的氣死準媽媽</a></li>
//</ul>
			for (Element e : urls) {
				String url = URL + e.attr("href");  //URL + href 絕對路徑
				String title = e.attr("title");	//href , title 都是attribute
				System.out.println(url);
				System.out.println(title);
			}
		}
		
	}
}

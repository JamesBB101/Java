package jsoup;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class PttCrawler {
	private static final String PTT = "https://www.ptt.cc";
	private static final String GOSSPING_MAIN = "https://www.ptt.cc/bbs/Gossiping/index.html";

	public static void main(String[] args) throws IOException {
		
		// ***************** 1. 取得最新文章頁面編號 ***************** //
		HashMap<String, String> cookie = new HashMap<>();  
		cookie.put("over18", "1");
		Document doc = Jsoup.connect(GOSSPING_MAIN).cookies(cookie).get();  //cookies( < key, value >) 
		if (doc != null) {
			Elements elements = doc.select(".btn-group-paging > a");  //class="btn-group btn-group-paging"
			String str = elements.get(1).attr("href").replaceAll("/bbs/Gossiping/index([0-9]+).html", "$1"); 
			//取第二個a標籤屬性是href的值							//這邊的replaceAll不是替換      	 	用正規表示法表示我要取$第一個括號  
			int newIndex = Integer.parseInt(str) + 1;  
			System.out.println(newIndex);	

			// ********************* 2. 取得最新頁面文章標題 ********************* //
			String gossipingURL = "https://www.ptt.cc/bbs/Gossiping/index" + newIndex + ".html";
			Document doc2 = Jsoup.connect(gossipingURL).cookies(cookie).get();
			if (doc2 != null) {
				Elements elements2 = doc2.select(".title > a"); //class="title" 裡面的 a 標籤
				for (Element e : elements2) {
					String title = e.text();		//a標籤裡的text
					String href = e.attr("href");	//a標籤屬性是href的值   標題連結
					if (title.contains("[公告]")) {
						break;
					}
					System.out.println(title);

					// ********************* 3. 取得各篇文章內文 ******************* //

					String contentURL = PTT + href;	//網址+標題連結=完整標題網址  絕對路徑
					Document doc3 = Jsoup.connect(contentURL).cookies(cookie).get();	//回傳一個Jsoup的網頁文件(HTML,XML)
												//用程式抓每次都要搭配HashMap<"over18", "1">
					Element e2 = doc3.select(".article-metaline").last();	//class="article-metaline"
					Node node = e2.nextSibling();	//Sibling兄弟姊妹	div的下一個Sibling    透過方法取節點
					System.out.print(node.toString()); 		/**RE的前文怎麼沒被印到**/	//因為RE的平行是(div的下一個Sibling)空值
					System.out.println();
					Element e3 = null;
					Node node2 = null;
					if (!title.startsWith("Re")) {
						e3 = doc3.select("span[class=f2]").first();
						node2 = e3.nextSibling();
					} else {
						e3 = doc3.select("span[class=f2]").get(1);	
						node2 = e3.previousSibling();		//如果有Re  選<span class="f2">第二個的前一段
					}
					
					System.out.println(node2.toString());
					System.out.println("=======");

				}
			}
			
		}
	}

}

//					FileOutputStream br = 
//							new FileOutputStream("E:/txt/1.txt");
//						File dir = new File("E:/txt");
//						if(!dir.exists()){
//							dir.mkdirs();
//						}
//					
//					byte[] b = node.toString().getBytes();
//					byte[] b1 =	node2.toString().getBytes();
////					br.write(node.toString());	//BufferedWriter
////					br.write(node2.toString());
//					br.write(b);
//					br.write(b1);
//					br.flush();
//					br.close();
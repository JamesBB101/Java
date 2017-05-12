package jsoup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupXMLEx {

	// TaoYuan City WIFI hot spots
	public final static String URL = "http://data.tycg.gov.tw/api/v1/rest/datastore/ee54e090-7a79-4c56-a24a-5f1a7c426454?format=xml";

	public static void main(String[] args) throws IOException {
		Document doc = null;
		List<Hotspot> hotspotList = null;
		doc = Jsoup.connect(URL).get();
		
		if (doc != null) {
			hotspotList = new ArrayList<Hotspot>();//放Hotspot資料
			Elements rows = doc.select("records");//網頁選擇器records標籤
			for (Element row : rows) {
				Hotspot hotspot = getHotspot(row);//每個records放入getHotspot()方法
				  //回傳值是物件
				hotspotList.add(hotspot);//用ArrayList將物件儲存
			}
		}

		for (Hotspot hotspot : hotspotList) {
			System.out.println(hotspot);//如果有toString()會自動呼叫
		}
	}

	private static Hotspot getHotspot(Element element) {
		String id = element.select("項次").text();  //選擇 項次 標籤  裡面的文字
		String spot_name = element.select("熱點名稱").text();
		String type = element.select("熱點類別").text();
		String district = element.select("鄉鎮市區").text();
		String address = element.select("地址").text();
		
		Hotspot hotspot = new Hotspot(id, spot_name, type, district,
				address);		//傳入物件
		return hotspot;
	}//XML--->物件--->ArrayList--->取值
}

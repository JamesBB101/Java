package ETL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.StringTokenizer;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class address_speed {

	public static void main(String[] args) throws IOException, JSONException {
		URL url = new URL(URL);
		HttpURLConnection urlCon = (HttpURLConnection)url.openConnection();  //來源網址接到Http
//		urlCon.setRequestMethod("GET");  //default:GET
//		urlCon.setDoInput(true);
		
		InputStream is = urlCon.getInputStream();  //Http接入水管
		InputStreamReader isr = new InputStreamReader(is);      //UTF-8不用轉檔
		BufferedReader br = new BufferedReader(isr);
		
//new BufferedReader(new InputStreamReader((HttpURLConnection)url.openConnection().getInputStream()))
		
		StringBuilder sb = new StringBuilder();
		String str;
		while ((str = br.readLine()) != null) {//new BufferedReader(isr).readLine()
			sb.append(str);
//			StringTokenizer st1 = new StringTokenizer(str,"{");
//			while(st1.hasMoreElements()){
//				System.out.println(st1.nextToken());
//			}
		}

		JSONObject obj = new JSONObject(sb.toString());  //用JsonObj  打開Json格式{}
		JSONObject obj2 = obj.getJSONObject("result");  //變數打開JsonObj("result"){}  result is{}  打開result{}
		JSONArray jArray = obj2.getJSONArray("records");  //變數打開recordsArray("records")[]  records:[]
		for (int i = 0; i < jArray.length(); i++) {
			JSONObject data = jArray.getJSONObject(i);   //變數打開JSONObj(名稱)  打開每一個 {}
			String address = data.getString("address");	 //讀取address資料
			int speed = data.getInt("Haya_gen");
			System.out.println(i+1);
			System.out.println("地點: " + address);
			System.out.println("速限: " + speed +" hr/km");
			
			System.out.println("========================");
			
		}
		br.close();
		isr.close();
		is.close();
	}
	private static final String URL="http://data.tycg.gov.tw/api/v1/rest/datastore/6c002322-c486-4671-91b8-c3a6247c69c9?format=json";
}





//StringTokenizer st1 = new StringTokenizer(str,"{");
//while(st1.hasMoreElements()){
//	System.out.println(st1.nextToken());
//}

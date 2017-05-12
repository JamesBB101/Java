package ETL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class address_parking {

	private static final String MY_URL = "http://data.tycg.gov.tw/api/v1/rest/datastore/a1b4714b-3b75-4ff8-a8f2-cc377e4eaa0f?format=json";

	public static void main(String[] args) throws IOException, JSONException {
		URL url = new URL(MY_URL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setDoInput(true);

		InputStream is = con.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		StringBuilder sb = new StringBuilder();

		String str;
		while ((str = br.readLine()) != null) {
			sb.append(str);
		}
		
		JSONObject obj = new JSONObject(sb.toString());
		JSONObject obj2 = obj.getJSONObject("result");
		JSONArray jArray = obj2.getJSONArray("records");
		for (int i = 0; i < jArray.length(); i++) {
			JSONObject data = jArray.getJSONObject(i);
			String sna = data.getString("sna");
			int tot = data.getInt("tot");
			int sbi = data.getInt("sbi");
			
			System.out.println("中文站名: " + sna);
			System.out.println("總停車格: " + tot);
			System.out.println("現有數量: " + sbi);
			
			System.out.println("========================");
			
		}
		
		br.close();
		isr.close();
		is.close();
	}

}

package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSON_hw {

	public static void main(String[] args) throws IOException, JSONException {
		// 請同學讀取JSON (以餐廳為搜尋結果)取得以下地點資訊:
		// 1. name (地點名稱)
		// 2. rating (評分)
		// 3. lat (緯度)
		// 4. lng (經度)
		// 5. open_now (是否營業中)
		URL url = new URL(URL);
		HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
		urlCon.setRequestMethod("GET");// default:GET
		urlCon.setDoInput(true);

		InputStream is = urlCon.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		StringBuilder sb = new StringBuilder();

		String str;
		while ((str = br.readLine()) != null) {
			sb.append(str);
		}

		JSONObject dataJObj = null;
		Boolean open_now = false;
		JSONObject jObj = new JSONObject(sb.toString());
		JSONArray jArray = jObj.getJSONArray("results");
		for (int i = 0; i < jArray.length(); i++) {
			JSONObject data = jArray.getJSONObject(i);
			String name = data.getString("name");
			double rating = data.getInt("rating");
			JSONObject geoJObj = data.getJSONObject("geometry");
			JSONObject loaJObj = geoJObj.getJSONObject("location");
			double lat = loaJObj.getDouble("lat");
			double lng = loaJObj.getDouble("lng");
			try {
				dataJObj = data.getJSONObject("opening_hours");
				open_now = dataJObj.getBoolean("open_now");
			} catch (JSONException je) {
				open_now = null;
			}
			System.out.println("地點名稱: " + name);
			System.out.println("評分: " + rating);
			System.out.println("緯度: " + lat);
			System.out.println("經度: " + lng);
			System.out.println("是否營業中: " + open_now);

			System.out.println("========================");
		}
		br.close();
		isr.close();
		is.close();
	}
	private static final String URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=24.95375,121.22575&radius=500&types=food&name=%E5%90%83%E5%88%B0%E9%A3%BD&language=zh-TW&key=AIzaSyAYmC8oUYc9DGAZn8hqZKakFeclhAbTRSI";
}
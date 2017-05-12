package ETL;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetPictureFromInternet {

	public static void main(String[] args) {
		File dir = new File("E:/Images");
		if (!dir.exists()) {
			dir.mkdir();
		}

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		for (int i = 1; i <= 3; i++) {
			String url = "http://www.space-fox.com/wallpapers/celebs/natalie-portman/natalie_portman_" + i
					+ ".jpg";
			
			String filename = url.substring(url.lastIndexOf("/") + 1);    //擷取url字串的最後一段  照片名稱  作為檔名
			File file = new File(dir, filename);
			try {
				URL myURL = new URL(url);
				HttpURLConnection conn = (HttpURLConnection) myURL.openConnection();  //來源網址(位置)連接Http
				InputStream is = conn.getInputStream();  //載入成InputStream
				bis = new BufferedInputStream(is);
				
				bos = new BufferedOutputStream(new FileOutputStream(file));
				System.out.println("Wallpaper: " + filename + " kick-off!");

				int length = 0;
				byte[] b = new byte[8192];   //建立8192byte緩衝區
				while ((length = bis.read(b)) != -1)   
					bos.write(b, 0, length);
				bos.flush();
				bos.close();
				System.out.println(filename + " Done!");

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

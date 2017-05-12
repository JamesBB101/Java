package ETL;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class GetPictureThread_main {

	public static void main(String[] args) {
		File dir = new File("E:/Images");
		if (!dir.exists()) {
			dir.mkdir();
		}
		
		for (int i = 4882; i <= 4897; i++) {
			String url = "http://www.thewallpapersonline.com/thumbnail/cassie-lane/cassie-lane-"+i+".jpg";
			Thread t = new Thread(new GetPictureThread(dir, url));
			t.start();			//實作thread   藉由建構子傳遞訊息
//			GetPictureThread t = new GetPictureThread(dir, url);  //GetPictureThread extends Thread 
		}
	}

}
class GetPictureThread implements Runnable {
	private File dir;
	private String url;

	public GetPictureThread(File dir, String url) {
		this.dir = dir;
		this.url = url;
	}

	@Override
	public void run() {
		String filename = url.substring(url.lastIndexOf("/") + 1);// 擷取最後一段為檔名
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		File file = new File(dir, filename);// 儲存位置
		
		try {
			URL myURL = new URL(url); // 來源網址位置
			HttpURLConnection conn = (HttpURLConnection) myURL.openConnection(); // 網址開啟連接到Http
			bis = new BufferedInputStream(conn.getInputStream()); // Http接入水管
			bos = new BufferedOutputStream(new FileOutputStream(file)); // 寫出檔案的水管

			System.out.println("Wallpaper: " + filename + " kick-off!");

			int length = 0;
			byte[] b = new byte[8192];
			while ((length = bis.read(b)) != -1){   //改寫BufferedInputStream的緩衝區大小
				bos.write(b, 0, length);
			}
			bos.flush();
			bos.close();
			System.out.println(filename + " Done!");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		long from = System.currentTimeMillis();
//		long to = System.currentTimeMillis();
//		System.out.println((from - to) / 1000);
	}
	
}
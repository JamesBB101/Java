package idv.david.json;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONArray_List {

	public static void main(String[] args) throws JSONException, ParseException {
		String jsonStr = "";
		Book book1 = new Book("Java", 500, "John");
		Book book2 = new Book("Android", 600, "Allen");
		
		List<Book> bookList = new ArrayList<Book>();//建立List儲存Book類別物件
		bookList.add(book1);				
		bookList.add(book2);	//bookList:[book1,book2]
		
//		OrderMaster order = new OrderMaster("001", "JB", new Date(), bookList);
		
		// List to JSONArray  
		jsonStr = new JSONArray(bookList).toString();  //bookList = [book1,book2] 轉成 JSONArray格式
//new JSONArray(bookList).toString() = 
//	   [{"price":500,"author":"John","name":"Java"},{"price":600,"author":"Allen","name":"Android"}]
		System.out.println("List to JSON: \n" + jsonStr);
		
		// JSONArray to List (JSONArray拆解)
		List<Book> books = new ArrayList<Book>();
		
		JSONArray jsonArray = new JSONArray(jsonStr);	//解開JSONArray
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject json_book = jsonArray.getJSONObject(i);  //打開每一個 {}
			String book_name = json_book.getString("name");
			double book_price = json_book.getDouble("price");
			String book_author = json_book.getString("author");
			Book book = new Book(book_name, book_price, book_author);
			
			books.add(book);
		}
		for (Book book : books) {	//List裡面放物件  物件呼叫方法
			book.show();
		}
		System.out.println();
		
	}
}


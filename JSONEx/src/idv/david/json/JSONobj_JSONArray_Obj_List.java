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

public class JSONobj_JSONArray_Obj_List {

	public static void main(String[] args) throws JSONException, ParseException {
		String jsonStr = "";
		Book book1 = new Book("Java", 500, "John");
		Book book2 = new Book("Android", 600, "Allen");
		
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(book1);		//建立List儲存Book類別物件		
		bookList.add(book2);	//bookList:[book1,book2]
		
		OrderMaster order = new OrderMaster("001", "JB", new Date(), bookList);

		// Object (with List) to JSON
		jsonStr = new JSONObject(order).toString();
//Object (with List) to JSON: 
//		{"date":"Sun Apr 16 16:33:35 CST 2017","orderId":"001","customer":"JB",
//		"bookList":[{"price":500,"author":"John","name":"Java"},{"price":600,"author":"Allen","name":"Android"}]}

		System.out.println("Object (with List) to JSON: \n" + jsonStr);
		
		
		
		// JSON to Object (with List)
		JSONObject orderObj = new JSONObject(jsonStr);  //解開JSONObject
		
		String orderId = orderObj.getString("orderId");
		String customer = orderObj.getString("customer");
		// Locale.ENGLISH could be needed if current locale != ENGLISH
		// pattern letters refers to SimpleDateFormat in Javadoc
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy", Locale.ENGLISH);
		Date date = simpleDateFormat.parse(orderObj.getString("date"));
		
		JSONArray jsonArray_books = orderObj.getJSONArray("bookList");
		
		List<Book> BookList = new ArrayList<Book>();
		
		for (int i = 0; i < jsonArray_books.length(); i++) {
			JSONObject json_book = jsonArray_books.getJSONObject(i);
			String bookName = json_book.getString("name");
			double bookPrice = json_book.getDouble("price");
			String bookAuthor = json_book.getString("author");
			
			Book book = new Book(bookName, bookPrice, bookAuthor);
			BookList.add((book));
		}
		OrderMaster myOrder = new OrderMaster(orderId, customer, date, BookList);
		myOrder.show();
	}
}

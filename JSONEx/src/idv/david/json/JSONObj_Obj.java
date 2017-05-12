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


public class JSONObj_Obj {

	public static void main(String[] args) throws JSONException {
		String jsonStr = "";
		Book book1 = new Book("Java", 500, "John");
		Book book2 = new Book("Android", 600, "Allen");
		
//		List<Book> bookList = new ArrayList<Book>();
//		bookList.add(book1);		//建立List儲存Book類別物件		
//		bookList.add(book2);	//bookList:[book1,book2]
		
//		OrderMaster order = new OrderMaster("001", "JB", new Date(), bookList);
		
		//Object to JSONObject
		jsonStr = new JSONObject(book1).toString(); //book1 ==> JSON 
//new JSONObject(book1).toString() = {"price":500,"author":"John","name":"Java"}
		System.out.println("Object to JSON: \n " + jsonStr);

		// JSON to Object
		JSONObject jsonObj = new JSONObject(jsonStr); 
//jsonObj = "price":500,"author":"John","name":"Java"
		String name = jsonObj.getString("name");  	 //Java
		double price = jsonObj.getDouble("price");	 //500
		String author = jsonObj.getString("author"); //John
		
		Book myBook = new Book(name, price, author); //(Java, 500, John)
		myBook.show();
	}
}




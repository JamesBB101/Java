package ch03;

public class GenericAdv_ {
	public static void main(String[] args){
		Book<Integer> book = new Book<Integer>();//<? extends Number>   Number之子型態
		book.price = 580;		//使用物件的變數型態只能是Integer  同時傳入price變數值為580
		Book.show(book);  //傳入物件
	}
}
class Book<T>{
	T price;    //被book.price定義為580
	public static void show(Book<? extends Number> b){ //傳入物件為new Book<Integer>()
		System.out.println("書籍定價為：" + b.price);   
	}
}
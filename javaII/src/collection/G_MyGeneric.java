package collection;

import java.util.*;

public class G_MyGeneric {
	public static void main(String[] args) {
		MyGenericType<String> myGeneric = new MyGenericType<String>();
		for (int i = 0; i < 3; i++) {        
			myGeneric.add("number" + i);   //此時被new的出來的實體使用MyGenericType中add方法
			System.out.println(myGeneric.get(i));
		}
	}
}
class MyGenericType<T> {

	private List<T> list;

	public MyGenericType() {    //MyGenericType被實作時建構子定義list類別變數為Vector<T>
//		list = new ArrayList<T>();
		list = new Vector<T>();
	}
	public void add(T t) {   //放在list變數中T型別的元素
		list.add(t);
	}
	public T get(int i) {
		return list.get(i);
	}
}
//new出物件 , 呼叫建構子時 , 定義類別變數 = List型別<T>的Vector<T>物件
//可以在自定方法中使用Vector<T>方法  
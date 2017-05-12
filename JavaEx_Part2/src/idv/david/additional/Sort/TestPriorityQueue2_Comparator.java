package idv.david.additional.Sort;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TestPriorityQueue2_Comparator {
	public static void main(String[] args) {
		
//		//匿名類別     Interface作物件  直接在匿名類別 { 實作  }  
//		Comparator<String> c = new Comparator<String>() {  
//			public int compare(String a, String b) {
//				return a.compareTo(b) * -1;
//			}
//		};
		
		MyComparator c = new MyComparator();
		//PriorityQueue( 容量 , 依照什麼物件作排序 )   PriorityQueue本身具備排序功能
		PriorityQueue<String> pq = new PriorityQueue<String>(3, c);
		pq.offer("c");
		pq.offer("a");
		pq.offer("b");
		String s;
		while ((s = pq.poll()) != null) {
			System.out.print(s + ", ");
		}
	}
}
//Comparator is Interface  用MyComparator實作出來
//實作Comparator  讓集合可以參考排序內容  (自作比較規則)  後存入變數 ,以放入其他class的建構子中當參數
class MyComparator implements Comparator<String>{
	public int compare(String s1,String s2){
		return s1.compareTo(s2) * -1;    //顛倒
	}
}

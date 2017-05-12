package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class List_LinkedList_ArrayList {
	public static void main(String[] args) {
//		ArrayList list1 = new ArrayList();
		LinkedList list1 = new LinkedList();
		list1.add("Brad"); // 0
		list1.add(2); // 1
		list1.add(true); // 2
		list1.add("Brad"); // 3

		list1.add(4, "Test1");
		System.out.println(list1.size());
		
		for (Object x : list1) { // Object[]
			System.out.println(x);
		}

		System.out.println("------------------------");
		list1.remove("Brad");  //先remove first
		System.out.println(list1.size());
		
		System.out.println("------------------------");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println(list1.toString());
		System.out.println(list1);    //自動呼叫toString
		
		Iterator it = list1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

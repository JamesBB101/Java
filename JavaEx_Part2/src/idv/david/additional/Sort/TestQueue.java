package idv.david.additional.Sort;

import java.util.*;

public class TestQueue {
	public static void main(String[] args) {
		Queue q = new LinkedList();
		q.offer("First");
		q.offer("Second");
		q.offer("Third");
		
		Object o;   //o is a ObjectType
		
		System.out.println(q.toString());
		while ((o = q.poll()) != null) {  //poll()取出後同時移除
			String s = (String) o;    //String s = (String) q.poll()  回傳是一個Object
			System.out.println(s);
		}
		System.out.println(q.toString());
	}
}

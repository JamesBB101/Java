package idv.david.additional.Sort;

import java.util.*;

public class TestLinkedHashSet {
	public static void main(String args[]) {

		//LinkedList "加入順序"作為排序
		//HashSet加入no repeat的功能
		
		Set set = new LinkedHashSet();
		set.add(new Integer(12));   //hashCode() & equals()  告訴HashSet內容相等
		set.add(new Integer(56));
		set.add(new Integer(34));
		set.add(new Integer(12));

		Iterator objs = set.iterator();
		while (objs.hasNext())
			System.out.println(objs.next());
		
		System.out.println("===========");
		
		//HashSet只有no repeat的功能
		
		Set set2 = new HashSet();
		set2.add(new Integer(56));
		set2.add(new Integer(34));
		set2.add(new Integer(12));
		 
		Iterator objs2 = set2.iterator();
		while(objs2.hasNext())
		    System.out.println(objs2.next());
	}
}

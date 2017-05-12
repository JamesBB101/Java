package ch03_Sort;

import java.util.*;

public class TestTreeSet {
	public static void main(String args[]) {
		Set<Integer> set = new TreeSet();   //TreeSet have Sort
		set.add(new Integer(56));			//no index no repeat
		set.add(new Integer(34));
		set.add(new Integer(12));

		Iterator objs = set.iterator();
		while (objs.hasNext())
			System.out.println(objs.next());
		
		for(Integer val:set){
			System.out.print(val+"\t");
		}
	}
}

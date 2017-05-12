package collection;

import java.util.HashSet;

public class Set_HashSet {

	public static void main(String[] args) {
		//use hashCode() & equal() to 比教內容達到noRepeat
		HashSet set = new HashSet();
		set.add(12); // int --> Integer autoBoxing
		set.add("brad");
		set.add(new Integer(12));//重複
		set.add(true); // bollean -> Boolean
		set.add("12");  //String
		set.add("brad");

		System.out.println(set.size());
		System.out.println(set.toString());

	}

}

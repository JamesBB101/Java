package Object_ch13;

import java.util.ArrayList;

public class wrapperParse {

	public static void main(String[] args) {
		Integer wInt = new Integer(1);
		// JDK 1.4以前，一定要像這樣先做轉型的動作，轉型回int才能運算
		int x = wInt.intValue();    //unboxing
		int y = Integer.parseInt("1");  //use static method parse型態(String s)
		System.out.println(x + y);

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);  //add(new Integer(i))
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2=list;
		System.out.println(list.equals(list2));   //boolean equals(Object obj)
		System.out.println(list==list2);

	}

}

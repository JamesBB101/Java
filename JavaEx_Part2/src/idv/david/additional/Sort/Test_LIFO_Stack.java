package idv.david.additional.Sort;

import java.util.*;

public class Test_LIFO_Stack {
	
	public static void main(String[] args) {
		//Stack(堆疊)後進先出
		Stack<String> list = new Stack();
		list.add("c");
		list.add("a");
		list.add("b");
		list.add("a");
		System.out.println(list.toString());

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		System.out.println();

		while (!list.empty())
			System.out.println(list.pop());
		
	}
}
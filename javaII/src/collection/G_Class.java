package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class G_Class {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
//		TreeSet<Integer> set = new TreeSet<Integer>();
		while (set.size() < 6) {
			set.add((int) (Math.random() * 49 + 1));
		}
		for (Integer i : set) {
			System.out.println(i);
		}
		System.out.println(set.toString());
		System.out.println(set);
		
		
		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		int i=0;
		while(hs.size()<6){
			hs.put(i++,(int)(Math.random()*49)+1);
		}
		for(Integer ii:hs.values()){
			System.out.println(ii);
		}
	}
}

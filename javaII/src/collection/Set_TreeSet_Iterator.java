package collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set_TreeSet_Iterator {
	
	public static void main(String[] args){
		//use compaerTo 比較內容if(==) return 0; 達到元素不重覆
		TreeSet set = new TreeSet();
		
		while (set.size()<6){
			set.add((int)(Math.random()*49)+1);
		}
		System.out.println(set.toString());

		Iterator it = set.iterator(); 
		while (it.hasNext()){
			Integer num = (Integer)it.next();  //set裡都是obj
			System.out.println(num);
		}
		
		for(Object t:set){
			System.out.println(t);
		}
		
		HashSet set1 = new HashSet();
		while(set1.size()<6){  //元素個數<長度
			set1.add((int)(Math.random()*49)+1);
		}
		System.out.println(set1.toString());
	}
}

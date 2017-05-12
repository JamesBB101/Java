package collection;

import java.util.HashMap;
import java.util.Hashtable;

public class Map_HashMap_Hashtable_Values_keySet {

	public static void main(String[] args) {
//		Hashtable map1 = new Hashtable();
		HashMap<String,Object> map1 = new HashMap();
		
		map1.put("name", "Brad");  //put會檢查kay值
		map1.put("weight", 80.4);
		map1.put("length", 176);
//		map1.put(null, 17);
//		map1.put(12, null);   //Hashtable不可null
		
		System.out.println(map1.size());
		//map1.size()  幾個kay
		System.out.println(map1.get(null));
		
		System.out.println("------------------------");
		for(Object m : map1.values()){      // key:value  
			System.out.println(m);			
		}								
										//values()   keySet()	
		System.out.println("------------------------");
		for(String m:map1.keySet()){
			System.out.println(m);
		}
	}

}

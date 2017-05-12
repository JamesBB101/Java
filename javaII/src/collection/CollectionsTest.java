package collection;
import java.util.Collections;
import java.util.LinkedList;


public class CollectionsTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		for(Object obj: list){  //Object[]
			System.out.println(obj);
		}
		System.out.println("----------------------");
		
		//use class . static method
//		Collections.sort(list);
//		Collections.reverse(list);
//		Collections.rotate(list,-1);
		Collections.shuffle(list); //洗牌
		for(Object obj: list){
			System.out.println(obj);
		}
		
	}

}

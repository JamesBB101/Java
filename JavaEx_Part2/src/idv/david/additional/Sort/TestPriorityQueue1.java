package idv.david.additional.Sort;

import java.util.*;

public class TestPriorityQueue1 {
	
	public static void main(String[] args) {
		//PriorityQueue 排序功能
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.offer("c");
		pq.offer("a");
		pq.offer("b");
		String s;
		while ((s = pq.poll()) != null) {  //取出同時移除
			System.out.print(s + ", ");
		}
	}
}

package homework8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HW8_2_2 {

	public static void main(String[] args) {
//		• 因為因應年假人潮，台鐵想要再加開一個車次(116, “自強”, “高雄”, “台北”,500)在原本7個車次的後面，請問該如何設計程式碼
//		• 承上，有哪些取值的方式能得到這8個Train的物件

		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t8 = new Train(116, "自強", "高雄", "台北", 500);
		
		LinkedList<Train> linkedList = new LinkedList<Train>();
		linkedList.add(t1);
		linkedList.add(t2);
		linkedList.add(t3);
		linkedList.add(t4);
		linkedList.add(t5);
		linkedList.add(t6);
		linkedList.add(t7);
		
		linkedList.addLast(t8);

		System.out.println("-----------------------------------------------");
		Iterator<Train> it = linkedList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().show());
		}
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i).show());
		}
		System.out.println("-----------------------------------------------");
		for (Train l : linkedList) {
			System.out.println(l.show());
		}
		
		
		System.out.println("-----------------------------------------------");
		Object[] lkl1 = linkedList.toArray();
		for (int i = 0; i < lkl1.length; i++) {
			System.out.println(((Train) lkl1[i]).show());
		}
		System.out.println("-----------------------------------------------");
		Object[] lkl2 = linkedList.toArray();
		for(Object tt:lkl2){
			System.out.println(((Train)tt).show());
		}
	}
}

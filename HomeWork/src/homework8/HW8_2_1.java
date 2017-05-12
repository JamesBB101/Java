package homework8;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HW8_2_1 {

	public static void main(String[] args)	 {
		
//		練習作業
//		• 請設計一個Train類別，並包含以下屬性：
//		 - 班次 number，型別為int
//		 - 車種 type，型別為String
//		 - 出發地 start，型別為String
//		 - 目的地 dest，型別為String
//		 - 票價 price，型別為double
//		• 設計對應的getter/setter方法，並透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
//		 - (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//		 - (1254, “區間”, “屏東”, “基隆”, 700)
//		 - (118, “自強”, “高雄”, “台北”, 500)
//		 - (1288, “區間”, “新竹”, “基隆”, 400)
//		 - (122, “自強”, “台中”, “花蓮”, 600)
//		 - (1222, “區間”, “樹林”, 七堵, 300)
//		 - (1254, “區間”, “屏東”, “基隆”, 700)
		
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
//		• 請寫一隻程式，能讓台鐵安排車次的人員取得不會重覆的Train物件(請分別用Iterator與for迴圈取值)

		Set<Train> treeSet = new TreeSet<Train>();
		treeSet.add(t1);
		treeSet.add(t2);
		treeSet.add(t3);
		treeSet.add(t4);
		treeSet.add(t5);
		treeSet.add(t6);
		treeSet.add(t7);

		Iterator<Train> it = treeSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().show());
		}
		System.out.println("---------------------------------------------------");
		for (Train t : treeSet) {
			System.out.println(t.show());
		}
		System.out.println("---------------------------------------------------");

//		• 承上，Train物件不會重覆之外，還能讓班次編號由大排到小列出
		//HashSet自定類別要不重覆加入hashCode()&equals()比對方法
		//TreeSet用compareTo()  if(==) return 0;
		for (Train t : treeSet) {
			System.out.println(t.show());
		}
		
		System.out.println("---------------------------------------------------");
	}
}

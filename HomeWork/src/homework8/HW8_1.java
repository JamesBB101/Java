package homework8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HW8_1 {

	public static void main(String[] args) {
//		練習作業
//		• 請建立一個Collection物件並將以下資料加入：
//		 - new Integer(100)
//		 - new Double(3.14)
//		 - new Long(21L)
//		 - new Short(“100”)
//		 - new Double(5.1)
//		 - “Kitty”
//		 - new Integer(100)
//		 - new Object()
//		 - “Snoopy”
//		 - new BigInteger(“1000”)
//		• 印出這個物件裡的所有元素(使用Iterator, 傳統for與增強for)
//		• 移除不是java.lang.Number家族的物件
//		• 再次印出這個集合物件的所有元素，觀察是否已將非Number家族的物件移除成功

		List<Object> arrayList = new ArrayList<Object>();
		arrayList.add(new Integer(100));
		arrayList.add(new Double(3.14));
		arrayList.add(new Long(21L));
		arrayList.add(new Short("100"));
		arrayList.add(new Double(5.1));
		arrayList.add("Kitty");
		arrayList.add(new Integer(100));
		arrayList.add(new Object());
		arrayList.add("Snoopy");
		arrayList.add(new BigInteger("1000"));

		Iterator<Object> it = arrayList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------------");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("---------------------");
		for (Object al : arrayList) {
			System.out.println(al);
		}
		System.out.println("*********************");
		Iterator<Object> it2 = arrayList.iterator();
		Object o;
		while (it2.hasNext()) {
			if ((o = it2.next()) instanceof Number) {
				System.out.println(o);
			} else {
				it2.remove();
			}
		}
		System.out.println(arrayList);
	}
}

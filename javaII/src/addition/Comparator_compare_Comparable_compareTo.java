package addition;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Comparator_compare_Comparable_compareTo {

	public static void main(String[] args) {
/*
 * Q1: 規格書說明，People裡頭要實作Comparable，外部使用者會依照人名字串長度，以多排到少，程式該如何寫?
 * Q2: 你發現寫People類別的菜鳥設計師不會撰寫Comparable，而你也無法去改寫他寫的People，請實作Comparator方法，
 *   來讓manyPeople擁有: 年齡大到小、年齡小到大、人名字母A~Z、人名字母Z~A、人名字串長度多到少、人名字串長度少到多 排序的方法
 * hint:Q1可參考課本9-29 Sort3.java
 *   Q2可參考課本9-31 Sort5.java、課本12-2 (講解到Lambda以前的說明也可參考)
 */
		People[] manyPeople = new People[3];
		manyPeople[0] = new People("Larry", 40);
		manyPeople[1] = new People("Andy", 20);
		manyPeople[2] = new People("Joseph", 30);

		Arrays.sort(manyPeople);//對People這個型態作排序
					//此時JVM會自動去People類別找compareTo方法  

		for (int i = 0; i < manyPeople.length; i++) {
			People mp = manyPeople[i];
			System.out.println(mp.name);
		}
		
		
//匿名類別    省略類別實作  直接用介面new初物件後包住{實作}
		Comparator<People> c = new Comparator<People>() {
			public int compare(People s1, People s2) {
//				if ((s1.name.length()) > (s2.name.length())) {
//					return -1;
//				} else {
//					return 1;
//				}
				return s1.compareTo(s2) * -1;
//				if ((s1.age) > (s2.age)) {
//					return -1;
//				} else {
//					return 1;
//				}
			}
		};
		
		PriorityQueue<People> pq = new PriorityQueue<People>(3, c);
		for(int i=0;i<3;i++){
			pq.offer(manyPeople[i]);
		}
		Object s;
		while ((s = pq.poll()) != null) {
			System.out.print(((People)s).name + ", ");
//			System.out.print(((People)s).age + ", ");
		}
	}
}
class People implements Comparable<People> {
	String name;
	int age;
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int compareTo(People manyPeople) {
//		if( (this.name.length()) > (manyPeople.name.length()) ){
//			return -1;
//		}else {
//			return 1;
//		}   //比字串
		return this.name.compareTo(manyPeople.name) * 1;
	}//左邊大於右邊>0  (正,往右移一格)   比開頭大小
}

//public final class String
//extends Object
//implements Serializable, Comparable<String>, CharSequence
//String 已實作Comparable  所以可以直接使用CompareTo()
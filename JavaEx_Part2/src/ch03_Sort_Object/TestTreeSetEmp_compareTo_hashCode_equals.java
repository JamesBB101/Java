package ch03_Sort_Object;

import java.util.*;

public class TestTreeSetEmp_compareTo_hashCode_equals {
	public static void main(String args[]) {
		Set<Employee> set = new TreeSet<Employee>();
		//TreeSet 限制不能重複但是諾發生
		//<自定物件> 重覆,判斷要不加入    對compareTo 修正if(==)return 0;
		Employee e1 = new Employee(7001, "king1");
		Employee e2 = new Employee(7002, "king2");
		Employee e3 = new Employee(7003, "king3");
		Employee e4 = new Employee(7004, "king4");
		Employee e5 = new Employee(7005, "king5");
		Employee e6 = new Employee(7005, "king5");   //compareTo if(==)return 0;
		
		set.add(e5);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e1);
		set.add(e6); //compareTo if(==)return 0;

		for (Employee aEmp : set) {
			System.out.println(aEmp.getEmpno() + "-" + aEmp.getEname());
		}
		
		System.out.println("===========");
		
		//hashSet 限制 不能重複但是諾發生
		//<自定物件> 重覆,判斷要不加入     對自定物件加入hashCode()模糊比對 & equals()精準比對;
		//JVM在判斷物件內容時equals()還未改寫只會比較未置  
		//因為自定物件有可能是bigData所以加入hashCode()模糊比對  提升效能
		Set<Employee> set2 = new HashSet<Employee>();
		Employee em1 = new Employee(7001, "king1");
		Employee em2 = new Employee(7002, "king2");
		Employee em3 = new Employee(7003, "king3");
		Employee em4 = new Employee(7004, "king4");
		Employee em5 = new Employee(7005, "king5");
		Employee em6 = new Employee(7005, "king5");   //hashCode() & equals()  告訴HashSet內容相等
		
		set2.add(em5);
		set2.add(em2);
		set2.add(em3);
		set2.add(em4);
		set2.add(em1);
		set2.add(em6);   //hashCode() & equals()

		for (Employee aEmp2 : set2) {
			System.out.println(aEmp2.getEmpno() + "-" + aEmp2.getEname());
		}
	}
}

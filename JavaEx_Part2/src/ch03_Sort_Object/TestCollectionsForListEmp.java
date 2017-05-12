package ch03_Sort_Object;

import java.util.*;

public class TestCollectionsForListEmp {

	public static void main(String args[]) {
		List<Employee> list = new ArrayList<Employee>();
		//List當作資料型態  放入collection中的型態是Employee
		//<T>泛型會先檢查自定類別是否有加compareTO()
		
		Employee e1 = new Employee(7001, "king1");
		Employee e2 = new Employee(7002, "king2");
		Employee e3 = new Employee(7003, "king3");
		Employee e4 = new Employee(7004, "king4");
		Employee e5 = new Employee(7005, "king5");

		list.add(e5);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e1);

		Collections.sort(list);  //對應到自定類別中compareTo()方法		
//		Collections.reverse(list);

		for (Employee Emp : list) {
			System.out.println(Emp.getEmpno() + "-" + Emp.getEname());
		}
		
	}
}

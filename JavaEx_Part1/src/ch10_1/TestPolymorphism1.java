package ch10_1;

public class TestPolymorphism1 {

	public static void main(String[] args) {
		 EmployeePoly e1 = new FullTimeEmployeePoly(7002 ,"peter", 50000.0 );    //e1是正值  型態是員工
         EmployeePoly e2 = new ManagerPoly(7003 ,"merry", 50000.0 , 10000.0);   //型態都是員工
         EmployeePoly e3 = new PartTimeEmployeePoly(7004 , "John" , 1000.0, 8);
         
//       FullTimeEmployeePoly  f  =  (FullTimeEmployeePoly)e1;   //Type casting
//       ManagerPoly  m  =  (ManagerPoly)e1;                     //執行時期:java.lang.ClassCastException
//       PartTimeEmployeePoly  m  =  (PartTimeEmployeePoly)e1;   //執行時期:java.lang.ClassCastException
         
         System.out.println(e1 instanceof FullTimeEmployeePoly);  //true   真正內容是正值員工  正值員工  instenceof是不是 正值  經理  打工仔
         System.out.println(e1 instanceof ManagerPoly);           //false   
         System.out.println(e1 instanceof PartTimeEmployeePoly);  //false
//instanceof用來判斷父類別參考真正指向何種子類別的實體
         System.out.println(e2 instanceof FullTimeEmployeePoly);  //true  e2是經理可以是正值
         System.out.println(e2 instanceof ManagerPoly);           //false   
         System.out.println(e2 instanceof PartTimeEmployeePoly);  //false
	
	}

}

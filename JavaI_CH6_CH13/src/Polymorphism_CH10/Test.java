package Polymorphism_CH10;

public class Test {

	public static void main(String[] args) {
		Emp[] e = new Emp[3];
		Emp e1 = new Emp(1,"A");
		Emp e2 = new FullTimeEmp(2,"B",100);  //e2是FullTimeEmp子類別  儲存在父類別的型態 
		Emp e3 = new Manager(3,"c",150,50);
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		for(int i=0;i<e.length;i++){
			System.out.println(e[i].getSalary());   //儲存進去後print出來
		}
//		Emp e1 = new Emp(1,"A");       強制轉型
//		Manager a=(Manager) e1;
//		Manager a=(Manager) new Emp(1,"A");
		
//		Emp[] a = new Emp[3];
//		a[0]=new Emp(1,"A");              
//		a[1]=new FullTimeEmp(2,"B",100);   //子類別可使用父類別型態  
//		a[2]=new Manager(3,"c",150,50);  //Manager儲存在父類別Emp的型態中
//		for(Emp v:a){                      //型態是Emp  
////			System.out.println(v.getSalary());        
//			System.out.println(v);      //傳出這個類別位子steack memory
//		
//		}
		
		Emp e4 = new Emp(1,"A");
		System.out.println(e1.equals(e4));
		System.out.println(e4);   // equal值相同  記憶體位置不一樣   內容值相同
		System.out.println(e1);
		System.out.println(e4.empno);    //呼叫變數
	}

}

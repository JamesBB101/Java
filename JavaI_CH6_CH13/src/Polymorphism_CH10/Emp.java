package Polymorphism_CH10;

public class Emp {
	 int empno;
	private String ename;
	public Emp(int empno,String ename){
		this.empno=empno;
		this.ename=ename;
	}
	public Emp(int empno){
		this(empno,"-");
	}
	public Emp(){
		this.empno=0;
		this.ename="-";
	}
	public void display(){
		System.out.println("empno=" + empno+"ename=" + ename);
	}
	public double getSalary(){
		return 0;
	}
	
	public boolean equals(Object obj) {
	// 仍要使用==來判斷，因為(也許)要比較的"物件參考變數"，其實指的是同一個實體(指向同一個記憶體空間)
	if (this == obj)
		return true;
	// 用(Object類別的)getClass()來確定是否隸屬於同一個class的物件
	if (obj != null && this.getClass() == obj.getClass()) {
		if (obj instanceof Emp) {
			Emp e = (Emp) obj;
			// 選擇該類別的必要成員變數(實體變數)來加以判斷是否有相等(相同)
			if (empno == e.empno && ename.equals(e.ename)) {
				return true;
			}
		}
	}
	return false;
	}
}
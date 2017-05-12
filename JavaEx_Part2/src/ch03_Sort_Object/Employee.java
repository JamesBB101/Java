package ch03_Sort_Object;

public class Employee implements Comparable<Employee> {
								//use superClass當資料型態
	private int empno;
	private String ename;

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public Employee(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	public Employee(int empno) {
		this(empno, "-");
	}

	public Employee(String ename) {
		this(0, ename);
	}

	public Employee() {
		this(0, "-"); //或  empno = 0; ename = "-"
	}

	public void display() {
		System.out.println("empno=" + empno);
		System.out.println("ename=" + ename);
	}
	
	@Override
	public int hashCode() {     //hashCode()模擬比對    
		final int prime = 31;    //即使map有不重覆功能   但因為是自定類別  equals()尚未改寫只會判斷物件位置    會被認定為是內容不相同的物件
		int result = 1;         //所以藉由HashMap用hashCode() & equals() 來判斷內容相不相同
		result = prime * result + empno;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {    //equals()精準比對   
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empno != other.empno)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		return true;
	}
	
	
//	public int compareTo(Employee aEmployee) {
//		//物件本身與 aEmployee 相比較，如果 retrun 正值，就表示比 aEmployee 大
//		if (this.empno > aEmployee.empno) {
//			return 1;
//		} else {
//			return -1;
//		}

	public int compareTo(Employee aEmployee) {
		// 物件本身與 aEmployee 相比較，如果 retrun 正值，就表示比 aEmployee 大
		//可以參考array_String
		if (this.empno < aEmployee.empno) {
			return 1;
		} else if (this.empno == aEmployee.empno) {   //key值相同   TreeMap的value值相同
			return 0;
		} else {
			return -1;
		}
	}

}

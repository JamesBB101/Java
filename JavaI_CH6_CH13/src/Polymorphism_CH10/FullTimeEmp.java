package Polymorphism_CH10;

public class FullTimeEmp extends Emp{
	private double monthlySalary;
	public FullTimeEmp(){
				
	}
	public FullTimeEmp(int empno, String ename, double monthlySalary) {
		super(empno, ename);
		this.monthlySalary = monthlySalary;
	}

	public void display(){
		super.display();
		System.out.println("月薪=" + monthlySalary);
	}
	public double getSalary(){
		return monthlySalary;
	}
}

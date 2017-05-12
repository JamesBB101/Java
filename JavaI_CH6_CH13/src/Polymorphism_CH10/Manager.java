package Polymorphism_CH10;

public class Manager extends FullTimeEmp{
	private double bonus;
	public Manager(){
		
	}
	public Manager(int empno, String ename, double monthlySalary,double bonus) {
		super(empno, ename, monthlySalary);
		this.bonus = bonus;
	}
	public double getSalary(){
		double monthlySalary=super.getSalary();
		return monthlySalary + bonus;
	}
	
}

package ch10;

public class Manager extends FullTimeEmployee {
	private double bonus; // 獎金; 額外津貼; 特別補助

	public void display() {
		super.display();   //呼叫父類別正值員工的display方法
		System.out.println("額外津貼 = " + bonus);
	}

	public Manager(int empno, String ename, double monthlySalary, double bonus) {
		super(empno, ename, monthlySalary);
		this.bonus = bonus;
	}
	public double getSalary(){
		double monthlySalary = super.getSalary();
		return monthlySalary+bonus;
	}
}

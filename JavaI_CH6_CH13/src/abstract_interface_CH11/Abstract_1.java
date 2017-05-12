package abstract_interface_CH11;

public class Abstract_1 {

	public static void main(String[] args) {
//		shape sh = new shape();
		shape sh = new Circle();
		sh.display();
		shape sh2 = new cc();
		System.out.println(sh.calArea());
	}

}

abstract class shape{
	shape(){
		System.out.println("shape");
	}
	void display(){
		System.out.println("display()");
	}
	abstract double calArea();
}
class Circle extends shape{ 
	double calArea(){
		return 0.0;
	}
}
class cc extends shape{
	double calArea(){
		return 1.1;
	}
}
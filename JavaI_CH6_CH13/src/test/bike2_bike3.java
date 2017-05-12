package test;

public class bike2_bike3 extends bike{

	float getSpeed(){
		return super.getSpeed();
	}
	public void addSpeed(){
		System.out.println("addSpeed:2");
	}
}
class bike3 extends bike {
	public void addSpeed(){
		System.out.println("addSpeed:3");
	}
}
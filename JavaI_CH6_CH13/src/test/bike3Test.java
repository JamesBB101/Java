package test;

public class bike3Test {

	public static void main(String[] args) {
		bike b1=new bike();
		bike2_bike3 b2 = new bike2_bike3();
		bike3 b3 = new bike3();
		
		System.out.println(b2.speed);
		b2.addspeed();
		System.out.println(b2.speed);
		System.out.println(b2.getSpeed()+"\n");
		
		System.out.println(b1.getSpeed());
		b2.addSpeed();
		b3.addSpeed();
		
		bike[] b=new bike[3];
		b[0]= b1;
		b[1]=b2;
		b[2]=b3;
		for(int i=1;i<b.length;i++){
//			b[i].addSpeed();    //父沒有不能呼叫     先從資料型態去檢查方法存不存在
		}
	}

}

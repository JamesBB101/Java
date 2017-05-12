package CH1_CH5;

public class book1 {
	public static void main(String[] args) {
//		int m = 1000;
//		int n = 495;
//		int max=0;
//		for(int i=2;i<m;i++){
//			if(m%i==0&&n%i==0){
//				max=i;    //在迴圈走完剛好max剛好是最大的公因數
//			}
//		}
//		System.out.println(max);
		
		int x,y,z;
		for(int i=100;i<1000;i++){
			x=i/100;
			y=(i%100)/10;     //x^3+y^3+z^3=x*100+y*10+z=i
			z=i%10;
		
		if((Math.pow(x,3)+Math.pow(y, 3)+Math.pow(z, 3))==i){
			System.out.println(i);
		}
		}
	}
}

package CH1_CH5;

public class circle {
	public static void main(String[] args) {
		int total=0;
		int hit =0;
		while(true){
			float x=(float)Math.random()*2-1;
			float y=(float)Math.random()*2-1;
			
			if(x*x+y*y<1){
				hit++;			
			}
			System.out.println((float)hit/(float)total*4.0f+"["+total+"]");
			total++;
		}
	}
}
//(PIRR/4RR)*4=PI

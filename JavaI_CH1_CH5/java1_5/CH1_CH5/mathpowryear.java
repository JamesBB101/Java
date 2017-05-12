package CH1_CH5;

public class mathpowryear 
{
    public static void main(String[] args)
    {
    	double money1=150.0*Math.pow(1.02, 10);
    	System.out.println(money1);
    	
		int i;
		double money=0;
		for(i=1;i<=10;i++)
		{
			money =150.0*Math.pow(1.02, i);
			
		    System.out.println(money);
		}
		System.out.println(money);
    }
}

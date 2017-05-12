package CH1_CH5;

public class X {
    public static void main(String[] args) {
        // TODO code application logic here
        int amount=0;
        int principal=1000*100; //1000美元=100000美分
        int rate=5; //5%
        int dollors;   //美元
        int cents;     //美分
        int test;
        System.out.printf("%s%20s\n","Year","Amount on deposit");
        for(int year=0;year<=10;year++)
        {
            if(year==0)
                amount=principal;
            else
            {
                amount=amount*(100+rate)/100;
                //amount=Math.round((float)amount*(100+rate)/100);  
                //all_cents;
                dollors=amount/100;            
                test=Math.round((float)amount/100);
                //Math.round
                cents=amount%100;       
                System.out.printf("%4d%20d%20d.%02d%5d\n",year,amount,dollors,cents,test);
            }
        }
    }
	
}

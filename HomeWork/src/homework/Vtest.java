package homework;

public class Vtest {

	public static void main(String[] args) {
		double high=1.79;
		int weigh=75;
		double BMI=weigh/(high*high);
	    if (BMI<18.5){
	    	System.out.println("1");
	    }else if(BMI>=24){
	    	System.out.println("3");
	 
	    }else{
	    	System.out.println("2");
	    }
	    	System.out.println(BMI);
	    	
	    	for(int i=0;i<=100;i++){
				int A=i%4;
				if(A==0){
					System.out.println(i);
				}
				else
					System.out.println("");		
			}
	    	
	    	int e;
			for(int i =1; i<=9;i++){
				e=1;do{
					 
					 System.out.print(i*e+ " ");
					 e++;
				}while(e<=9);
				System.out.println();
			}
	    	

	}
}

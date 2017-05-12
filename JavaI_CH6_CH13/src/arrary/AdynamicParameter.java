package arrary;

public class AdynamicParameter {
	

	public static void main(String[] args) {
		AddInt add = new AddInt();
		int sum1 = add.varArgTest(1, 2);
		int sum2 = add.varArgTest(1, 2, 3, 4);

		System.out.println("sum1=" + sum1); // 3
		System.out.println("sum2=" + sum2); // 10
		
		int[] b={1,2,3};
		int a = add.aa(b);
		System.out.println(a);
	}
}
class AddInt{
	
    public int varArgTest(int... c) {    //一定要放在最後面 所以一個方法只有一個不固定參數
		int sum = 0;                 //陣列存取方式
		for (int i = 0; i < c.length; i++) {
			sum += c[i];
		}
		return sum;
	}
    public int aa(int[]... x){
    	int sum1 = 0;   
    	for(int i=0;i<x.length;i++){
    		for(int j=0;j<x[i].length;j++){
    		sum1 += x[i][j];
    		}
    	}
    	return sum1;
    }
}
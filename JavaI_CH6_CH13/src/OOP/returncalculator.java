package OOP;

public class returncalculator {
	
	public static void main(String[] args){
		calculator1 A=new calculator1();
		
		System.out.println(A.sum(1,2));
		
		float X = A.sum(3.0f, 4);
		System.out.println(X);
	}
}
class calculator1{
	public int sum(int x, int y){
		System.out.println("No.1");
		return x+y;
	}
	public float sum(float x,float y){
		System.out.println("No.2");
	    return x+y;
	}
}

/*宣告class類別
 * System.out.println(A.sum(1,2))=println(1+2)
 * 
 *public 型態  運算( 型態  變數)
 * return 回傳值
 */

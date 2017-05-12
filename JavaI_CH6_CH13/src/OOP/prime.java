package OOP;

public class prime {

	public static void main(String[] args) {
		int LIMIT=100;
		for(int i=2;i<100;i++){
			if(isPrime(i)){
				System.out.print(i+" ");
			}
		}
	}
	public static boolean isPrime(int number){
		for(int i=2;i<number;i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
		
		
	}
}

/*型態  方法  型態  名稱
 *型態 名稱  方法  參數
 *return 直接回傳結束 like break
 */

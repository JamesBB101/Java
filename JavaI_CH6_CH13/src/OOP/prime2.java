package OOP;

public class prime2 {

	public static void main(String[] args) {
		int limit=20;
		outer:for(int x=2;x<limit;x++)
		{
			for(int y=2;y<x;y++){
				if(x%y==0){			
					continue outer;
				}
			}		
			System.out.println(x);
			continue outer;
		}

//每執行一次就會有一個print   要控制ptint就用條件
//迴圈++每個數都要執行 一定有不會被整除的數

//for(int x=2;x<=20;x++){
//int a=1;
//for(int y=2;y<=x;y++){
//	if(x%y==0&&x!=y){
//		a=2;
//	}else if(a==1&&x==y){
//	System.out.println(x);
//	}
//}		
//}

//for(int i=2;i<20;i++){
//	isprime ip=new isprime(i);
//	}
//}
//}
//
//class isprime{
//boolean flag;
//public isprime(int num){
//	
//	for(int i=2;i<num;i++){
//		if(num%i==0){
//			flag = false;
//			break;
//		}
//		flag=true;
//		if(flag){
//		System.out.println(num);
//		break;
//		}
//	}
	}
}
	
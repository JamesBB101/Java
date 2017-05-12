package exception_CH1;

public class throwExceptionRuntimeException {

	public static void main(String[] args){
		
		Test6 t=new Test6();
		try{
				t.m1(-3);
			}catch(RuntimeException a){             //a=Ex2
				System.out.println(a.toString());
			}catch(Ex1 e){
				System.out.println(e.getMessage());
		}
	}
}
class Test6 {
	void m1(int b)throws Ex1,Ex2{  
		int a=b;
		if(a>0){
			throw new Ex1("Ex1:...");	//if throw Exception就要try catch 不然就是拋出
		}else{
			throw new Ex2();   //if throw runtimeException 就不用
		}
	}
}
class Ex1 extends Exception{
	
	public Ex1(String message){
		super(message);
	}
}
class Ex2 extends RuntimeException{

	public String toString() {
		return "Ex2:...";
	}
}

//t呼叫m1方法  傳入-3參數  因為<0所以 throw到Ex2()  
//class Ex2這個類別  知道說發生這樣的例外要回傳"Ex2..."  
//發生例外被catch RuntimeException抓到  
//a這個引數變成Ex2  所以他才知道要回傳 "Ex2:...."
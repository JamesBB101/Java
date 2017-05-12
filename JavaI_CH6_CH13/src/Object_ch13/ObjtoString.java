package Object_ch13;

public class ObjtoString {
	
	public static void main(String[] args) {
	      HelloWorld obj = new HelloWorld();
	      System.out.println(obj); //會自動執行HelloWorld的toString()方法
	    
	    }
	}
class HelloWorld {

	// override Object 類別的 toString() 方法
	public String toString() {
		System.out.println("HelloWorld! 世界你好 toString!");
		return "";
	}
}




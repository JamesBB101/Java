package Object_ch13;

public class gctoFinalize {

	public static void main(String[] args) {
		ClassFinalize fin = new ClassFinalize();
		fin = null;
		System.out.println("強制進行垃圾收集");
		System.gc();
	}
}
class ClassFinalize {
	protected void finalize() {
		System.out.println("finalize方法執行了");
	}
}

package modifier;

public class constructorStatic {
	
	public static void main(String[] args) {
		System.out.println("起始數量:" + Count.getTotalCount() + "\n");

		Count count1 = new Count();
		System.out.println("累計數量:" + Count.getTotalCount());
		System.out.println("序號:" + count1.getSerialNumber() + "\n");

		Count count2 = new Count();
		System.out.println("累計數量:" + Count.getTotalCount());
		System.out.println("序號:" + count2.getSerialNumber() + "\n");
		
	}
}
class Count {
	// 產品序號
	private int serialNumber;

	public int getSerialNumber() {
		return serialNumber;
	}
	// 建構式
	public Count() {
		counter++;
		serialNumber = 1000 + counter;
	}

	// 產品數量
	private static int counter;

	public static int getTotalCount() {
		return counter;
	}
	
	static {    //ststic區塊    類別初始化即執行
		counter = 0;
		System.out.println("起始數量:" + counter + "\n");
	}
}

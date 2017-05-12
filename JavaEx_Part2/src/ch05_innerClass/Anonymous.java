package ch05_innerClass;

interface Book {
	void show();
}

class BeforeAnonymous implements Book {

	@Override
	public void show() {
		System.out.println("我是一本書！");
	}

}

class Anonymous {
	public static void main(String[] args) {
		//以往需再新增類別去實做介面，然後再產生物件去呼叫Override的方法內容
		Book ba = new BeforeAnonymous();
		ba.show();
				
		int a = 10;
		//匿名類別直接實作介面，通常這樣寫法是自己使用，並不是要設計給其他人使用
		//而且使用到的次數非常少，使用匿名類別即可達到簡便目的
		Book ba2 = new Book(){
			public void show() {
//				Anonymous.this.a = 20;  //因為是匿名類別沒辦法用實體內部類別方式呼叫外部類別變數
				System.out.println(this);
				System.out.println("我也是一本書！");
			}
		};
		ba2.show();
	}
}

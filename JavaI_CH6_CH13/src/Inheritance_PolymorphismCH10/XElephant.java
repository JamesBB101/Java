package Inheritance_PolymorphismCH10;

public class XElephant extends IXAnimal{
	private String name; 
	
	public XElephant(String name,int age, float weigth) {
		super(age, weigth);
		this.name=name;
	}
	
	@Override  //annotation
	void speak() {
		super.speak();
		System.out.println("種類名稱"+name);
	}
	@Override
	void setAge(int age) {   //呼叫父類別的方法
		// TODO Auto-generated method stub
		super.setAge(age);
	}
	@Override
	void setWeigth(float weigth) {
		// TODO Auto-generated method stub
		super.setWeigth(weigth);
	}
}
//產生一個class，名為Elephant.java延伸自類別Animal
//•此類別有一個成員變數為name(種類名稱 – 型別String)
//•有一覆寫成員方法名為speak()，用以列印父類別的兩個成員變數和自己的成員變數
//•在main()裡透過建構子產生兩個Animal
//- 其一為Animal，其年紀和體重分別為3歲、8.0公斤
//- 另一為Elephant，其年紀、體重和種類名稱分別為8歲、1200.0公斤、大象
//•列印上述兩種Animal的值

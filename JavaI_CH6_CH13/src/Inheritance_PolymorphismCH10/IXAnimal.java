package Inheritance_PolymorphismCH10;

public class IXAnimal {

	private int age;
	private float weigth;

	void speak() {
		System.out.print("\n"+"年紀" + age + "歲" + " , " + "體重" + weigth + "公斤"+ " , ");
	}

	public IXAnimal(int age, float weigth) {
		if (age < 0 || weigth < 0) {
			System.out.println("請輸入正確資料");
		} else {
			this.age = age;
			this.weigth = weigth;
		}
	}
	void setAge(int age){
		this.age = age;
	}
	void setWeigth(float weigth){
		this.weigth = weigth;
	}
}

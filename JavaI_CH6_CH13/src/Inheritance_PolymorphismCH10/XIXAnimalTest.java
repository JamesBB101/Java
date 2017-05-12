package Inheritance_PolymorphismCH10;

public class XIXAnimalTest {

	public static void main(String[] args) {
	
		IXAnimal wolf = new IXAnimal(2, 5.0f);//建構子初始值定義
		wolf.speak();
		
		System.out.println("3年過後"); 
		
		wolf.setAge(5);
		wolf.setWeigth(25.0f);
		wolf.speak();
		
		IXAnimal tiger = new IXAnimal(3,8.0f);
		XElephant elephant = new XElephant("elephant",8,1200.0f);
		tiger.speak();
		elephant.speak();
	}
}

//產生一個class，名為Animal.java
//• 此類別有兩個成員變數分別為age(年紀 - 幾歲 - 型別int)、weight(體
//重 – 公斤重 – 型別float)
//• 有一成員方法名為speak()，用以列印上述兩個值
//• 在main()裡透過建構子產生一個Animal，年紀和體重分別為2歲、
//5.0公斤，並列印此Animal的成員變數值

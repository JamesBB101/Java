package Inheritance_PolymorphismCH10;

public class XPolyAnimal {

	public static void main(String[] args) {
		IXAnimal[] PolyArray = new IXAnimal[2];
		PolyArray[0] = new IXAnimal(3,8.0f);
		PolyArray[1] = new XElephant("elephant",8,1200.0f);
		
		for(int i=0;i<PolyArray.length;i++)
			PolyArray[i].speak();
		for(int i=0;i<PolyArray.length;i++){
			System.out.println(PolyArray[i]);
		}

	}

}
//產生一個class，名為PolyAnimal.java
//•程式同上一個課堂練習
//•在main()裡透過多型來製作


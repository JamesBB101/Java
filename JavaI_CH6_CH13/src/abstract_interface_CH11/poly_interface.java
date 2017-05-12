package abstract_interface_CH11;

public class poly_interface {

	public static void main(String[] args) {
		Iweight[] ii = new Iweight[3];  //用interface當資料型態
		ii[0]=new Dog("1",1);
		ii[1]=new Plane("1",1);
		ii[2]=new Powder("1",1);
		for(int i=0;i<ii.length;i++){
			ii[i].getWeightMethod();
		}
	}

}
interface Iweight{
	void getWeightMethod();
}
class Dog implements Iweight{
	private String name;
	private double weight;
	
	public Dog() {
		super();
	}

	public Dog(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void getWeightMethod(){
		System.out.println(weight);
	}
}
class Plane implements Iweight{
	private String kind;     // 種類
	private double weight;
	
	public Plane() {
		super();
	}

	public Plane(String kind, double weight) {
		super();
		this.kind = kind;
		this.weight = weight;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void getWeightMethod(){
		System.out.println(weight);
	}
}
class Powder implements Iweight{
	private String color; 
	private double weight;
	
	public Powder() {
		super();
	}
	
	public Powder(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void getWeightMethod(){
		System.out.println(weight);
	}
}
	
	
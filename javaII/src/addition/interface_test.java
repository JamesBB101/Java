package addition;

public class interface_test {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.setAniaml(new cat());
		a.getAnimal();
		a.setAniaml(new dog());
		a.getAnimal();
	}

}
interface sound{
	void sound();
}
class dog implements sound{
	public void sound(){
		System.out.println("O~O~");
	}
}
class cat implements sound{
	public void sound(){
		System.out.println("mi~mi~");
	}
}
class Animal{
	private sound s;
	void setAniaml(sound s){
		this.s=s;
	}
	void getAnimal(){
		s.sound();
	}
}
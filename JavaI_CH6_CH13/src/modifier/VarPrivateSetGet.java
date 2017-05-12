package modifier;

public class VarPrivateSetGet {

	public static void main(String[] args) {
		PenGood1 p = new PenGood1();
		p.setBrand("SKB");
//		p.setPrice(10);
		p.setPrice(-10);
		
		System.out.println(p.getBrand());
		System.out.println(p.getPrice());

	}
//因為variable is private so use set method將值傳入  then use get method to read
}
class PenGood1 {
	private String brand;
	private double price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brandXXX) {
		brand = brandXXX;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double priceXXX) {
		if(priceXXX > 0)
			price = priceXXX;
		else
			System.out.println("請確認售價設定");
	}
}
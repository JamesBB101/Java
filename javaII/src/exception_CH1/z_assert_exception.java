package exception_CH1;

public class z_assert_exception {

	public static void main(String[] args) {
		Book book = new Book();
		book.setPrice(-580.0);
		System.out.println(book.getPrice());
	}
}
class Book {
	private double price;
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		assert this.price >= 0.0 : "書籍定價不可為負數";
		return price;
	}
}
//<boolean_expression>：<detail_expression>;

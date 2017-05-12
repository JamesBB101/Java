package exception_CH1;

public class MyExceptionExtendsException {

	public static void main(String[] args) {
		try {

			throw new MyException1("發生自訂的例外了!");

		} catch (MyException1 e) {
//			 System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
class MyException1 extends Exception {

	public MyException1() {
	}

	public MyException1(String message) {//藉由父類別傳入字串
		super(message);
	}
}
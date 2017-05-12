package exception_CH1;

public class CubeExceptionThrowNew {

	public static void main(String[] args)  {
		try{
			Cube c = new Cube(3);
			System.out.println(c.Area());
		}catch(CubeException CE){
			CE.printStackTrace();
		}
	}
}
class Cube{
	private double length;

	public Cube(double length) throws CubeException {
		setLength(length);
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) throws CubeException {
		if(length <= 0){
			throw new CubeException("正立方體邊長不得為0或是負數");
		}else
		this.length = length;
	}
	public double Area(){
		return Math.pow(length, 3);
	}
}
class CubeException extends Exception{
	public CubeException(){
		
	}
public CubeException(String message){
		super(message);
	}
}
//請建立一個正立方體Cube.java檔案，並定義邊長屬性(double length)，
//建構子(Constructor)與getter/setter方法
//•產生一個cube物件並同時傳入邊長值，若是值為0或負數，則拋出自行定義的例外CubeException，
//並顯示「正立方體邊長不得為0或是負數」的訊息
//•若是傳入邊長的值沒有問題，則顯示體積
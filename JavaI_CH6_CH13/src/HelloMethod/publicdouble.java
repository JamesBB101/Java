package HelloMethod;

public class publicdouble {
	public static double areaMeasure(double radius){
		return radius*radius*3.14;
	}
	public static double areaMeasure(double height,double width){
		return height*width;
	}
	public static double areaMeasure(double upper,double bottom,double height){
		return ( upper + bottom) * height / 2;
	}
	public static void main(String args[]){
		double i =areaMeasure(3.0);
		double j =areaMeasure(3.0,4.0);
		double k =areaMeasure(3.0,4.0,5.0);
		System.out.println("圓形面積=" + i);
		System.out.println("長方形面積=" + j);
		System.out.println("梯形面積=" + k);
	}
}
/*宣告    public 型態  方法( 型態  變數)
 * return 方程式
 * 型態  變數  = 方法    ( 參數 )
 */

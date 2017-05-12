package collection;
public class G_basic {

	public static void main(String[] args) {
		GTest2<Integer> g1 = new GTest2<Integer>();
		g1.setT1(12);
		
		GTest2<String> g2 = new GTest2<String>();
		g2.setT1("String");
		
		G_Class g3 = new G_Class();
//		g3.setT1("String");
//		g3.setT1(12);
		
		System.out.println(g1.getT1());
	}
}
//因為資料型態不同  但使用方法相同 可在類別+ <T> 泛型
class GTest2<T> {
	T t1;
	void setT1(T t2) {
		t1 = t2;
	}
	T getT1() {
		return t1;
	}
}

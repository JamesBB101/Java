package collection;
public class G_Obj_newObj {

	public static void main(String[] args) {
		GTest5<B> g1 = new GTest5<B>();
//		g1.m1(new A());  //父類別沒有繼承
		g1.m1(new B());  //物件的方法形態只能是B  或是比B小
		g1.m1(new C());
			
	}

}
class GTest5<T> {
	void m1(T t1){
	}
}

class A {}
class B extends A{}
class C extends B{}

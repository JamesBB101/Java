package abstract_interface_CH11;

public class LowElasticity {

	public static void main(String[] args) {
		WorkWithPens business1 = new WorkWithPens();
		business1.setPencil(new Pencil());
		business1.writeWithPencil();
		
		WorkWithPens business2 = new WorkWithPens();
		business2.setInkBrush(new InkBrush());
		business2.writeWithInkBrush();
	}
}

class Pencil {
	public void write() {
		System.out.println("用鉛筆寫字");
	}
}
class InkBrush {
	public void write() {
		System.out.println("用毛筆寫字");
	}
}
class WorkWithPens {
	private Pencil pencil;        //用類別當型態
	private InkBrush inkBrush;
	
	public Pencil getPencil() {
		return pencil;
	}
	public void setPencil(Pencil pencil) {   //傳入類別
		this.pencil = pencil;
	}
	public void writeWithPencil() {
		pencil.write();              //用類別呼叫方法
	}
//每新增一支筆  就要定義新的  型態,變數 + set + get + method	
	public InkBrush getInkBrush() {
		return inkBrush;
	}
	public void setInkBrush(InkBrush inkBrush) {
		this.inkBrush = inkBrush;
	}
	
	public void writeWithInkBrush() {
		inkBrush.write();
	}
}
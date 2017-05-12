package abstract_interface_CH11;

public class HighElasticity {	
	
	public static void main(String[] args) {
		WorkWithPens2 business1 = new WorkWithPens2();
		business1.setWritable(new Pencil2());
		business1.writeWithPens();
		
		WorkWithPens2 business2 = new WorkWithPens2();
		business2.setWritable(new InkBrush2());
		business2.writeWithPens();	
	}
}
interface IWritable{   //宣告介面
	void write();
}
class InkBrush2 implements IWritable{
	@Override                    //實作介面
	public void write() {
		System.out.println("use InkBrush");	
	}
}
class Pencil2 implements IWritable {
	public void write() {        //實作介面
		System.out.println("用鉛筆寫字");
	}
}
class WorkWithPens2 {
	private IWritable writable;  //介面當型態

	public IWritable getWritable() {
		return writable;
	}
	public void setWritable(IWritable writable) {    //導入類別
		this.writable = writable;       //參數:IWritable writable
	}
	public void writeWithPens() {      //類別呼叫方法
		writable.write();
	}
}
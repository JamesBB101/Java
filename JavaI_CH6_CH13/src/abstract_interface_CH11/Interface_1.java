package abstract_interface_CH11;

public class Interface_1 {

	public static void main(String[] args) {
		

	}

}
//宣告介面
interface JavaPrograme{  //介面=定義出規格 方法        public存取權限
	void OCJP();          //等待實作
}
//宣告介面
interface LinuxLPIC{
	void LPIC101();
	void LPIc102();
}
//實作介面
class SuperProgramer implements JavaPrograme,LinuxLPIC{  //可多個介面  沒實作就是抽象類別
	public void OCJP(){   //實作該介面的類別都要是public的存取權限
		
	}
	public void LPIC101(){
		
	}
	public void LPIc102(){
		
	}
}
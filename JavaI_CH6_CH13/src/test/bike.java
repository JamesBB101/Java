package test;

public class bike {//腳踏車類別

	double speed;  //速度屬性
	
	static int count;   //靜態變數  類別成員
	
	public bike(){
		speed=7;   //建構子 實體初始化
		count++;
	}
	static int getcount(){
		return count;
	}
	
	void addspeed(){   //存取速度屬性的方法
		speed *=1.2;
	}
	void reducespeed(){
		speed *=0.7;
	}
	float getSpeed(){
		float speed1 = (float)(speed*1.2);
		return speed1;
	}
	
}
//類別只是定義  描述物件
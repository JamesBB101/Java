package arrary;

import java.util.ArrayList;
import java.util.Collections;

public class arraylistaddremovesizeget {

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<String>();
		String f[] = {"梅花","方塊","紅心","黑桃"};
		for (int x=0; x<=3; x++){
			for (int y=1; y<=10; y++){
				arrlist.add(f[x]+"   "+y);
			}
			arrlist.add(f[x]+"   "+"J");
			arrlist.add(f[x]+"   "+"Q");
			arrlist.add(f[x]+"   "+"K");
		}

//		int size = arrlist.size();
		int count = 0;
//		while (size>0){
//			int r = (int)(size*Math.random());
//			System.out.print(arrlist.get(r)+",");
//			arrlist.remove(r);
//			size--;
//			count += 1;
//			if (count == 13){
//				System.out.println();
//				count = 0;
//			}
//		}
		Collections.shuffle(arrlist);
		for(Object o:arrlist){
			System.out.print(o+"\t");
			count += 1;
			if (count == 13){
				System.out.println();
				count = 0;
			}
		}
	}
}

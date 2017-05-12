package arrary;

import java.util.Arrays;

public class array2 {

	public static void main(String[] args) {
//		int[] [] array=new int[3][3];
//		for(int x=0;x<array.length;x++){         //2維元素
//			for(int y=0;y<array[x].length;y++){    //元素 
//				System.out.print(array[x][y]);
//			}
//			System.out.println();
//		}
		
//		int [] array=new int[10];
//		for(int value : array){        //數值    陣列名稱
//			System.out.printf("%2d",value);
//		}
//		System.out.println();
//		
//		Arrays.fill(array, 60);      //陣列名稱,輸入數值//
//		for(int score : array){     //數值  陣列
//			System.out.printf("%3d",score);
//		}
//		
//		int[] [] arr=new int[2][];
//		arr[0]=new int[]{1,2,3,4,5};
//		arr[1]=new int[]{1,2,3};
//		for(int[] row:arr){           //維度 , 矩陣
//			for(int value:row){       //數值, 維度    
//				System.out.println(value);
//			}
//			System.out.println();
//		}
		
		int [] []array=new int[2][2];
		for(int x=0;x<array.length;x++){
			for(int y=0;y<array[x].length;y++){
			System.out.print(array[x][y]);
			}
			System.out.println();
		}
		for(int[] row:array){
			for(int value:row){
				System.out.println(value);
			}
		}
	}
}





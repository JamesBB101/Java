package arrary;

import java.util.Arrays;

public class A_ArrayCH8 {
//API:util-->Arrays - method  paraments參數
	public static void main(String[] args) {
		// 陣列排序
		int[] intArray = {200, 300, 100};
		Arrays.sort(intArray);  // 呼叫sort方法並傳入欲進行排序的陣列
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("==============");
		
		//複製陣列
		int[] intArray2 = {100, 200, 300};
		//呼叫copyOf方法並傳入兩個參數：欲複製的陣列、欲複製的陣列長度
		//創造新物件  不同記憶體位址//
		int[] intArray2B = Arrays.copyOf(intArray2, intArray2.length);
		intArray2[0] = 0;
		System.out.println(intArray2[0]);
		System.out.println(intArray2B[0]);
		
		System.out.println("==============");
		
		// 搜尋陣列內的值
		int[] intArray3 = {100, 200, 300, 50};
		// 呼叫binarySearch方法並傳入兩個參數：欲搜尋的陣列、欲搜尋的值
		Arrays.sort(intArray3);   // 注意：欲搜尋前必先將陣列進行"排序"
		int i1 = Arrays.binarySearch(intArray3, 50);  // 有要搜尋的值
		int i2 = Arrays.binarySearch(intArray3, 150); // 沒有搜尋到值
		System.out.println(i1);
		// 回傳負索引減1的值(-"0"-1)
		System.out.println(i2);
		
		System.out.println("==============");
		int[] arraryA = {10, 20, 30};  
		System.out.println(arraryA[1]);
		
		int[] arraryB = arraryA;
		arraryB[1] = 5;
		
		System.out.println(arraryA[1]);
		/*物件傳遞
		*參考同一個物件
		*/
	}

}

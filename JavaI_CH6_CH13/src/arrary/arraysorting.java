package arrary;

import java.util.*;

public class arraysorting {

	public static void main(String[] args) {
		int temp;
		int[] numbers={70,80,31,37,10,1,48,60,33,80};
		for(int i=0;i<numbers.length;i++){
			for(int j=0;j<(numbers.length-i-1);j++){
				if(numbers[j]>numbers[j+1]){
					temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers [j+1]=temp;
				}
			}
		}
		for(int number:numbers){
			System.out.print(number+" ");
		}
//		System.out.println();
//		Arrays.sort(numbers);	
//		for (int num : numbers){
//			System.out.print(num+" ");
//		}
	}
}

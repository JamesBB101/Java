package arrary;

import java.util.*;

public class arrayboolean {

	public static void main(String[] args) {
		
		int [] numbers = {70, 80, 31, 37, 10, 1, 48, 60, 33, 80};
		Arrays.sort(numbers);
//		for(int num:numbers){
//			System.out.print(num+" ");
//		}
		boolean flag=false;
		System.out.println("輸入");
		Scanner S =new Scanner(System.in);
		int input=S.nextInt();
		for(int i=0;i<numbers.length;i++){
			if(input==numbers[i]){
				System.out.println(i);
				flag=true;
			}
		}
		if(!flag){
		System.out.println(-1);
		}
	}

}

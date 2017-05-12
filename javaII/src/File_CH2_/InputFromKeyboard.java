package File_CH2_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromKeyboard {
	public static void main(String args[]) {

		System.out.println("請輸入資料....");

		InputStreamReader isr = new InputStreamReader(System.in);
//System.in  printStream(Obj)
		BufferedReader br = new BufferedReader(isr);

		try {
			
			String data = br.readLine();
			int intData=Integer.parseInt(data);
			
			System.out.println(intData+100);

		} catch (IOException e) {
			e.printStackTrace();
		}
//		Scanner sc = new Scanner(System.in);
//		int in = sc.nextInt();     //int in = Integer.parseInt(input);
	}
}

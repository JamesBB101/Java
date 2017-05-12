package ch03_Sort;

import java.util.*;

public class TestArraysForArray {

	public static void main(String args[]) {

		String strArray[] = { "5", "2", "3", "4", "1" };

		Arrays.sort(strArray);

		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		for(String sA : strArray){
			System.out.print(sA+"\t");
		}
	}
}

package arrary;

import java.util.StringTokenizer;

public class A_StringCH8 {
//API:lang-->String
	public static void main(String[] args) {
		String s1 = "Hello", s2 = "Hello";   //將放在String pool 字串池共用
		String s3 = new String("Hello");    //String一旦宣告不能改變memory位置
		String s4 = " ";
		String s5 = " Hello ";
//		
//		System.out.println(s1 == s2);         
//		System.out.println(s1.equals(s2));   
//		System.out.println(s1 == s3);        //物件 位子不相等
//		System.out.println(s1.equals(s3));   //equals內容相等
//		
//		System.out.println(s1.charAt(4));  // 注意：索引從0開始
//		System.out.println(s1.length());
//		System.out.println(s4.isEmpty());
//		System.out.println(s4.length()==0);
//		System.out.println(s4.equals(""));
//		System.out.println(s1.substring(1));  // 注意：索引從0開始
//		System.out.println(s1.substring(1, 4));  // 注意：索引從0開始
//		System.out.println(s1.compareTo(s4));   //ASCII72-2
//		// 若回傳值=0，表示兩個字串相等
//		// 若回傳值>0，表示左邊字串大於右邊字串
//		// 若回傳值<0，表示左邊字串小於右邊字串
//		System.out.println(s5.trim()); 
//		
//		//toCharArray
//		char[] x=new char[s1.length()];
//		for(int i=0;i<s1.length();i++){
//			x[i]=s1.charAt(i);
//		}
//		for(char v:x){
//		System.out.print(v);
//		}
		
/////StringBuffer
		StringBuffer sb =new StringBuffer();
		System.out.println(sb.toString());
		sb.append("sbOne");
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb.toString());
		StringBuilder sb2 =new StringBuilder();
		sb2.append("sb2One");
		System.out.println(sb2.toString());
		sb2.reverse();
		System.out.println(sb2.toString());
		
/////StringTokenizer  切割類別
//		String s6="Java is\nvery\teasy";
//		StringTokenizer st = new StringTokenizer(s6);
//		while(st.hasMoreElements()){
//			System.out.println(st.nextToken());
//		}
//		String s7="1:brad:0912-345678";
//		StringTokenizer st1 = new StringTokenizer(s7);
//		System.out.println(st1.nextToken(":"));
//		System.out.println(st1.nextToken(":"));
//		System.out.println(st1.nextToken("-"));
	}

}






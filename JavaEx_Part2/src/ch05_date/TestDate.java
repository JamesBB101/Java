package ch05_date;

import static java.lang.System.out;

import java.sql.Date;

public class TestDate {
	public static void main(String argv[]) {

		// java.util.Date(今天)(現在)(如:Wed Aug 18 22:10:06 CST 2010)
		java.util.Date du = new java.util.Date();
		System.out.println("java.util.Date() = " + du);

		// java.sql.Date(今天)(如:2010-08-18)
		long long1 = du.getTime(); // 也可用long long1 =
									// System.currentTimeMillis();
		System.out.println(long1);
		
		java.sql.Date ds1 = new java.sql.Date(long1);
		System.out.println("java.sql.Date()  = " + ds1);

		// java.sql.Date(30天後)(如:2010-09-17)
		long long2 = du.getTime() + 30 * 24 * 60 * 60 * 1000L;
		java.sql.Date ds2 = new java.sql.Date(long2);
		System.out.println("java.sql.Date()  = " + ds2);
		
		
		Date sqlDate = new Date(long1);
		System.out.println(sqlDate);
		out.printf("%tY / %<tm / %<td %<tT %n", sqlDate);
		
		
		System.out.println("**********************************");
		java.util.Date d = new java.util.Date();
		System.out.println(d);
		
		long dd = d.getTime();
		System.out.println(dd);
		
		java.sql.Date dd1 = new java.sql.Date(dd);
		System.out.println(dd1);
		
	}
}

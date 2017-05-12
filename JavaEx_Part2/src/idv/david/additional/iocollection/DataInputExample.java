package idv.david.additional.iocollection;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class DataInputExample {
	public static void main(String[] args) throws IOException {
		// Variables declare
		int totalAge = 0;
		double totalHeight = 0.0;
		double totalWeight = 0.0;
		int totalPerson = 0;
		
		Map<String, Integer> cities = new HashMap<String, Integer>();

		// Read data from file
		BufferedReader br = new BufferedReader(new FileReader("files/data.txt"));

		// Parsing data
		String data;
		while ((data = br.readLine()) != null) {
			totalPerson++;
			
			StringTokenizer st = new StringTokenizer(data, ",");
//			if (st.hasMoreTokens()) {
				int no = Integer.parseInt(st.nextToken());
				String name = st.nextToken();
				totalAge += Integer.parseInt(st.nextToken());
				totalHeight += Double.parseDouble(st.nextToken());
				totalWeight += Double.parseDouble(st.nextToken());
				String tel = st.nextToken();

				String city = st.nextToken();
				if (cities.containsKey(city)) {   //cities = new HashMap<String, Integer>();
					int count = cities.get(city) + 1;
					cities.put(city, count);
				} else
					cities.put(city, 1);
			}
//		}

		// Output result
		out.printf("平均 年齡: %d歲%n", totalAge / totalPerson);
		out.printf("平均 身高: %.2f公分%n", totalHeight / totalPerson);
		out.printf("平均 體重: %.2f公斤%n", totalWeight / totalPerson);

		Set<String> keys = cities.keySet();
		for (String city : keys)
			out.printf("住址 %S: %d人%n", city, cities.get(city));

		System.out.println("\n---------測試toString()-----------");
		System.out.println("toString()=" + cities+"\n"); // 測試toString()
		
		
		System.out.println("******StringTokenizer******");
		BufferedReader br2 = new BufferedReader(new FileReader("files/data.txt"));
		String data2;
		while((data2=br2.readLine())!=null){
			StringTokenizer st = new StringTokenizer(data2, ",");
			for(int i=0;i<7;i++){
				System.out.print(st.nextToken()+",");
			}
			System.out.println();
		}
	}
}

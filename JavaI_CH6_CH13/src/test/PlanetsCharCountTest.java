package test;

import java.util.Arrays;
import java.util.List;

public class PlanetsCharCountTest {
	public static void main(String[] args){
		int count = 0;	
		String[] planets ={"mercury", "venus", "earth","mars" , "jupiter" , "saturn", "uranus" , "neptune"};    
		PlanetsCharCount planetsCC = new PlanetsCharCount();
		
		for(String s: planets){
			count = count + planetsCC.countChar(s);
		}
		System.out.println(count);
	}
}
class PlanetsCharCount {

//	private int count;
//	
//	public PlanetsCharCount() {
//		this.count = 0;
//	}
	public Integer countChar(String s) {
		int count = 0;
		List<String> vowelArray = Arrays.asList("a", "e", "i", "o", "u");  //用Arrays.asList-->list
//		String[] vowelArray={"a","e","i","o","u"};   //如果是String[]  就沒有辦法呼叫出indexof()判斷是否包含字串作比對
		char[] charArray = s.toCharArray();  
		for (char ch : charArray) {
			if (vowelArray.indexOf(String.valueOf(ch)) != -1) {    //用list呼叫indexOf  字串與字串作比較 
				count += 1;       //!= -1 就是母音  count++
			}
		}
		return count;
	}
}
//Arrays.asList  將array=>list  因為list有更多method可以用  List的indexOf
//String[]  how to use 字串的陣列中的方法與索引值作辨別  但Arrays沒有indexOf 所以轉成list
//String -->char  to compare with vowel
//String list more method




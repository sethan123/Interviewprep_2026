package Java_Strings;
import java.util.*;
public class firstnonrepeatingcharacter {
     public static void main(String[] args) {
		String s ="tefdfdst".toLowerCase();
		//HashMap does NOT maintain insertion order, so we use LinkedHashMap to maintain the order of characters as they appear in the string.
		 Map<Character, Integer> countMap = new LinkedHashMap<>();
		
		for(char ch: s.toCharArray()) {
			countMap.put(ch,countMap.getOrDefault(ch,0)+1);
			
		}
		
		
		for(Map.Entry<Character,Integer> entry: countMap.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println("First non-repeating character is: " + entry.getKey());
				break;
			}
		}
		
	}
	
	
}

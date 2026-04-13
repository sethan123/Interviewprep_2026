package Java_Strings;
import java.util.*;
public class StringOccurancegetdefault {
public static void main(String[] args) {
	String input = "Test".toLowerCase();
	
	Map<Character,Integer> countMap = new HashMap<>();
	
	for(char ch: input.toCharArray()) {
		countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
		
	}
	
	for(Map.Entry<Character,Integer> entry: countMap.entrySet()) {
		System.out.println(entry.getKey() + " : " + entry.getValue());
	}
	
	
}
}

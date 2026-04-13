package Java_Strings;

import java.util.HashMap;
import java.util.Map;

public class StringOccurance {

	public static void main(String[] args) {
		String input = "AutommatioTeston";
		input =input.toLowerCase();
		
		Map<Character,Integer> countMap = new HashMap<>();
		
		for(char ch: input.toCharArray()) {
			
			if(countMap.containsKey(ch)){
				countMap.put(ch, countMap.get(ch)+1);
			}else {
				countMap.put(ch, 1);
			}
				
		}
		
		for(Map.Entry<Character, Integer> entry: countMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}

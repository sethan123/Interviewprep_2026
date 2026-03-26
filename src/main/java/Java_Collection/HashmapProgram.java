package Java_Collection;
import java.util.*;
import java.util.Iterator;
public class HashmapProgram {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		System.out.println(map);
		System.out.println(map.get("A"));
		System.out.println(map.containsKey("B"));
		System.out.println(map.containsValue(3));
		System.out.println(map.size());
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		

	}

}

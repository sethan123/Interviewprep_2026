package Java_Collection;

import java.util.ArrayList;
import java.util.*;

public class RemoveDuplicate {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3));
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(list);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(set);
		System.out.println(list2);
		
		
	}
	
	
	
	

}

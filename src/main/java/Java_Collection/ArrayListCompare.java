package Java_Collection;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListCompare {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		Arrays.sort(list1.toArray());
		System.out.println(list1.equals(list2)); // true
		
		

	}

}

package Java_Collection;
import java.util.ArrayList;
public class GenericArrayListprogram {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(123);
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Selenium");
		
		ArrayList<Double> ar2 = new ArrayList<Double>();
		ar2.add(12.33);
		
		ArrayList<Character> ar3 = new ArrayList<Character>();
		ar3.add('A');
		
		System.out.println(ar);
		System.out.println(ar1);
		System.out.println(ar2);
		System.out.println(ar3);
	}

}

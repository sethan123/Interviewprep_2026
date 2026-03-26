package Java_Collection;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add("Selenium");
		ar.add(123);
		ar.add(12.33);
		ar.add('A');
		ar.add(true);
		ar.add(null);
		ar.add("Selenium");
		System.out.println(ar.size());
		System.out.println(ar);
		
	}

}

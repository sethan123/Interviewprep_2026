package Java_Collection;


import java.util.Arrays;
import java.util.ArrayList;

public class PrimeNumber {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		ar.removeIf(n->n%2==0);
		System.out.println(ar);
		
		
		
		
		
	}

}

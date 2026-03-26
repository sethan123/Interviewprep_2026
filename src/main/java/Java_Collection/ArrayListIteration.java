package Java_Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Selenium");
		ar.add("QTP");
		ar.add("Appium");
		ar.add("RFT");
		
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		for(String s:ar) {
			System.out.println(s);
		}
		
		
		ar.stream().forEach(s->System.out.println(s));
		
		Iterator<String> it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

package Java_Collection;

import java.util.ArrayList;

public class ArrayListMethods {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
	ArrayList<String> ar = new ArrayList<String>();
	ar.add("Selenium");
	ar.add("QTP");
	ar.add("Appium");
	ar.add("RFT");
	
	ArrayList<String> ar1 = new ArrayList<String>();
	ar1.add("Monkey");
	ar1.add("Donkey");
	
	
	System.out.println(ar);
	System.out.println(ar1);
	
	System.out.println(ar.addAll(ar1));
	System.out.println(ar);
	
	ArrayList<String> cl =(ArrayList<String>) ar1.clone();
	System.out.println(cl);
	
	System.out.println(ar1.indexOf("Donkey"));
	System.out.println(ar1.lastIndexOf("Donkey"));
	System.out.println(ar1.contains("Monkey"));
	System.out.println(ar1.contains("Selenium"));
	System.out.println(ar1.isEmpty());
	System.out.println(ar1.size());
	System.out.println(ar1.remove("Monkey"));
	System.out.println(ar1);
	System.out.print(false);

}
}

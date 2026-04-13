package Java_Strings;

public class reverseString {
	public static void main(String[] args) {
		String s ="Automation".toLowerCase();
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	
		StringBuilder sb = new StringBuilder("Thevhsbdhj");
		
		
		System.out.println("\n" + sb.reverse());
	 
	
	}
}

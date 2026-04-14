package Java_Strings;

public class StringRotation {

	public static void main(String[] args) {
		String str1 ="abcde";
		String str2 ="deabc";
		
		if(str1.length()!=str2.length()) {
			System.out.println("Second string is not a rotation of first string");
		}
		
		else {
			str1 = str1.concat(str1);
			if(str1.indexOf(str2)!=-1)
				System.out.println("It is string rotation");
			else
				System.out.println("It is not a string rotation");
		}
		

	}

}

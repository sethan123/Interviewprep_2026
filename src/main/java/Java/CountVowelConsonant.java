package Java;

public class CountVowelConsonant {

	public static void main(String[] args) {
		int vowelCount = 0;
		int consonantCount = 0;
		
		String str = "djsouAj jsdkjds jsdnjkds jsdjksd jdsnjds ";
		for(int i=-0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				vowelCount++;
			}
			else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				consonantCount++;
			}
			
		
		}
System.out.println("Number of vowels: " + vowelCount);
System.out.println("Number of consonants: " + consonantCount);
	}

}

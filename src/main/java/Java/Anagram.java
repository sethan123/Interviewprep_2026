package Java;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		if(str1.length()!=str2.length()) {
			System.out.println("It is not an anagram");
		}else {
			char[] string3=str1.toCharArray();
			char[] string4=str2.toCharArray();
			Arrays.sort(string3);
			Arrays.sort(string4);
		}
		
		
	}
	}
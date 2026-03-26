package Java_Strings;

public class CountPunctuation {

	public static void main(String[] args) {
		String str = "djsj. jsdkjds! jsdnjkds jsdjksd jdsnjds ";
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='!' || str.charAt(i)==',' || str.charAt(i)=='.' || str.charAt(i)=='?' || str.charAt(i)==';' || str.charAt(i)==':') {  
				count++;
				
			}
			
		}
		System.out.println(count);

	}

}

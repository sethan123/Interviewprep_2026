package Java_Strings;

public class Reverse {

	public static void main(String[] args) {
		String str = "Dream big";
		String reverseStr="";
		
		char st[] = str.toCharArray();
		
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]);
		}
		
		
		

	}

}

package Java_Strings;

public class changeCase {

	public static void main(String[] args) {
	String str= "Automation";
	
	StringBuffer sb = new StringBuffer(str);
	
	for(int i=0; i<sb.length();i++)
	{
		if(Character.isLowerCase(sb.charAt(i)))
		{
			sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
		}else if(Character.isUpperCase(sb.charAt(i)))
		{
			sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
		}
	}		
System.out.println(sb);
	}

}

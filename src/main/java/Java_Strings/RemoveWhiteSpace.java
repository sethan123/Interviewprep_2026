package Java_Strings;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str = "Autmamf kdfsmkmsd";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
		System.out.println(str.toUpperCase());


	}

}

package Java_Opps;

class test {
	void temple(int a )
	{
		System.out.println("temple");
	}



	void kovil(double b)
	{
		System.out.println("koivl");
	}




	void vadapalani(String s)
	{
		System.out.println("letter");
	}
}




public class Program3_Method_Overloading {
	public static void main(String[] args) {
		test t = new test();
		t.temple(12);
		t.kovil(1.2);
		t.vadapalani("makingn");
	}

}

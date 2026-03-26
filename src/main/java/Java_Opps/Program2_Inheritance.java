package Java_Opps;

class Alpha{
	int x =20;
	void alpha()
	{
		System.out.println("Alpha");
	}	
}

class Beta extends Alpha{
	double d =2.5;
	void beta() {
		System.out.println("Beta");
	}
}
public class Program2_Inheritance {
	public static void main(String[] args) {
		Beta b= new Beta();
		System.out.println(b.x);
		System.out.println(b.d);
		b.alpha();
		b.beta();
	}
}


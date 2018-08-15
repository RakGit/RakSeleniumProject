
public class Constructors extends AbstractImplementation {
	
	
	public Constructors() {
		System.out.println("Default constructor");
		
	}
	
	public Constructors(int a) {
		System.out.println("Parametric constructor"+a);
	}
	
	void load1()
	{
		System.out.println("Inside load1");
	}
	
	void load1(String abs)
	{
		System.out.println("Inside load1"+abs);
	}
	
	void load1(int abs)
	{
		System.out.println("Inside load1"+abs);
	}
	
	void load1(int abs,String bb,char c)
	{
		System.out.println("Inside load1"+abs+" "+bb+" "+c );
	}

	public static void main(String ar[])
	{
		/*Constructors  consSecond=new Constructors(123);*/
		Constructors  cons=new Constructors();
		cons.load1();
		cons.load1(123);
		cons.load1("123");
		cons.load1(4, "bb", 'a');
	}
	
}

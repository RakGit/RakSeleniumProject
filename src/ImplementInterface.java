import java.io.FileNotFoundException;

public class ImplementInterface  implements InterfaceTest{

	public void m1(int c)
	{
		System.out.println("Inside m1()"+s);
	}
	
	public void m2()
	{
		System.out.println("Inside m1()");
	}
	
	public void m1() throws ArithmeticException, FileNotFoundException
	
	{
		int a=4/0;
		System.out.println("..............."+a );
		throw new FileNotFoundException();
		
	}

	public static void main(String[] args) throws ArithmeticException, FileNotFoundException {
		ImplementInterface implementInterface=new ImplementInterface();
		//implementInterface.m1(5);
		//implementInterface.m2();
		implementInterface.m1();

	}

}

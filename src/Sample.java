public class Sample {
	
	void load1()
	{
		System.out.println("Inside Sample");
	}
	
	static int a=10;
	static void abc()
	{
		int c=20;
		int d=a+c;
		System.out.println(d);
	}
	
	public static void main(String ar[])
	{
	       int f=Sample.a;
	       System.out.println(f);
	       Sample.abc();
	}

}

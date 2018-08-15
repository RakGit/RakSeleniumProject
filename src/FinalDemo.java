
public  class FinalDemo {

	final int fva=10;
	final void fmethod()
	{
	    int b=fva;
		System.out.println("Inside Final Method");
	}
	
	final void fmethod(int a)
	{
		System.out.println("Final OverLoading...");
	}
	
	
	public static void main(String ar[])
	{
		FinalDemo finalDemo=new FinalDemo();
		finalDemo.fmethod();
		finalDemo.fmethod(10);
	}
}

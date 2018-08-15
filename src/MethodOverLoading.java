
public class MethodOverLoading {
	
	void m1()
	{
		System.out.println("M1"+getClass());
	}
	
	void m1(int a)
	{
		System.out.println("M1 with int parameter"+getClass());
	}
	
	void m1(int a,int b)
	{
		System.out.println("M1 with two int parameter"+getClass());
	}
	
	void m1(String s)
	{
		System.out.println("M1 with String parameter"+getClass());
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverLoading methodOverLoading=new MethodOverLoading();
		methodOverLoading.m1();
		methodOverLoading.m1(5);
		methodOverLoading.m1(5, 6);
		methodOverLoading.m1("abc");

	}

}

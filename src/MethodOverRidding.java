
public class MethodOverRidding extends MethodOverLoading{
	
	void m1()
	{
		System.out.println("M1 "+getClass());
	}
	
	void m1(int a)
	{
		System.out.println("M1 with int parameter "+getClass());
	}
	
	void m1(int a,int b)
	{
		System.out.println("M1 with two int parameter "+getClass());
	}
	
	void m1(String s)
	{
		System.out.println("M1 with String parameter "+getClass());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverRidding obj=new MethodOverRidding();
		obj.m1();
		MethodOverLoading obj1=new MethodOverLoading();
		obj1.m1();
	

	}

}

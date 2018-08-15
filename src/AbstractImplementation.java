public class AbstractImplementation extends  AbstractClassTest 
{
	void interest() {
		System.out.println("interest implementaion");
		
	}
	
	public AbstractImplementation() {
		System.out.println("Abstract Implementation cons");
	}
	
	public static void main(String ar[])
	{
		AbstractImplementation imp=new AbstractImplementation();
		imp.interest();
		imp.interset123(123);
	}
}

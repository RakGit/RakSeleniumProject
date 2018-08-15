
public class ConditionalLoops {
	
	void breakTest()
	{
		for(int i=0;i<10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
	}
	
	void continueTest()
	{
		for(int i=0;i<10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}		
	}
	public static void main(String ar[])
	{
		ConditionalLoops conditionalLoops=new ConditionalLoops();
		conditionalLoops.breakTest();
		System.out.println("Continue");
		conditionalLoops.continueTest();
		
	}

}

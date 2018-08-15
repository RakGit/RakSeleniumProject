package StringHandling;

public class StringTest {
	
	void normalString()
	{
		String s1=new String("Sample");
		//String s2="Sample";
		System.out.println(s1.substring(0,3));
		System.out.println(s1.length());
		System.out.println(s1.indexOf("ple"));	
		System.out.println(s1.charAt(3));
		System.out.println(s1.replace('m', 'A'));
		System.out.println(s1);
	}
	
	void stringBuffer()
	{
		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer.append("Sample");
		stringBuffer.append("Adding data");
		stringBuffer.replace(0, 6, "RAKESH");
		System.out.println(stringBuffer.reverse());
		System.out.println(stringBuffer.reverse());
		System.out.println(stringBuffer.toString());
		
	}
	
	void stringBuilder()
	{
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("Sample");
		
		stringBuilder.append("Adding data");
		stringBuilder.replace(0, 3, "RAK");
		stringBuilder.reverse();
		stringBuilder.reverse();
		System.out.println(stringBuilder.toString());
	}
	
	void stringReverse()
	{
		String reverse="Rakesh";
		String Normal = "";
		for(int i=reverse.length()-1;i>=0;i--)
		{
			Normal=Normal+reverse.charAt(i);
			
		}
		System.out.print(Normal);
		System.out.println();
		
		StringBuilder stringBuilder=new StringBuilder("Naresh");
		stringBuilder.reverse();
		System.out.println(stringBuilder);
	}
	
	
	public static void main(String ar[])
	{
		StringTest stringTest=new StringTest();
		//stringTest.normalString();
		//stringTest.stringBuffer();
		//stringTest.stringBuilder();
		
		stringTest.stringReverse();
	}

}

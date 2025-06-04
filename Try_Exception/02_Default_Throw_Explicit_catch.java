public class Test
{
	public static void main(String args[])
	{
		int a = 10,b=0;
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error happened");
		}
		System.out.println("ALL is well");
	}
}

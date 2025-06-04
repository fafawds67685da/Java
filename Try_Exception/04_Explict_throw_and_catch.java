public class Test
{
	public static void main(String args[])
	{
		int a = 10,b=0;
		try {
			if(b<0)
			{
				throw new ArithmeticException();
			}
			System.out.println(a/b);
			System.out.println("ALL is well");
		}
		
		
		catch(ArithmeticException e)
		{
			System.out.println("Eroror");
		}
		
	}
}

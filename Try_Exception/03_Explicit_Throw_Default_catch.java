public class Test
{
	public static void main(String args[])
	{
		int a = 10,b=10;
			if(b<0)
			{
				throw new ArithmeticException();
			}
			System.out.println(a/b);
		
		System.out.println("ALL is well");
	}
}

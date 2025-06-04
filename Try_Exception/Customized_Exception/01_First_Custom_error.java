public class Test
{
	public static void main(String args[])
	{
		int age = 2;
		try
		{
			if(age<18)
			{
				throw new DevExcept("It worked");
			}
		}
		catch(DevExcept e)
		{
			System.out.println(e);
		}
	}
}
class DevExcept extends Exception
{
	DevExcept(String s)
	{
		super(s);
	}
}

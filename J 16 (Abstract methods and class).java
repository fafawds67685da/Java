abstract class test
{
	public abstract void f1();
	public abstract void f2();
}

class test2 extends test
{
	public void f1()
	{
		System.out.println("Hello");
	}

	public void f2()
	{
		System.out.println(" World");
	}

	public static void main(String args[])
	{
		test2 ob = new test2();
		ob.f1();
		ob.f2();
	}	
}

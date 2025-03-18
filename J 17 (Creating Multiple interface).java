interface I1
{
	public void f1();
}


interface I2
{
	public void f2();
}

class test3 implements I1, I2
{
	public void f1()
	{
		System.out.println("Interface 1");
	}

	public void f2()
	{
		System.out.println("Interface 2");
	}

	public static void main(String args[])
	{
		test3 ob = new test3();
		ob.f1();
		ob.f2();
	}
}
